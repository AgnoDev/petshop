package br.com.paidepet.petshop.pet.application.service;

import br.com.paidepet.petshop.pet.application.api.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;
public interface PetService {
    PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest);
    List<PetClienteListResponse> getPetsByCliente(UUID idCliente);
    PetResponseById getPetById(UUID idCliente, UUID idPet);
    void deletePetById(UUID idCliente, UUID idPet);
    void patchPet(UUID idCliente, UUID idPet, PetPatchRequest petPatchRequest);
}
