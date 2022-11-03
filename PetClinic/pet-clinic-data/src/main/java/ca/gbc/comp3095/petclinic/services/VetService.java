package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.model.Vet;
import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
