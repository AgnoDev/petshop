package br.com.paidepet.petshop.cliente.application.api;

import br.com.paidepet.petshop.cliente.domain.Cliente;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.util.ArrayList;
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

    public static List<ClienteListResponse> converter(List<Cliente> clientes) {
        return clientes.stream()                            // transforma clientes em um fluxo
                .map(ClienteListResponse::new)              //dá um new em clientes dentro do ClienteListResponse
                .collect(Collectors.toList());              //pega o fluxo e transforma numa lista de ClienteListResponse
    }
    /* public static List<ClienteListResponse> converter(List<Cliente> clientes) {
        return clientes.stream()                            // transforma clientes em um fluxo
                .map(c -> new ClienteListResponse(c))       //pega cliente c e joga no construtor de cliente
                .collect(Collectors.toList());              //pega o fluxo e transforma numa lista de ClienteListResponse
    }*/

    public ClienteListResponse(Cliente cliente) {       //este é o construtor de ClienteListResponse
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
    }
}
