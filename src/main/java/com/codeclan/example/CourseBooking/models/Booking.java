package com.codeclan.example.CourseBooking.models;

public class Booking {

    private String date;

    public Booking(String date) {
        this.date = date;
    }

    public Booking() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
