package br.com.paidepet.petshop.cliente.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {
    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[start] ClienteController - postCliente");
        log.info("[finish] ClienteController - postCliente");
        return null;
    }
}
