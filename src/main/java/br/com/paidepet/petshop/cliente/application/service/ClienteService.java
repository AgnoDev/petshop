package br.com.paidepet.petshop.cliente.application.service;

import br.com.paidepet.petshop.cliente.application.api.*;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse postCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> getAllClientes();
    ClienteResponseById getClienteById(UUID idCliente);
    void deleteClienteById(UUID idCliente);

    void patchCliente(UUID idCliente, ClientePatchRequest clientePatchRequest);
}
