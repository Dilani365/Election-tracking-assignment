package com.example.Election.tracking.assignment.models;


import lombok.Data;

@Data
public class Candidates {

    private String firstName;
    private String lastName;
    private int age;
    private String countyOfBirth;
    private String countyOfCitizen;
    private Address address;
    private PoliticalParty politicalParty;
}
