package com.example.projetintegration.Controller;

import com.example.projetintegration.Entity.Memoire;
import com.example.projetintegration.Service.MemoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/memoires")
@CrossOrigin(origins = "http://localhost:3000")
public class MemoireController {

    @Autowired
    private MemoireService memoireService;

    @PostMapping("/add")
    public Memoire ajouterMemoire(@RequestBody Memoire memoire) {
        return memoireService.ajouterMemoire(memoire);
    }

    @GetMapping("/all")
    public List<Memoire> afficherTous() {
        return memoireService.afficherTous();
    }

    @GetMapping("/{id}")
    public Memoire afficherParId(@PathVariable Long id) {
        return memoireService.afficherParId(id);
    }

    @PutMapping("/update/{id}")
    public Memoire modifierMemoire(@PathVariable Long id, @RequestBody Memoire nouveau) {
        return memoireService.modifierMemoire(id, nouveau);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerMemoire(@PathVariable Long id) {
        memoireService.supprimerMemoire(id);
    }
}
