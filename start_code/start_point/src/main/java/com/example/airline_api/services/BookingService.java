package com.example.airline_api.services;

import com.example.airline_api.DTO.BookingDTO;
import com.example.airline_api.models.Booking;
import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.BookingRepository;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {


    @Autowired
    FlightRepository flightRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking addNewBooking(BookingDTO bookingDTO) {
        Flight flight = flightRepository.findById(bookingDTO.getFlightId()).get();
        Passenger passenger = passengerRepository.findById(bookingDTO.getPassengerId()).get();
        int seatNumber = 0;

        Booking booking = new Booking(flight, passenger, seatNumber);
        return bookingRepository.save(booking);


    }


}
