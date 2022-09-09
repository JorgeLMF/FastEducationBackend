package com.example.fasteducation.student.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("studentMappingConfiguration")

public class MappingConfiguration {
    @Bean
    public StudentMapper studentMapper(){
        return new StudentMapper();
    }
}
