package br.com.paidepet.petshop.cliente.application.service;

import br.com.paidepet.petshop.cliente.application.api.ClienteRequest;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {
    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[start] ClienteApplicationService - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finish] ClienteApplicationService - criaCliente");
        return null;
    }
}
