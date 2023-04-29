package br.com.paidepet.petshop.cliente.application.api;

import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {   //implementa contrato - separa responsabilidades - gera baixo acoplamento
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid  @RequestBody ClienteRequest clienteRequest); //recebe uma requisição (request) e devolve uma resposta(response)

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ClienteListResponse> getAllClientes();

}
