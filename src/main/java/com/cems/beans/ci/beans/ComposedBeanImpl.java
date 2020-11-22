package com.cems.beans.ci.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComposedBeanImpl implements ComposedBean {
	private SimpleBean simpleBean;
	private String code;
	private boolean complicated;

	@Autowired // Put the priority bean name to Qualifier, defaults to prioritze the one with same name as the parameter
	public ComposedBeanImpl(
			@Qualifier("anotherSimpleBean") final SimpleBean simpleBean, @Value("AB123") final String code,
			@Value("true") final boolean complicated) {
		this.simpleBean = simpleBean;
		this.code = code;
		this.complicated = complicated;
	}

	public SimpleBean getSimpleBean() {
		return simpleBean;
	}

	public String getCode() {
		return code;
	}

	public boolean isComplicated() {
		return complicated;
	}
}
