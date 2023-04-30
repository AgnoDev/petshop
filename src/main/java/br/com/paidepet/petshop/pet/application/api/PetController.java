package br.com.paidepet.petshop.pet.application.api;

import br.com.paidepet.petshop.cliente.application.api.ClienteListResponse;
import br.com.paidepet.petshop.cliente.application.api.ClientePatchRequest;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponseById;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
@RestController
@Log4j2
public class PetController implements PetAPI {
    @Override
    public PetResponse postPet(UUID idCliente, PetRequest petRequest) {
        log.info("[start] PetController - postPet");
        log.info("[idCliente] {}", idCliente);
        log.info("[finish] PetController - postPet");
        return null;
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
