package edu.utvt.examen.persistence.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.utvt.examen.persistence.entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Optional<Persona> findByNombre(String nombre);

}
