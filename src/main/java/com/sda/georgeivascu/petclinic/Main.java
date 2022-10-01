package com.sda.georgeivascu.petclinic;

import com.sda.georgeivascu.petclinic.controller.VetController;
import com.sda.georgeivascu.petclinic.repository.VetRepositoryImpl;
import com.sda.georgeivascu.petclinic.service.VetServiceImpl;

public class Main {
    public static void main(String[] args) {
        VetController vetController = new VetController(new VetServiceImpl(new VetRepositoryImpl()));
        vetController.createVet();

    }
}

