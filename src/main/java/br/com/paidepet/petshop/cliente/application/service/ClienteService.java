package br.com.paidepet.petshop.cliente.application.service;

import br.com.paidepet.petshop.cliente.application.api.ClienteListResponse;
import br.com.paidepet.petshop.cliente.application.api.ClienteRequest;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> getAllClientes();
}
