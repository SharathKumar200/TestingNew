package com.example.Emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pgm1 implements CommandLineRunner {

	@Autowired
	private GoldCustomer goldCustomer;

	public static void main(String[] args) {
		SpringApplication.run(Pgm1.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(goldCustomer.getCustomerDetails());
		System.out.println(goldCustomer);
	}
}
