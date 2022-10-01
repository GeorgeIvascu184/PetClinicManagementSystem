package com.sda.georgeivascu.petclinic.model;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="consult")
public class Consult {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="date")
    private Date date;
    @Column (name="description")
    private String description;

    //Foreign key, parte reala, fara existenta ei nu poti sa vorbesti de partea de relatii
    @ManyToOne
    @JoinColumn (name = "vet_id") // mereu definit
    private Vet vet;// fara vet asta nu puteam sa fac in Pet oneToMany

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;

    public Consult(){

    }

    public Consult(int id, Date date, String description) {
        this.id = id;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    @Override
    public String toString() {
        return "Consult{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}