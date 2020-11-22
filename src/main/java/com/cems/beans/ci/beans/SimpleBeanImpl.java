package com.cems.beans.ci.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("simple")
public class SimpleBeanImpl implements SimpleBean {
	private Logger logger = LoggerFactory.getLogger(SimpleBeanImpl.class);

	public SimpleBeanImpl() {
		// Log when this class is first instatiated
		logger.info("[SimpleBeanImpl Instantiation]");
	}

	@Override
	public String toString() {
		return "SimpleBeanImpl{ code: " + hashCode() + "}";
	}
}
