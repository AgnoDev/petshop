package br.com.paidepet.petshop.cliente.application.service;

import br.com.paidepet.petshop.cliente.application.api.ClienteListResponse;
import br.com.paidepet.petshop.cliente.application.api.ClienteRequest;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponse;
import br.com.paidepet.petshop.cliente.application.api.ClienteResponseById;
import br.com.paidepet.petshop.cliente.application.repository.ClienteRepository;
import br.com.paidepet.petshop.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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
        List<Cliente> clientes = clienteRepository.getAllClientes();
        log.info("[finish] ClienteApplicationService - getAllClientes");
        return ClienteListResponse.converterMap(clientes);
    }

    @Override
    public ClienteResponseById getClienteById(UUID idCliente) {
        log.info("[start] ClienteApplicationService - getClienteById");
        log.info("[idCliente] {}", idCliente);
        Cliente cliente = clienteRepository.getClienteById(idCliente);
        log.info("[finish] ClienteApplicationService - getClienteById");
        return new ClienteResponseById(cliente);    //cria um novo modelo de resposta conforme a regra de negocio, e tbm por segurança
        //o cliente passado no parâmetro de ClienteResponseById, é o que foi gerado pelo clienteRepository(atraves do metodo getClienteById)
    }

    @Override
    public void deleteClienteById(UUID idCliente) {
        log.info("[start] ClienteApplicationService - deleteClienteById");
        log.info("[idCliente] {}", idCliente);
        Cliente cliente = clienteRepository.getClienteById(idCliente);
        clienteRepository.deleteClienteById(cliente);
        log.info("[finish] ClienteApplicationService - deleteClienteById");
    }
}
