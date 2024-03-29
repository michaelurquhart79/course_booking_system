package com.codeclan.example.CourseBooking.controllers;


import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCoursesByRating(@PathVariable int rating) {
        return courseRepository.findCourseByRating(rating);
    }

    @GetMapping(value = "/customers/{courseid}")
    public List<Customer> getCustomersByCourseID(@PathVariable Long courseid) {
        return customerRepository.findCustomersByCourse(courseid);
    }





}
