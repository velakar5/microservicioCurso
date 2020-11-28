package com.formacionbdi.microservicios.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CommonsMicroserviciosCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonsMicroserviciosCursosApplication.class, args);
	}

}
