package com.example.projetintegration.Repository;

import com.example.projetintegration.Entity.Memoire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoireRepository extends JpaRepository<Memoire, Long> {
}