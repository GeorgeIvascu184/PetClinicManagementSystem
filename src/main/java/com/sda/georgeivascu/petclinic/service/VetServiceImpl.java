package com.sda.georgeivascu.petclinic.service;

import com.sda.georgeivascu.petclinic.model.Vet;
import com.sda.georgeivascu.petclinic.repository.VetRepository;
import java.util.List;
import java.util.Optional;

public class VetServiceImpl implements VetService {
    private final VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public void createVet(String firstName, String lastName, String address, String speciality) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First Name is INVALID");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last Name is INVALID");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address is INVALID");
        }
        if (speciality == null || speciality.isBlank()) {
            throw new IllegalArgumentException("Speciality is INVALID");
        }
        vetRepository.createVet(firstName, lastName, address, speciality);
    }
    public List<Vet> getAllVets(){
        return vetRepository.getAllVets();
    }

    @Override
    public Optional<Vet> findById(int id) {
        return vetRepository.findByid(id);
    }

    @Override
    public void updateVetById(int id, String firstname, String lastname, String address, String speciality) {

    }
}


