package com.brewer.thymeleaf;

import com.brewer.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.brewer.thymeleaf.processor.MenuAttributeTagProcessor;
import com.brewer.thymeleaf.processor.MessageElementTagProcessor;
import com.brewer.thymeleaf.processor.OrderElementTagProcessor;
import com.brewer.thymeleaf.processor.PaginationElementTagProcessor;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import java.util.HashSet;
import java.util.Set;

public class BrewerDialect extends AbstractProcessorDialect{

	public BrewerDialect(){
		super("Brewer Cervejas", "brewer", StandardDialect.PROCESSOR_PRECEDENCE);
	}

	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcessor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		processadores.add(new PaginationElementTagProcessor(dialectPrefix));
		processadores.add(new MenuAttributeTagProcessor(dialectPrefix));
		return processadores;
	}

}
