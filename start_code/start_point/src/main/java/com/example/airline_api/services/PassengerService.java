package com.example.airline_api.services;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.BookingRepository;
import com.example.airline_api.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PassengerService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    BookingRepository bookingRepository;


    public List<Passenger> getAll

}
