package com.sda.georgeivascu.petclinic.repository;

import com.sda.georgeivascu.petclinic.model.Vet;

import java.util.List;
import java.util.Optional;

public interface VetRepository {

    void createVet(
            String firstName,
            String lastname,
            String adress,
            String speciality);

    List<Vet> getAllVets();

    Optional<Vet> findByid(int id);
}
