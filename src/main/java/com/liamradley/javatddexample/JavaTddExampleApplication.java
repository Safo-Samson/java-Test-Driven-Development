package com.liamradley.javatddexample;

import lombok.extern.flogger.Flogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTddExampleApplication {

	public static void main(String[] args) {
		System.out.println("You shouldn't have got here! Go run the test class!");
	}

}
