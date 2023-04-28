package br.com.paidepet.petshop.cliente.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {   //implementa contrato - separa responsabilidades - gera baixo acoplamento
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid  @RequestBody ClienteRequest clienteRequest); //recebe uma requisição (request) e devolve uma resposta(response)

}
