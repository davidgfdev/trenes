package com.sinensia.railes.trenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.sinensia.railes.model")
@EnableJpaRepositories(basePackages = "com.sinensia.railes.dao")
@SpringBootApplication(scanBasePackages = {"com.sinensia.railes.controller", "com.sinensia.railes.service"})
public class TrenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrenesApplication.class, args);
	}
}
