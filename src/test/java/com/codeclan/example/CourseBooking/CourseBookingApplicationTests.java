package com.codeclan.example.CourseBooking;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBooking.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBooking.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	Course course;
	Customer customer;
	Booking booking;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateCourse() {
		course = new Course("Intro to Python", "Edinburgh", 2);
	}

	@Test
	public void canCreateCustomer() {
		customer = new Customer("Dave", "Sterling", 30);
		assertEquals("Dave", customer.getName());
	}

	@Test
	public void canCreateCourseAndBooking(){
		course = new Course("Intro to Python", "Edinburgh", 2);
		booking = new Booking("15-09-19", course);
		assertEquals("15-09-19", booking.getDate());
	}

	@Test
	public void canSaveCourse() {
		course = new Course("Intro to Python", "Edinburgh", 2);
		courseRepository.save(course);
	}

	@Test
	public void canSaveCourseAndBooking(){
		course = new Course("Intro to Python", "Edinburgh", 2);
		courseRepository.save(course);
		booking = new Booking("15-09-19", course);
		bookingRepository.save(booking);
	}

}
