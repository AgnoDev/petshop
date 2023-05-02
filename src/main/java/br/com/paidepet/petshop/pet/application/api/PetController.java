package br.com.paidepet.petshop.pet.application.api;

import br.com.paidepet.petshop.cliente.application.api.ClientePatchRequest;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponseById;
import br.com.paidepet.petshop.pet.application.service.PetService;
import br.com.paidepet.petshop.pet.domain.Pet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI {
    private final PetService petService;
    @Override
    public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
        log.info("[start] PetController - postPet");
        log.info("[idCliente] {}", idCliente);
        PetResponse postPet = petService.postPet(idCliente, petRequest);
        log.info("[finish] PetController - postPet");
        return postPet;
    }

    @Override
    public List<PetClienteListResponse> getPetsByCliente(UUID idCliente) {
        log.info("[start] PetController - getPetsByCliente");
        log.info("[idCliente] {}", idCliente);
        List<PetClienteListResponse> getPetsByCliente = petService.getPetsByCliente(idCliente);
        log.info("[finish] PetController - getPetsByCliente");
        return getPetsByCliente;
    }

    @Override
    public PetResponseById getPetById(UUID idCliente, UUID idPet) {
        log.info("[start] PetController - getPetById");
        log.info("[idCliente] {} - [idPet] {}", idCliente, idPet);
        PetResponseById getPetById = petService.getPetById(idCliente, idPet);
        log.info("[finish] PetController - getPetById");
        return getPetById;
    }


//    @Override
//    public List<ClienteListResponse> getAllClientes() {
//        return null;
//    }
//
//    @Override
//    public ClienteResponseById getClienteById(UUID idCliente) {
//        return null;
//    }
//
//    @Override
//    public void deleteClienteById(UUID idCliente) {
//
//    }
//
//    @Override
//    public void patchCliente(UUID idCliente, ClientePatchRequest clientePatchRequest) {
//
//    }
}
