package com.example.projetintegration.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Coordinateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idC;

    private String nom;
    private String prenom;
    private String cin;
    private String rib;
    private String banque;

    // Un coordinateur peut gérer plusieurs sessions
    @OneToMany(mappedBy = "coordinateur", cascade = CascadeType.ALL)
    private List<Session> sessions;

    // --- Getters & Setters ---
    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
