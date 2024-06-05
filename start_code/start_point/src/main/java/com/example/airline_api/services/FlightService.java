package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.repositories.BookingRepository;
import com.example.airline_api.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FlightService {



    @Autowired
    FlightRepository flightRepository;

    @Autowired
    BookingRepository bookingRepository;


    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    public Optional<Flight> getFlightsById(long id){
        return flightRepository.findById(id);
    }

    public void saveFlight(Flight flight){
        flightRepository.save(flight);
    }

}
