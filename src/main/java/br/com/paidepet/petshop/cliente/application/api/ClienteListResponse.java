package br.com.paidepet.petshop.cliente.application.api;

import br.com.paidepet.petshop.cliente.domain.Cliente;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value  //pra dar o get nos atributos
public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;

    public static List<ClienteListResponse> converterMap(List<Cliente> clientes) {  //metodo para converter uma lista em outra(ambas já criadas)
        return clientes.stream()                            // faz um looping('for' do java8) passando pelos clientes da Lista
                .map(ClienteListResponse::new)              //'converte' cada cliente adequando ao modelo ideal para estar em ClienteListResponse
                .collect(Collectors.toList());              //coleta os convertidos do Map e monta uma toList(neste caso, de ClienteListResponse)
    }
    /* public static List<ClienteListResponse> converterMap(List<Cliente> clientes) {
        return clientes.stream()                            // faz um looping('for' do java8) passando pelos clientes da Lista
                .map(c -> new ClienteListResponse(c))       //pega cliente c, converte e joga no construtor de cliente
                .collect(Collectors.toList());              //coleta os convertidos do Map e monta uma toList(neste caso, de ClienteListResponse)
    }*/

    public ClienteListResponse(Cliente cliente) {       //este é o construtor de ClienteListResponse que recebe os convertidos pelo Map
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
    }
}
