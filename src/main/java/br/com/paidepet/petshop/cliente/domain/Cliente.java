package br.com.paidepet.petshop.cliente.domain;

import br.com.paidepet.petshop.cliente.application.api.ClienteRequest;
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
    @Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
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

    public Cliente(ClienteRequest clienteRequest) {    //cliente só será criado a partir de uma request (post)
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.email = clienteRequest.getEmail();
        this.celular = clienteRequest.getCelular();
        this.telefone = clienteRequest.getTelefone();
        this.sexo = clienteRequest.getSexo();
        this.dataNascimento = clienteRequest.getDataNascimento();
        this.cpf = clienteRequest.getCpf();
        this.aceitaTermos = clienteRequest.isAceitaTermos();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
