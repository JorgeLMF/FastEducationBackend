package com.example.fasteducation.student.domain.service;

import com.example.fasteducation.student.domain.model.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    Student getById(Long studentId);

    Student create(Student request);

    Student update(Long studentId, Student request);
}
