package br.com.paidepet.petshop.cliente.application.service;

import br.com.paidepet.petshop.cliente.application.api.ClienteListResponse;
import br.com.paidepet.petshop.cliente.application.api.ClienteRequest;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponse;
import br.com.paidepet.petshop.cliente.application.repository.ClienteRepository;
import br.com.paidepet.petshop.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[start] ClienteApplicationService - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finish] ClienteApplicationService - criaCliente");
        return ClienteResponse.builder()
                .idCliente(cliente.getIdCliente())
                .build();
    }

    @Override
    public List<ClienteListResponse> getAllClientes() {
        log.info("[start] ClienteApplicationService - getAllClientes");
        log.info("[finish] ClienteApplicationService - getAllClientes");
        return null;
    }
}
