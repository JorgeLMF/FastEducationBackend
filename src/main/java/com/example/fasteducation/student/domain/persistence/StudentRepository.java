package com.example.fasteducation.student.domain.persistence;

import com.example.fasteducation.student.domain.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository <Student,Long> {

}
