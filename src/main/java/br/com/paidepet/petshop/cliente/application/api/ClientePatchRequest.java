package br.com.paidepet.petshop.cliente.application.api;

import br.com.paidepet.petshop.cliente.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class ClientePatchRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private boolean aceitaTermos;

}
