package com.jbk.hibernateintegrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan("com.jbk.hibernateintegrator")
public class HibernateintegratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateintegratorApplication.class, args);
	}

}
