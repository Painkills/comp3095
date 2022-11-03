package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.model.Pet;
import java.util.Set;

public interface PetService extends CrudService <Pet, Long>{

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
