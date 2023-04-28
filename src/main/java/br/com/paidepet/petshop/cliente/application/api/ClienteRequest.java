package br.com.paidepet.petshop.cliente.application.api;

import br.com.paidepet.petshop.cliente.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import java.time.LocalDate;
@Value
public class ClienteRequest {
    @NotBlank
    private String nomeCompleto;
    //@Email - deixarei comentado pra não precisar testar com email válido
    @NotBlank
    private String email;
    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    //@CPF - deixarei comentado pra não precisar testar com cpf válido
    private String cpf;
    @NotNull
    private boolean aceitaTermos;

}
