package br.com.paidepet.petshop.cliente.application.service;

import br.com.paidepet.petshop.cliente.application.api.ClienteRequest;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponse;
public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
