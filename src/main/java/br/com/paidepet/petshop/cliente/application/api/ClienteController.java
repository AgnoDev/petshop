package br.com.paidepet.petshop.cliente.application.api;

import br.com.paidepet.petshop.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor    //gera um construtor para o ClienteService só com atributos 'final'.
                            //diminuindo a verbosidade do codigo
public class ClienteController implements ClienteAPI {
    private final ClienteService clienteService;    //INJEÇÃO DE DEPENDÊNCIA (final não pode ser modificado)
   /* private ClienteController(ClienteService clienteService) {  //CONSTRUTOR que inicia o ClienteService
        this.clienteService = clienteService; //porém ele deve ser substituído pelo @RequiredArgsConstructor
    }*/
    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[start] ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finish] ClienteController - postCliente");
        return clienteCriado;
        //"clienteService vai criaCliente baseado no clienteRequest passado na requisição do front"
        //"e devolve um ClienteResponse chamado clienteCriado passando essa resposta no return"

        


    }
}
