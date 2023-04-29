package br.com.paidepet.petshop.cliente.infra;

import br.com.paidepet.petshop.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID> {
}
