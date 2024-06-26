package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.repositories.BookingRepository;
import com.example.airline_api.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {



    @Autowired
    FlightRepository flightRepository;

    @Autowired
    BookingRepository bookingRepository;


    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    public Flight getFlightsById(Long id){
        return flightRepository.findById(id).get();
    }

    public void saveFlight(Flight flight){
        flightRepository.save(flight);
    }
    public Flight addNewFlight(Flight flight) {
        flightRepository.save(flight);
        return flight;
    }
}
