package edu.pe.cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudJpaApplication.class, args);
		System.out.print("Hola Mundo");
	}

}
