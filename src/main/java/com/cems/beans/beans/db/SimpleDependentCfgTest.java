package com.cems.beans.beans.db;

import com.cems.beans.ci.beans.SimpleBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleDependentCfgTest {
	@Test
	void testSimpleBeans() {
		final ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleDependentCfg.class);
		ctx.registerShutdownHook(); // Setup to auto close this context when done

		// Get the SimpleDependentCfg bean, configuration itself is also a bean
		final SimpleDependentCfg simpleDependentCfg = ctx.getBean(SimpleDependentCfg.class);
		Assertions.assertNotNull(simpleDependentCfg);

		// We can get the bean from calling the cfg bean
		final SimpleBean simpleBean = simpleDependentCfg.simpleBean();
		Assertions.assertNotNull(simpleBean);
	}
}
