package com.assignment.mappingPractice.controller;

import com.assignment.mappingPractice.model.Book;
import com.assignment.mappingPractice.model.Course;
import com.assignment.mappingPractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    CourseService  courseService;


    @GetMapping("course")
    public Iterable<Course> getCourse(){
        return courseService.getCourse();
    }

    @PostMapping("course/add")
    public String postCourse(@RequestBody Course course){
        return courseService.postCourse(course);
    }

    @DeleteMapping("course/delete")
    public String removeCourse(@RequestBody Long id){
        return courseService.removeCourse(id);
    }
    @PutMapping("course/put")
    public String updateCourse(@PathVariable Long id){
        return courseService.updateCourse(id);
    }

}
