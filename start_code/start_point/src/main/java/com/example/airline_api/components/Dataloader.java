package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.services.FlightService;
import com.example.airline_api.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    FlightService flightService;

    @Autowired
    PassengerService passengerService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Flight london = new Flight("LDN", 50, "14/04/2024", "13:13:13");
        flightService.addNewFlight(london);

        Flight miami = new Flight("MMI", 100, "12/09/2024", "00:45:00");
        flightService.addNewFlight(miami);

        Passenger dena = new Passenger("Dena", "denashirani@gmail.com");
        passengerService.addNewPassenger(dena);

        Passenger cat = new Passenger("Cat", "meowmeow@gmail.com");
        passengerService.addNewPassenger(cat);

    }
}