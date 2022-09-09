package com.example.fasteducation.student.resource;

import com.example.fasteducation.student.domain.model.entity.Plan;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter

public class UpdateStudentResource {
    @NotNull
    @NotBlank
    @Size(max = 50)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 50)
    private String email;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 30)
    private String password;

    @NotNull
    private Plan plan;
}
