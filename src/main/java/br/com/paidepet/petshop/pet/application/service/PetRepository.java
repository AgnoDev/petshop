package br.com.paidepet.petshop.pet.application.service;

import br.com.paidepet.petshop.pet.domain.Pet;

public interface PetRepository {
    Pet postPet(Pet pet);
}
