package com.cems.beans.ci.config;

import com.cems.beans.ci.beans.SimpleBean;
import com.cems.beans.ci.beans.SimpleBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cems.beans.ci.beans")
public class SimpleAppCfg {
	@Bean
	public SimpleBean anotherSimpleBean() {
		return new SimpleBeanImpl();
	}
}
