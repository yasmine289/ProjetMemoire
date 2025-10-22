package com.example.projetintegration.Controller;

import com.example.projetintegration.Entity.Formateur;
import com.example.projetintegration.Service.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/formateurs")
@CrossOrigin(origins = "http://localhost:3000")
public class FormateurController {

    @Autowired
    private FormateurService formateurService;

    @PostMapping("/add")
    public Formateur ajouterFormateur(@RequestBody Formateur formateur) {
        return formateurService.ajouterFormateur(formateur);
    }

    @GetMapping("/all")
    public List<Formateur> afficherTous() {
        return formateurService.afficherTous();
    }

    @GetMapping("/{id}")
    public Formateur afficherParId(@PathVariable Long id) {
        return formateurService.afficherParId(id);
    }

    @PutMapping("/update/{id}")
    public Formateur modifierFormateur(@PathVariable Long id, @RequestBody Formateur nouveau) {
        return formateurService.modifierFormateur(id, nouveau);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerFormateur(@PathVariable Long id) {
        formateurService.supprimerFormateur(id);
    }
}
