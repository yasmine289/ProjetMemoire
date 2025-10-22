package com.example.projetintegration.Service;

import com.example.projetintegration.Entity.Session;
import com.example.projetintegration.Entity.Formateur;
import com.example.projetintegration.Repository.SessionRepository;
import com.example.projetintegration.Repository.FormateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private FormateurRepository formateurRepository;
    public Session ajouterSession(Session session) {
        return sessionRepository.save(session);
    }

    public List<Session> afficherToutes() {
        return sessionRepository.findAll();
    }

   public Session afficherParId(Long id) {
        return sessionRepository.findById(id).orElse(null);
    }

    public Session modifierSession(Long id, Session nouvelle) {
        Session s = sessionRepository.findById(id).orElse(null);
        if (s != null) {
            s.setClasse(nouvelle.getClasse());
            s.setSpecialite(nouvelle.getSpecialite());
            s.setPromotion(nouvelle.getPromotion());
            s.setNiveau(nouvelle.getNiveau());
            s.setSemestre(nouvelle.getSemestre());
            s.setDateDebut(nouvelle.getDateDebut());
            s.setDateFin(nouvelle.getDateFin());
            return sessionRepository.save(s);
        }
        return null;
    }

    public void supprimerSession(Long id) {
        sessionRepository.deleteById(id);
    }

    public Session affecterFormateur(Long idSession, Long idFormateur) {
        Session s = sessionRepository.findById(idSession).orElse(null);
        Formateur f = formateurRepository.findById(idFormateur).orElse(null);
        if (s != null && f != null) {
            s.setFormateur(f);
            return sessionRepository.save(s);
        }
        return null;
    }

    public List<Session> sessionsParFormateur(Long idFormateur) {
        Formateur f = formateurRepository.findById(idFormateur).orElse(null);
        return (f != null) ? sessionRepository.findByFormateur(f) : null;
    }
}
