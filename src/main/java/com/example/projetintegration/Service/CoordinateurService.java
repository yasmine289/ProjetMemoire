package com.example.projetintegration.Service;

import com.example.projetintegration.Entity.Coordinateur;
import com.example.projetintegration.Repository.CoordinateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CoordinateurService {

    @Autowired
    private CoordinateurRepository coordinateurRepository;

    public Coordinateur ajouterCoordinateur(Coordinateur coordinateur) {
        return coordinateurRepository.save(coordinateur);
    }

    public List<Coordinateur> afficherTous() {
        return coordinateurRepository.findAll();
    }

    public Coordinateur afficherParId(Long id) {
        return coordinateurRepository.findById(id).orElse(null);
    }

    public Coordinateur modifierCoordinateur(Long id, Coordinateur nouveau) {
        Coordinateur c = coordinateurRepository.findById(id).orElse(null);
        if (c != null) {
            c.setNom(nouveau.getNom());
            c.setPrenom(nouveau.getPrenom());
            c.setCin(nouveau.getCin());
            c.setRib(nouveau.getRib());
            c.setBanque(nouveau.getBanque());
            return coordinateurRepository.save(c);
        }
        return null;
    }

    public void supprimerCoordinateur(Long id) {
        coordinateurRepository.deleteById(id);
    }
}
