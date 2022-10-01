package com.sda.georgeivascu.petclinic.repository;

import com.sda.georgeivascu.petclinic.model.Vet;
import com.sda.georgeivascu.petclinic.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VetRepositoryImpl implements VetRepository {

    @Override
    public void createVet(String firstName, String lastname, String adress, String speciality) {
        Transaction transaction = null;
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Vet vet = new Vet();
            vet.setFirstName(firstName);
            vet.setLastName(lastname);
            vet.setAddress(adress);
            vet.setSpeciality(speciality);
            session.save(vet);
            transaction.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
