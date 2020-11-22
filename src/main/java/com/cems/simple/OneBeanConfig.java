package com.cems.simple;

import com.cems.beans.ci.beans.SimpleBean;
import com.cems.beans.ci.beans.SimpleBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OneBeanConfig {
	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBeanImpl();
	}
}
