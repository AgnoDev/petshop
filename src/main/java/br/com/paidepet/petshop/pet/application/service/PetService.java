package br.com.paidepet.petshop.pet.application.service;

import br.com.paidepet.petshop.pet.application.api.PetRequest;
import br.com.paidepet.petshop.pet.application.api.PetResponse;
import br.com.paidepet.petshop.pet.domain.Pet;
import jakarta.validation.Valid;
import java.util.UUID;
public interface PetService {
    PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest);
}
