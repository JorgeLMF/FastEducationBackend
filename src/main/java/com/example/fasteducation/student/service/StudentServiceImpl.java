package com.example.fasteducation.student.service;

import com.example.fasteducation.shared.exception.ResourceNotFoundException;
import com.example.fasteducation.student.domain.model.entity.Student;
import com.example.fasteducation.student.domain.persistence.StudentRepository;
import com.example.fasteducation.student.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {

    private final static String ENTITY = "Student";

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Long studentId) {
        return studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException(ENTITY, studentId));
    }

    @Override
    public Student create(Student request) {
        return studentRepository.save(request);
    }

    @Override
    public Student update(Long studentId, Student request) {
        return studentRepository.findById(studentId).map(student ->
                studentRepository.save(
                        student.withName(request.getName())
                                .withEmail(request.getEmail())
                                .withPassword(request.getPassword())
                                .withPlan(request.getPlan())))
                .orElseThrow(() -> new ResourceNotFoundException(ENTITY, studentId));
    }
}
