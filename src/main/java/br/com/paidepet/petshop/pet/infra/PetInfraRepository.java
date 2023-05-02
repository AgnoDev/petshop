package br.com.paidepet.petshop.pet.infra;

import br.com.paidepet.petshop.pet.application.repository.PetRepository;
import br.com.paidepet.petshop.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
    private final PetSpringDataJpaRepository petSpringDataJpaRepository;
    @Override
    public Pet postPet(Pet pet) {
        log.info("[start] PetInfraRepositoryDel - postPet");
        petSpringDataJpaRepository.save(pet);
        log.info("[finish] PetInfraRepositoryDel - postPet");
        return pet;
    }

    @Override
    public List<Pet> getPetsByCliente(UUID idCliente) {
        log.info("[start] PetInfraRepositoryDel - getPetsByCliente");
        List<Pet> getPetsByCliente = petSpringDataJpaRepository.findByIdClienteRef(idCliente);
        log.info("[finish] PetInfraRepositoryDel - getPetsByCliente");
        return getPetsByCliente;
    }

    @Override
    public Pet getPetById(UUID idPet) {
        log.info("[start] PetInfraRepositoryDel - getPetById");
        Pet pet = petSpringDataJpaRepository.findById(idPet)
                .orElseThrow(() -> new RuntimeException("CLIENTE NÃO ENCONTRADO!"));
        log.info("[finish] PetInfraRepositoryDel - getPetById");
        return pet;
    }

    @Override
    public void deletePetById(Pet pet) {
        log.info("[start] PetInfraRepositoryDel - deletePetById");
        petSpringDataJpaRepository.delete(pet);
        log.info("[finish] PetInfraRepositoryDel - deletePetById");

    }


}
