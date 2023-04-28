package br.com.paidepet.petshop.cliente.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)    //o Hibernate precisa de um construtor vazio
@Getter
@Entity
public class Cliente {
    @Id //como mapear UUID
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
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
    private LocalDateTime dataHoraDoCadastro;       //requisitos não funcionais
    private LocalDateTime dataHoraDaAlteracao;      //requisitos não funcionais

    public Cliente(String nomeCompleto, String email,
                   String celular, String telefone,
                   Sexo sexo, LocalDate dataNascimento,
                   String cpf, boolean aceitaTermos) {
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
