package com.cems.beans.beans.db;

import com.cems.beans.ci.beans.SimpleBean;
import com.cems.beans.ci.beans.SimpleBeanImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleDependentCfg {
	private Logger logger = LoggerFactory.getLogger(SimpleDependentCfg.class);

	@Bean
	public SimpleBean simpleBean() {
		logger.info("---> Creating 'simpleBean'");
		return new SimpleBeanImpl();
	}

	@Bean
	public DependentBean dependentBean() {
		return new DependentBeanImpl(simpleBean());
	}
}
