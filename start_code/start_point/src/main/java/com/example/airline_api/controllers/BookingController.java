package com.example.airline_api.controllers;

import com.example.airline_api.DTO.BookingDTO;
import com.example.airline_api.models.Booking;
import com.example.airline_api.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/bookings")
public class BookingController {

    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    //  Display all bookings
    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings(){
        List<Booking> bookings = bookingService.getAllBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    // Add details of a new booking
    @PostMapping(value = "/{id}")
    public ResponseEntity<Booking> addNewBooking(@RequestBody BookingDTO bookingDTO){
        Booking booking = bookingService.addNewBooking(bookingDTO);
        return new ResponseEntity<>(booking, HttpStatus.CREATED);
    }

}
