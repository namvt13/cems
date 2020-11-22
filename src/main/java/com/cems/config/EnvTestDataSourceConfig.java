package com.cems.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@PropertySource("classpath:db/test-datasource.properties")
// Testing the evrionment bean
public class EnvTestDataSourceConfig {
	@Autowired
	private Environment environment;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public DataSource dataSource() {
		// Assumes the db authentication data has already put into the Environment
		// All key-value from any properties file once required by
		// a property source annotation will be pushed into the Environment bean
		final DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(Objects.requireNonNull(environment.getProperty("db.driverClassName")));
		ds.setUrl(environment.getProperty("db.url"));
		ds.setUsername(environment.getProperty("db.username"));
		ds.setPassword(environment.getProperty("db.password"));
		return ds;
	}
}
