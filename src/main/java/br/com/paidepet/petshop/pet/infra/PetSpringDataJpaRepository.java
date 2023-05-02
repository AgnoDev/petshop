package br.com.paidepet.petshop.pet.infra;

import br.com.paidepet.petshop.pet.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PetSpringDataJpaRepository extends JpaRepository<Pet, UUID> {
    List<Pet> findByIdClienteRef(UUID idCliente);
   }
