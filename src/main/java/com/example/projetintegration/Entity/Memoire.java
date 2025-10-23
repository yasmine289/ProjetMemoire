package com.example.projetintegration.Entity;

import jakarta.persistence.*;

@Entity
public class Memoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMemoire;

    private String type;
    private double montantB;
    private double retenue;
    private double montantN;

    // --- Relation ---
    @OneToOne
    @JoinColumn(name = "session_id")
    private Session session;

    // --- Getters & Setters ---
    public Long getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(Long idMemoire) {
        this.idMemoire = idMemoire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMontantB() {
        return montantB;
    }

    public void setMontantB(double montantB) {
        this.montantB = montantB;
    }

    public double getRetenue() {
        return retenue;
    }

    public void setRetenue(double retenue) {
        this.retenue = retenue;
    }

    public double getMontantN() {
        return montantN;
    }

    public void setMontantN(double montantN) {
        this.montantN = montantN;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
