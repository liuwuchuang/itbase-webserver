package com.itbase.webserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value={"com.itbase.jdbc","com.itbase.business","com.itbase.webserver"})
@SpringBootApplication
public class ItbaseWebserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItbaseWebserverApplication.class, args);
	}
}
