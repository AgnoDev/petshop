package br.com.paidepet.petshop.cliente.application.api;

import br.com.paidepet.petshop.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class ClienteResponseById {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;
}
