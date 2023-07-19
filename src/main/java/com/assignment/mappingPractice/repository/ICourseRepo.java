package com.assignment.mappingPractice.repository;

import com.assignment.mappingPractice.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends CrudRepository<Course, Long> {
}
