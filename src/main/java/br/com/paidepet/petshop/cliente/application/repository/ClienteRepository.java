package br.com.paidepet.petshop.cliente.application.repository;

import br.com.paidepet.petshop.cliente.application.api.ClienteListResponse;
import br.com.paidepet.petshop.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
    List<Cliente> getAllClientes(); // List<ClienteListResponse> getAllClientes(); não pode retornar ClienteListResponse, só Cliente
    Cliente getClienteById(UUID idCliente);
    void deleteClienteById(Cliente cliente);
}
