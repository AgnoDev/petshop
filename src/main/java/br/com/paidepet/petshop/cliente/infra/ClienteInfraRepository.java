package br.com.paidepet.petshop.cliente.infra;

import br.com.paidepet.petshop.cliente.application.repository.ClienteRepository;
import br.com.paidepet.petshop.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataJpaRepository clienteSpringDataJpaRepository;
    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - salva");
        clienteSpringDataJpaRepository.save(cliente);
        log.info("[finish] ClienteInfraRepository - salva");
        return cliente;
    }

    @Override
    public List<Cliente> getAllClientes() {
        log.info("[start] ClienteInfraRepository - getAllClientes");
        List<Cliente> getAllClientes = clienteSpringDataJpaRepository.findAll();
        log.info("[finish] ClienteInfraRepository - getAllClientes");
        return getAllClientes;
    }
}
