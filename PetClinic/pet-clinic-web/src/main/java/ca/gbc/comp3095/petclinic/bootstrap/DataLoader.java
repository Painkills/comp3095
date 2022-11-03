package ca.gbc.comp3095.petclinic.bootstrap;

import ca.gbc.comp3095.petclinic.model.Owner;
import ca.gbc.comp3095.petclinic.model.Vet;
import ca.gbc.comp3095.petclinic.services.OwnerService;
import ca.gbc.comp3095.petclinic.services.VetService;
import ca.gbc.comp3095.petclinic.services.map.OwnerServiceMap;
import ca.gbc.comp3095.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Frodo");
        owner1.setLastName("Baggins");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Samwise");
        owner2.setLastName("Gamgee");
        ownerService.save(owner2);

        System.out.println("Owners created.");

        Vet vet1 = new Vet();
        vet1.setFirstName("Galadriel");
        vet1.setLastName("Leaf");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Elrond");
        vet2.setLastName("Tree");
        vetService.save(vet2);

        System.out.println("Vets created.");

    }
}
