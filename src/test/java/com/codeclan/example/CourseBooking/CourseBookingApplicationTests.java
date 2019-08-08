package com.codeclan.example.CourseBooking;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingApplicationTests {

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
	public void canCreateBooking(){
		booking = new Booking("15-09-19");
		assertEquals("15-09-19", booking.getDate());
	}

}
