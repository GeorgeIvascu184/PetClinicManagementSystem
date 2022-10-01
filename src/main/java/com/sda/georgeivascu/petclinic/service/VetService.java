package com.sda.georgeivascu.petclinic.service;

public interface VetService {

    void createVet(
            String firstName,
            String lastname,
            String adress,
            String speciality
    );
}
