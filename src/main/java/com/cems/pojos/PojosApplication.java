package com.cems.pojos;

import com.cems.dao.Detective;
import com.cems.pojos.services.DetectiveService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PojosApplication {
	public static void main(String[] args) {
		SpringApplication.run(PojosApplication.class, args);
	}
}
