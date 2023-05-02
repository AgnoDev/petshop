package br.com.paidepet.petshop.pet.application.service;

import br.com.paidepet.petshop.cliente.application.service.ClienteService;
import br.com.paidepet.petshop.pet.application.api.PetClienteListResponse;
import br.com.paidepet.petshop.pet.application.api.PetRequest;
import br.com.paidepet.petshop.pet.application.api.PetResponse;
import br.com.paidepet.petshop.pet.application.api.PetResponseById;
import br.com.paidepet.petshop.pet.application.repository.PetRepository;
import br.com.paidepet.petshop.pet.domain.Pet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
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
        clienteService.getClienteById(idCliente);
        Pet pet = petRepository.postPet(new Pet(idCliente, petRequest));
        log.info("[finish] PetAppService - postPet");
        return new PetResponse(pet.getIdPet());
    }

    @Override
    public List<PetClienteListResponse> getPetsByCliente(UUID idCliente) {
        log.info("[start] PetAppService - getPetsByCliente");
        clienteService.getClienteById(idCliente);
        List<Pet> getPetsByCliente = petRepository.getPetsByCliente(idCliente);
        log.info("[finish] PetAppService - getPetsByCliente");
        return PetClienteListResponse.converter(getPetsByCliente);
    }

    @Override
    public PetResponseById getPetById(UUID idCliente, UUID idPet) {
        log.info("[start] PetAppService - getPetById");
        clienteService.getClienteById(idCliente);
        Pet pet = petRepository.getPetById(idPet);
        log.info("[finish] PetAppService - getPetById");
        return new PetResponseById(pet);
    }
}
