package com.example.fasteducation.student.mapping;

import com.example.fasteducation.shared.mapping.EnhancedModelMapper;
import com.example.fasteducation.student.domain.model.entity.Student;
import com.example.fasteducation.student.resource.CreateStudentResource;
import com.example.fasteducation.student.resource.StudentResource;
import com.example.fasteducation.student.resource.UpdateStudentResource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class StudentMapper {

    @Autowired
    private EnhancedModelMapper mapper;

    public List<StudentResource> toResource(List<Student> model){
        return mapper.mapList(model, StudentResource.class);
    }

    public StudentResource toResource(Student model){
       return mapper.map(model, StudentResource.class);
    }

    public Student toModel(CreateStudentResource resource){
        return mapper.map(resource, Student.class);
    }

    public Student toModel(StudentResource resource){
        return mapper.map(resource, Student.class);
    }

    public Student toModel(UpdateStudentResource resource){
        return mapper.map(resource, Student.class);
    }
}
