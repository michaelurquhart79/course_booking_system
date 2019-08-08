package com.codeclan.example.CourseBooking.repositories.CustomerRepository;

import com.codeclan.example.CourseBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomersByCourse(Long id);
}
