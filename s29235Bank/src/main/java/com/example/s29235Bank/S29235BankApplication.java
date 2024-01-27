package com.example.s29235Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S29235BankApplication {
	private final ClientBase clientBase;
	private final Service service;

	public S29235BankApplication(ClientBase clientBase, Service service) {
		this.clientBase = clientBase;
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(S29235BankApplication.class, args);
	}

}
