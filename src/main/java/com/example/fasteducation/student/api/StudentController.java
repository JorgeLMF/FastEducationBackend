package com.example.fasteducation.student.api;

import com.example.fasteducation.student.domain.service.StudentService;
import com.example.fasteducation.student.mapping.StudentMapper;
import com.example.fasteducation.student.resource.CreateStudentResource;
import com.example.fasteducation.student.resource.StudentResource;
import com.example.fasteducation.student.resource.UpdateStudentResource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Student")
@RestController
@RequestMapping("/api/v1/students")
@CrossOrigin

public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @Operation(summary = "get students", description = "get all students")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "students found"),
            @ApiResponse(responseCode = "400",description = "students not found") })
    @GetMapping
    public List<StudentResource> getallstudents(){
        return studentMapper.toResource(studentService.getAll());
    }

    @Operation(summary = "get student by id", description = "get student by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "student found"),
            @ApiResponse(responseCode = "400",description = "student not found") })
    @GetMapping("{id}")
    public StudentResource getstudentbyid(@PathVariable Long id){
        return studentMapper.toResource(studentService.getById(id));
    }

    @Operation(summary = "create student", description = "create student")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "student was created"),
            @ApiResponse(responseCode = "400",description = "student was not created") })
    @PostMapping
    public StudentResource createstudent(@RequestBody CreateStudentResource request){
        return studentMapper.toResource(studentService.create(studentMapper.toModel(request)));
    }

    @Operation(summary = "update student", description = "update student")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "student was updated"),
            @ApiResponse(responseCode = "400",description = "student was not updated") })
    @PutMapping("{studentId}")
    public StudentResource updatestudent(@PathVariable Long studentId, @RequestBody UpdateStudentResource request){
        return studentMapper.toResource(studentService.update(studentId, studentMapper.toModel(request)));
    }


}
