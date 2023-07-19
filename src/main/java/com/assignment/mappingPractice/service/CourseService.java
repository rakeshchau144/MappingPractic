package com.assignment.mappingPractice.service;

import com.assignment.mappingPractice.model.Book;
import com.assignment.mappingPractice.model.Course;
import com.assignment.mappingPractice.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;
    public Iterable<Course> getCourse() {
        return iCourseRepo.findAll();
    }

    public String removeCourse(Long id) {
        Optional<Course> courseId= iCourseRepo.findById(id);
        if(courseId.isPresent()){
            iCourseRepo.deleteById(id);
            return "Remove successfully";
        }
        return "Id not matched";
    }
    public String postCourse(Course course) {
        iCourseRepo.save(course);
        return "Added Course ";
    }

    public String updateCourse(Long id) {
        return "Not complete";
    }
}
