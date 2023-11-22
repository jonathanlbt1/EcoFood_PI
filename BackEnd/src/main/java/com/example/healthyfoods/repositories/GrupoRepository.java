package com.example.healthyfoods.repositories;

import com.example.healthyfoods.entities.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
    @Override
    Optional<Grupo> findById(Long integer);
}
