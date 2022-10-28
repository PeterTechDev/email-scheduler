package com.petertech.emailScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration("classpath:application-" + "${spring.profiles.active}" + ".properties")
public class EmailSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSchedulerApplication.class, args);
	}

}
