package br.com.paidepet.petshop.pet.application.api;

import br.com.paidepet.petshop.cliente.application.api.*;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/pet")
public interface PetAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PetResponse postPet(@PathVariable UUID idCliente,
                        @Valid @RequestBody PetRequest petRequest);

//    @GetMapping
//    @ResponseStatus(code = HttpStatus.OK)
//    List<ClienteListResponse> getAllClientes();
//
//    @GetMapping(value = "/{idCliente}")
//    @ResponseStatus(code = HttpStatus.OK)
//    ClienteResponseById getClienteById(@PathVariable UUID idCliente);
//
//    @DeleteMapping(value = "/{idCliente}")
//    @ResponseStatus(code = HttpStatus.NO_CONTENT)
//    void deleteClienteById(@PathVariable UUID idCliente);
//
//    @PatchMapping(value = "/{idCliente}")
//    @ResponseStatus(code = HttpStatus.NO_CONTENT)
//    void patchCliente(@PathVariable UUID idCliente, @Valid @RequestBody ClientePatchRequest clientePatchRequest);
}
