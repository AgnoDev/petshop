package br.com.paidepet.petshop.pet.application.service;

import br.com.paidepet.petshop.pet.domain.Pet;

import java.util.List;
import java.util.UUID;

public interface PetRepository {
    Pet postPet(Pet pet);
    List<Pet> getPetsByCliente(UUID idCliente);
}
