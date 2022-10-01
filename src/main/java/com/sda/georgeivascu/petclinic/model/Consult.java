package com.sda.georgeivascu.petclinic.model;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="consult")
public class Consult {
    @Id
    @Column(name="id")
    private Integer id;
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

    public Consult(Integer id, Date date, String description) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.vet = vet;
        this.pet = pet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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