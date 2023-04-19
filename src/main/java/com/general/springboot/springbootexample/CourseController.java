package com.general.springboot.springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {


    @RequestMapping("/courses")
    public List<Course> getAllCourses()
    {
        return Arrays.asList(
                new Course(1, "Learn Java", "Beginner Course"),
                new Course(2, "Learn Python", "Beginner Course")
        );
    }
}
