package services;

import java.ca.gbc.comp3095.petclinic.model.Vet;
import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
