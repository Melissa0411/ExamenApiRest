package edu.utvt.examen.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.utvt.examen.persistence.entities.Item;
import edu.utvt.examen.persistence.repositories.ItemRepository;


@Service
public class ItemServiceImplementation implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item getItemByNombre(String nombre) {
        return itemRepository.findByNombre(nombre).orElse(null);
    }

    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(Long id, Item item) {
        Item existingItem = itemRepository.findById(id).orElse(null);
        if (existingItem != null) {
            existingItem.setNombre(item.getNombre());
            existingItem.setPrecio(item.getPrecio());
            existingItem.setPersona(item.getPersona());  // Nuevo campo
            return itemRepository.save(existingItem);
        }
        return null;
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
