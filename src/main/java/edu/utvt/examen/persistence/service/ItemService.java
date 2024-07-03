package edu.utvt.examen.persistence.service;

import java.util.List;

import edu.utvt.examen.persistence.entities.Item;

public interface ItemService {
    List<Item> getAllItems();
    Item getItemById(Long id);
    Item getItemByNombre(String nombre);
    Item createItem(Item item);
    Item updateItem(Long id, Item item);
    void deleteItem(Long id);
}