package com.trayanus.crudrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudrestApplication.class, args);
	}

}
