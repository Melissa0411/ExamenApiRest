package edu.utvt.examen.persistence.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.utvt.examen.persistence.entities.Persona;
import edu.utvt.examen.persistence.repositories.PersonaRepository;

@Service
public class PersonaServiceImplementation implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona getPersonaById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona getPersonaByNombre(String nombre) {
        return personaRepository.findByNombre(nombre).orElse(null);
    }

    @Override
    public Persona createPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona updatePersona(Long id, Persona persona) {
        Persona existingPersona = personaRepository.findById(id).orElse(null);
        if (existingPersona != null) {
            existingPersona.setNombre(persona.getNombre());
            existingPersona.setEdad(persona.getEdad());
            existingPersona.setFechaNacimiento(persona.getFechaNacimiento());
            return personaRepository.save(existingPersona);
        }
        return null;
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }
}