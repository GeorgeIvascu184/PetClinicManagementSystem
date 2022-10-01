package com.sda.georgeivascu.petclinic.service;

import com.sda.georgeivascu.petclinic.repository.VetRepository;

public class VetServiceImpl implements VetService {
    private final VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }


    @Override
    public void createVet(String firstName, String lastname, String adress, String speciality) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First Name is INVALID");

        }
        if (adress == null || adress.isBlank()) {
            throw new IllegalArgumentException("Adress is INVALID");
        }
        if (speciality == null || speciality.isBlank()) {
            throw new IllegalArgumentException("Speciality is INVALID");
        }
        vetRepository.createVet(firstName, lastname, adress, speciality);

    }
}

