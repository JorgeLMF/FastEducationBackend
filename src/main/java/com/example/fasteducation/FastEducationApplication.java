package com.example.fasteducation;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@OpenAPIDefinition
@EnableJpaAuditing
@SpringBootApplication
public class FastEducationApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastEducationApplication.class, args);
    }

}
