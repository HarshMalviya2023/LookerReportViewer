package com.gcp.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ReportApplication {

	public static void main(String[] args) {
		System.out.println("before the run ");
		SpringApplication.run(ReportApplication.class, args);
		System.out.println("after the run ");
	}

}
