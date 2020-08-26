package org.springflow;

import org.springflow.config.AppDispatcherServletConfiguration;
import org.springflow.config.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Import({
		ApplicationConfiguration.class,
		AppDispatcherServletConfiguration.class
})
@EnableTransactionManagement
@ComponentScan(basePackages = {"org.springflow"})
public class SpringflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringflowApplication.class, args);
	}

}
