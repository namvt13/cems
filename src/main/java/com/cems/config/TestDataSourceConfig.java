package com.cems.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:db/test-datasource.properties")
// Get the properties file from the project's resource directory
// Use the annotation @Value to get value from this properties file
// Like getting data from a config file based on its environment (UAT or Prod)
public class TestDataSourceConfig {
	// Get the key db.driverClassName from the properties file
	@Value("${db.driverClassName}")
	private String driverClassName;
	// ${} must be used, else the string value will fill the variable literally
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		// This must be return so we can replace the property source placeholder in @Value and pass value from the properties file to it
		// Static bean will be initialized sooner than the configuration bean itself, as this must be initialized first in order for us to use property source @Value
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public DataSource dataSource() {
		// Create a db jdbc manager, and pass on the authentication data
		final DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driverClassName); // Name of the driver used to connect to the db
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
}
