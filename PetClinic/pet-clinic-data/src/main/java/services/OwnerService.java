package services;

import java.ca.gbc.comp3095.petclinic.model.Owner;
import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long ownerId);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
