package com.example.projetintegration.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormateur;

    private String nom;
    private String prenom;
    private String cin;
    private String rib;
    private String banque;
    private String email;
    private String password;

    @OneToMany(mappedBy = "formateur", cascade = CascadeType.ALL)
    private List<Session> sessions;

    public Long getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(Long idFormateur) {
        this.idFormateur = idFormateur;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
