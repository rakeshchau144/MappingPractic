package com.assignment.mappingPractice.controller;

import com.assignment.mappingPractice.model.Course;
import com.assignment.mappingPractice.model.Student;
import com.assignment.mappingPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("service")
    public Iterable<Student> getStudent(){
        return studentService.getStudent();
    }

    @PostMapping("service/add")
    public String postStudent(@RequestBody Student student){
        return studentService.postStudent(student);
    }

    @DeleteMapping("service/delete")
    public String removeStudent(@RequestBody Long id){
        return studentService.removeStudent(id);
    }
    @PutMapping("service/put")
    public String updateStudent(@PathVariable Long id){
        return studentService.updateStudent(id);
    }

}
