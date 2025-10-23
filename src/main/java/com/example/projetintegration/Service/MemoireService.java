package com.example.projetintegration.Service;

import com.example.projetintegration.Entity.Memoire;
import com.example.projetintegration.Repository.MemoireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemoireService {

    @Autowired
    private MemoireRepository memoireRepository;

    public Memoire ajouterMemoire(Memoire memoire) {
        return memoireRepository.save(memoire);
    }

    public List<Memoire> afficherTous() {
        return memoireRepository.findAll();
    }

    public Memoire afficherParId(Long id) {
        return memoireRepository.findById(id).orElse(null);
    }

    public Memoire modifierMemoire(Long id, Memoire nouveau) {
        Memoire m = memoireRepository.findById(id).orElse(null);
        if (m != null) {
            m.setType(nouveau.getType());
            m.setMontantB(nouveau.getMontantB());
            m.setRetenue(nouveau.getRetenue());
            m.setMontantN(nouveau.getMontantN());
            return memoireRepository.save(m);
        }
        return null;
    }

    public void supprimerMemoire(Long id) {
        memoireRepository.deleteById(id);
    }
}
