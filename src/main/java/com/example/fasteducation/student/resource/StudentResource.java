package com.example.fasteducation.student.resource;

import com.example.fasteducation.student.domain.model.entity.Plan;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentResource {

    private Long id;

    private String name;

    private String email;

    private String password;

    private Plan plan;

}
