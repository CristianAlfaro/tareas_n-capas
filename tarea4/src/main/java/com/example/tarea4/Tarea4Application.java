package com.example.tarea4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.tarea4.controller"})
public class Tarea4Application {

	public static void main(String[] args) {
		SpringApplication.run(Tarea4Application.class, args);
	}

}
