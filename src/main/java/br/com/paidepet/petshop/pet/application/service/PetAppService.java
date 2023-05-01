package br.com.paidepet.petshop.pet.application.service;

import br.com.paidepet.petshop.cliente.application.service.ClienteService;
import br.com.paidepet.petshop.pet.application.api.PetRequest;
import br.com.paidepet.petshop.pet.application.api.PetResponse;
import br.com.paidepet.petshop.pet.domain.Pet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Log4j2
@RequiredArgsConstructor
public class PetAppService implements PetService {
    private final ClienteService clienteService;
    private final PetRepository petRepository;

    @Override
    public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
        log.info("[start] PetAppService - postPet");
        log.info("[idCliente] {}", idCliente);
        clienteService.getClienteById(idCliente);
        Pet pet = petRepository.postPet(new Pet(idCliente, petRequest));
        log.info("[finish] PetAppService - postPet");
        return new PetResponse(pet.getIdPet());
    }
}
