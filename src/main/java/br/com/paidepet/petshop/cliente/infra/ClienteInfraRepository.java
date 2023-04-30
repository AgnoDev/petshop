package br.com.paidepet.petshop.cliente.infra;

import br.com.paidepet.petshop.cliente.application.repository.ClienteRepository;
import br.com.paidepet.petshop.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataJpaRepository clienteSpringDataJpaRepository;
    @Override
    public Cliente postCliente(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - postCliente");
        clienteSpringDataJpaRepository.save(cliente);
        log.info("[finish] ClienteInfraRepository - postCliente");
        return cliente;
    }

    @Override
    public List<Cliente> getAllClientes() {
        log.info("[start] ClienteInfraRepository - getAllClientes");
        List<Cliente> getAllClientes = clienteSpringDataJpaRepository.findAll();
        log.info("[finish] ClienteInfraRepository - getAllClientes");
        return getAllClientes;
    }

    @Override
    public Cliente getClienteById(UUID idCliente) {
        log.info("[start] ClienteInfraRepository - getClienteById");
        log.info("[idCliente] {}", idCliente);
        Cliente cliente = clienteSpringDataJpaRepository.findById(idCliente)            //tratamento de exceção é mais popular na camada Service
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));    //mas é melhor no Repository
        log.info("[finish] ClienteInfraRepository - getClienteById");
        return cliente;
    }

    @Override
    public void deleteClienteById(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - deleteClienteById");
        clienteSpringDataJpaRepository.delete(cliente);
        log.info("[finish] ClienteInfraRepository - deleteClienteById");

    }
}
