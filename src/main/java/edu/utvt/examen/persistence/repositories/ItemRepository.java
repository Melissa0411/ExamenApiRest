package edu.utvt.examen.persistence.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.utvt.examen.persistence.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findByNombre(String nombre);

}
