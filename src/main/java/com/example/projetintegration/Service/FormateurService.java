package com.example.projetintegration.Service;

import com.example.projetintegration.Entity.Formateur;
import com.example.projetintegration.Repository.FormateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FormateurService {

    @Autowired
    private FormateurRepository formateurRepository;

    public Formateur ajouterFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    public List<Formateur> afficherTous() {
        return formateurRepository.findAll();
    }

    public Formateur afficherParId(Long id) {
        return formateurRepository.findById(id).orElse(null);
    }

    public Formateur modifierFormateur(Long id, Formateur nouveau) {
        Formateur f = formateurRepository.findById(id).orElse(null);
        if (f != null) {
            f.setEmail(nouveau.getEmail());
            f.setPassword(nouveau.getPassword());
            return formateurRepository.save(f);
        }
        return null;
    }

    public void supprimerFormateur(Long id) {
        formateurRepository.deleteById(id);
    }
}
