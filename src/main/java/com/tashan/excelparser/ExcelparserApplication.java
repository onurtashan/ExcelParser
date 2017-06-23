package com.tashan.excelparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class}) //MongoDB'nin localhost'a bakmasını kapatıyoruz.
public class ExcelparserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelparserApplication.class, args);
	}
}
