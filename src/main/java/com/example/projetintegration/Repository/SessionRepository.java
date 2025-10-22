package com.example.projetintegration.Repository;

import com.example.projetintegration.Entity.Formateur;
import com.example.projetintegration.Entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    List<Session> findByFormateur(Formateur formateur);



}
