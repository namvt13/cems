package com.cems.beans.beans.db;

import com.cems.beans.ci.beans.SimpleBean;

public class DependentBeanImpl implements DependentBean {
	private SimpleBean simpleBean;

	public DependentBeanImpl(final SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}
}
