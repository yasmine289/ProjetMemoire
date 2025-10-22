package com.example.projetintegration.Controller;

import com.example.projetintegration.Entity.Session;
import com.example.projetintegration.Service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/sessions")
@CrossOrigin(origins = "http://localhost:3000")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @PostMapping("/add")
    public Session ajouterSession(@RequestBody Session session) {
        return sessionService.ajouterSession(session);
    }

    @GetMapping("/all")
    public List<Session> afficherToutes() {
        return sessionService.afficherToutes();
    }

    @GetMapping("/{id}")
    public Session afficherParId(@PathVariable Long id) {
        return sessionService.afficherParId(id);
    }

    @PutMapping("/update/{id}")
    public Session modifierSession(@PathVariable Long id, @RequestBody Session nouvelle) {
        return sessionService.modifierSession(id, nouvelle);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerSession(@PathVariable Long id) {
        sessionService.supprimerSession(id);
    }

    @PutMapping("/affecter/{idSession}/{idFormateur}")
    public Session affecterFormateur(@PathVariable Long idSession, @PathVariable Long idFormateur) {
        return sessionService.affecterFormateur(idSession, idFormateur);
    }

    @GetMapping("/formateur/{idFormateur}")
    public List<Session> sessionsParFormateur(@PathVariable Long idFormateur) {
        return sessionService.sessionsParFormateur(idFormateur);
    }
}
