package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.model.Owner;
import java.util.Set;

public interface OwnerService extends CrudService <Owner, Long>{

    Owner findByLastName(String lastName);

    Owner findById(Long ownerId);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
