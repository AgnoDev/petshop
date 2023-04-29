package br.com.paidepet.petshop.cliente.application.api;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
}
