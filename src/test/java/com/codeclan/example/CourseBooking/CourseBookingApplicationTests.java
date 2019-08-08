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

import java.util.List;

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

//	@Test
//	public void canCreateCourseAndBooking(){
//		course = new Course("Intro to Python", "Edinburgh", 2);
//		booking = new Booking("15-09-19", course);
//		assertEquals("15-09-19", booking.getDate());
//	}

	@Test
	public void canSaveCourse() {
		course = new Course("Intro to Python", "Edinburgh", 2);
		courseRepository.save(course);
	}

	@Test
	public void canSaveBooking(){
		course = new Course("Intro to Python", "Edinburgh", 2);
		courseRepository.save(course);
		customer = new Customer("Bob", "Brechin", 25);
		customerRepository.save(customer);
		booking = new Booking("15-09-19", course, customer);
		bookingRepository.save(booking);
	}

	@Test
	public void canSaveCustomer(){
		customer = new Customer("Bob", "Dundee", 23);
		customerRepository.save(customer);
	}

	@Test
	public void canFindCoursesByRating() {
		List<Course> found = courseRepository.findCourseByRating(3);
		assertEquals("Software Development", found.get(0).getName());
		assertEquals("Data Entry", found.get(1).getName());
	}

	@Test
	public void canFindCustomersByCourse(){
		List<Customer> found = customerRepository.findCustomersByCourse(new Long(2));
	}

}
