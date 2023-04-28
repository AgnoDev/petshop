package br.com.paidepet.petshop.cliente.application.repository;

import br.com.paidepet.petshop.cliente.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
