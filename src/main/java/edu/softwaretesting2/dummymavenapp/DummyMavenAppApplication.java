package edu.softwaretesting2.dummymavenapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyMavenAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyMavenAppApplication.class, args);
		System.out.println("Hello World!");
	}

}
