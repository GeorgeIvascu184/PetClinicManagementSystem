package com.sda.georgeivascu.petclinic.repository;

public interface VetRepository {

    void createVet(
            String firstName,
            String lastname,
            String adress,
            String speciality);
}
