package com.cems.beans.naming;

import com.cems.beans.ci.beans.SimpleBean;
import com.cems.beans.ci.beans.SimpleBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AliasesCfg {
	@Bean(name = { "beanOne", "beanTwo" })
	public SimpleBean simpleBean() {
		return new SimpleBeanImpl();
	}
}
