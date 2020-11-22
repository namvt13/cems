package com.cems.beans.ci.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Enable package components only for the package 'simple' and it subpackages
@ComponentScan(basePackages = { "com.cems.simple" })
public class SimpleConfig {
}
