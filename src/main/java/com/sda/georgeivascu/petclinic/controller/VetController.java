package com.sda.georgeivascu.petclinic.controller;

import com.sda.georgeivascu.petclinic.service.VetService;

import java.util.Scanner;

public class VetController {
    private final VetService vetService;
    private final Scanner scanner = new Scanner(System.in);

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public void createVet() {
        System.out.println("Please insert vet first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please insert vet last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please insert vet address:");
        String address = scanner.nextLine();
        System.out.println("Please insert vet speciality:");
        String speciality = scanner.nextLine();

        try {
            vetService.createVet(firstName, lastName, address, speciality);
        } catch (IllegalArgumentException e) {
            System.out.println("INVALID DATA: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("!INTERNAL SERVER ERROR!" + e.getMessage());
        }
    }

}
