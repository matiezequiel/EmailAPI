package com.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
//@EnableScheduling
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		    SpringApplication app = new SpringApplication(Application.class);
            app.run(args);
	}

}
