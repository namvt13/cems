package com.cems.beans.naming;

import com.cems.beans.ci.beans.SimpleBean;
import com.cems.beans.ci.beans.SimpleBeanImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AliasesCfgTest {
	private Logger logger = LoggerFactory.getLogger(AliasesCfg.class);

	@Test
	public void testSimpleBeans() {
		final ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AliasesCfg.class);

		final SimpleBean simpleBean = ctx.getBean("beanOne", SimpleBean.class);
		Assertions.assertNotNull(simpleBean);
		Assertions.assertTrue(simpleBean instanceof SimpleBeanImpl);

		final SimpleBean simpleBean2 = ctx.getBean("beanTwo", SimpleBean.class);
		Assertions.assertEquals(simpleBean2, simpleBean);

		// No bean named 'simpleBean'
		Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
			ctx.getBean("simpleBean", SimpleBean.class);
		});

		ctx.close();
	}
}
