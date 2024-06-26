package com.example.airline_api.services;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.BookingRepository;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;

    public List<Passenger> getAllPassengers(){
        return passengerRepository.findAll();

    }

    public Passenger getPassengerById(Long id){
        return passengerRepository.findById(id).get(); //.get to get passenger
    }

    public Passenger addNewPassenger (Passenger passenger){
        return passengerRepository.save(passenger);
    }
}
