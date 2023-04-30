package br.com.paidepet.petshop.cliente.application.service;

import br.com.paidepet.petshop.cliente.application.api.ClienteListResponse;
import br.com.paidepet.petshop.cliente.application.api.ClienteRequest;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponse;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponseById;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> getAllClientes();
    ClienteResponseById getClienteById(UUID idCliente);
    void deletaClienteById(UUID idCliente);
}
