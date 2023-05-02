package br.com.paidepet.petshop.pet.application.service;

import br.com.paidepet.petshop.pet.application.api.PetClienteListResponse;
import br.com.paidepet.petshop.pet.application.api.PetRequest;
import br.com.paidepet.petshop.pet.application.api.PetResponse;
import br.com.paidepet.petshop.pet.application.api.PetResponseById;
import br.com.paidepet.petshop.pet.domain.Pet;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;
public interface PetService {
    PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest);
    List<PetClienteListResponse> getPetsByCliente(UUID idCliente);
    PetResponseById getPetById(UUID idCliente, UUID idPet);
}
