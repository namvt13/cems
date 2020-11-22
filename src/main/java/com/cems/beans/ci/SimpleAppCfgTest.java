package com.cems.beans.ci;

import com.cems.beans.ci.beans.ComposedBean;
import com.cems.beans.ci.beans.SimpleBean;
import com.cems.beans.ci.beans.SimpleBeanImpl;
import com.cems.beans.ci.config.SimpleAppCfg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleAppCfgTest {
	private Logger logger = LoggerFactory.getLogger(SimpleAppCfgTest.class);

	@Test
	public void testBeanNames() {
		// Bean nameing priority: Java configuration method name -> @Component bean name -> Bean Java class name
		final ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleAppCfg.class);
		final SimpleBean simpleBean = ctx.getBean("simple", SimpleBean.class);
		Assertions.assertNotNull(simpleBean);
		Assertions.assertTrue(simpleBean instanceof SimpleBeanImpl);

		// Get list of bean names and prints it out
		final ApplicationContext ctx2 = new AnnotationConfigApplicationContext(SimpleAppCfg.class);
		for (final String beanName : ctx2.getBeanDefinitionNames()) {
			logger.info("Bean " + beanName + " of type " + ctx2.getBean(beanName).getClass().getSimpleName());
			// .getSimpleName() get you only the class name and none of the path bs
		}
	}

	@Test
	public void testSimpleBeans() {
		final ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleAppCfg.class);

		final ComposedBean composedBean = ctx.getBean(ComposedBean.class);
		Assertions.assertNotNull(composedBean);
		ctx.close();
	}
}
