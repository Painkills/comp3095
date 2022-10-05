package services;

import java.ca.gbc.comp3095.petclinic.model.Pet;
import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
