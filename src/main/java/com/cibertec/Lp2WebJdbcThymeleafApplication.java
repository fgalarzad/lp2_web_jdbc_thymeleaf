package com.cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
public class Lp2WebJdbcThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lp2WebJdbcThymeleafApplication.class, args);
	}

}
