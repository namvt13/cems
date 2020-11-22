package com.cems.beans.db;

import com.cems.beans.beans.db.DependentBean;
import com.cems.beans.beans.db.DependentBeanImpl;
import com.cems.beans.ci.beans.SimpleBean;
import com.cems.beans.ci.beans.SimpleBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class SimpleDependentCfg {
	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBeanImpl();
	}

	@Bean
	@Description("This bean depends on 'simpleBean'")
	public DependentBean dependentBean() {
		return new DependentBeanImpl(simpleBean());
	}
}
