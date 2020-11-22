package com.cems.simple;

import com.cems.beans.ci.beans.SimpleBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OneSimpleConfigTest {
	@Test
	public void testOneBeanConfiguration() {
		// Load the annotation config Java file
		final ApplicationContext ctx = new AnnotationConfigApplicationContext(OneBeanConfig.class);

		// Get a bean from Spring using its class (Default to singleton pattern)
		final SimpleBean simpleBeanOne = ctx.getBean(SimpleBean.class);
		final SimpleBean simpleBeanTwo = ctx.getBean(SimpleBean.class);
		// Singleton pattern is enabled by default, both of these simple beans refer to just one instance of the SimpleBean class
		Assertions.assertEquals(simpleBeanOne, simpleBeanTwo);
	}
}
