package com.example.projetintegration.Controller;

import com.example.projetintegration.Entity.Coordinateur;
import com.example.projetintegration.Service.CoordinateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/coordinateurs")
@CrossOrigin(origins = "http://localhost:3000")
public class CoordinateurController {

    @Autowired
    private CoordinateurService coordinateurService;

    @PostMapping("/add")
    public Coordinateur ajouterCoordinateur(@RequestBody Coordinateur coordinateur) {
        return coordinateurService.ajouterCoordinateur(coordinateur);
    }

    @GetMapping("/all")
    public List<Coordinateur> afficherTous() {
        return coordinateurService.afficherTous();
    }

    @GetMapping("/{id}")
    public Coordinateur afficherParId(@PathVariable Long id) {
        return coordinateurService.afficherParId(id);
    }

    @PutMapping("/update/{id}")
    public Coordinateur modifierCoordinateur(@PathVariable Long id, @RequestBody Coordinateur nouveau) {
        return coordinateurService.modifierCoordinateur(id, nouveau);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerCoordinateur(@PathVariable Long id) {
        coordinateurService.supprimerCoordinateur(id);
    }
}
