package br.com.paidepet.petshop.cliente.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {   //implementa contrato - separa responsabilidades - gera baixo acoplamento
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid  @RequestBody ClienteRequest clienteRequest); //recebe uma requisição (request) e devolve uma resposta(response)

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ClienteListResponse> getAllClientes();

    @GetMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteResponseById getClienteById(@PathVariable UUID idCliente);

    @DeleteMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteClienteById(@PathVariable UUID idCliente);

}
