package com.example.airline_api.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String name;

    @Column (name = "email")
    private String email;

    @OneToMany(mappedBy = "passenger")
    @JsonIgnoreProperties({"passenger"}) //json ignore so we dont have to keep seeing every booking that every passenger has etc
    private List<Booking> bookings;


    public Passenger(String name, String email) {
        this.name = name;
        this.email = email;
        this.bookings = new ArrayList<>();
    }

    public Passenger() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Booking> getFlights() {
        return bookings;
    }

    public void setFlights(List<Booking> flights) {
        this.bookings = flights;
    }
}
