package br.com.paidepet.petshop.pet.infra;

import br.com.paidepet.petshop.pet.application.service.PetRepository;
import br.com.paidepet.petshop.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
    private final PetSpringDataJpaRepository petSpringDataJpaRepository;
    @Override
    public Pet postPet(Pet pet) {
        log.info("[start] PetInfraRepository - postPet");
        petSpringDataJpaRepository.save(pet);
        log.info("[finish] PetInfraRepository - postPet");
        return pet;
    }
}
