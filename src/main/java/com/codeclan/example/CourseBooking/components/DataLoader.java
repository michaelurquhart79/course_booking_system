package com.codeclan.example.CourseBooking.components;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBooking.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Bob", "Brechin", 20);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("John", "Glasgow", 24);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Jamie", "Livingston", 30);
        customerRepository.save(customer3);

        Course course1 = new Course("Software Development", "Edinburgh", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Data Science", "Glasgow", 4);
        courseRepository.save(course2);

        Course course3 = new Course("Data Entry", "Inverness", 3);
        courseRepository.save(course3);

        Booking booking1 = new Booking("07-08-19", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking( "15-08-19", course2, customer3);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking( "03-01-20", course3, customer2);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking( "03-01-20", course3, customer3);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking( "15-08-19", course2, customer1);
        bookingRepository.save(booking5);


    }


}
