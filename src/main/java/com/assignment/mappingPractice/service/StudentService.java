package com.assignment.mappingPractice.service;

import com.assignment.mappingPractice.model.Course;
import com.assignment.mappingPractice.model.Laptop;
import com.assignment.mappingPractice.model.Student;
import com.assignment.mappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    public Iterable<Student> getStudent() {
        return iStudentRepo.findAll();
    }

    public String postStudent(Student student) {
        iStudentRepo.save(student);
        return "added";
    }

    public String removeStudent(Long id) {
        Optional<Student> laptopId= iStudentRepo.findById(id);
        if(laptopId.isPresent()){
            iStudentRepo.deleteById(id);
            return "Remove successfully";
        }
        return "Id not matched";
    }

    public String updateStudent(Long id) {
        return "Not complete";
    }
}
