package edu.utvt.examen.persistence.service;

import java.util.List;

import edu.utvt.examen.persistence.entities.Persona;

public interface PersonaService {
    List<Persona> getAllPersonas();
    Persona getPersonaById(Long id);
    Persona getPersonaByNombre(String nombre);
    Persona createPersona(Persona persona);
    Persona updatePersona(Long id, Persona persona);
    void deletePersona(Long id);
}