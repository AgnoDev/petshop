package br.com.paidepet.petshop.cliente.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


@NoArgsConstructor(access = AccessLevel.PRIVATE)    //o Hibernate precisa de um construtor vazio
@Getter
@Entity
public class Cliente {

    @Id
    private UUID idCliente;

    @NotBlank
    private String nomeCompleto;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;

    @NotNull
    private LocalDate dataNascimento;

    @CPF
    private String cpf;

    @NotNull
    private boolean aceitaTermos;

    //requisitos não funcionais
    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaAlteracao;

    public Cliente(String nomeCompleto, String email,
                   String celular, String telefone,
                   Sexo sexo, LocalDate dataNascimento,
                   String cpf, boolean aceitaTermos) {
        this.idCliente = UUID.randomUUID();
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.aceitaTermos = aceitaTermos;
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
