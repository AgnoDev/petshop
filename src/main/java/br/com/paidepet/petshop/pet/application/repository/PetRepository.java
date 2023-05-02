package br.com.paidepet.petshop.pet.application.repository;

import br.com.paidepet.petshop.pet.application.api.PetResponseById;
import br.com.paidepet.petshop.pet.domain.Pet;

import java.util.List;
import java.util.UUID;

public interface PetRepository {
    Pet postPet(Pet pet);
    List<Pet> getPetsByCliente(UUID idCliente);
    Pet getPetById(UUID idPet);
}
