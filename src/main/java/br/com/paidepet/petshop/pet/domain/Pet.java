package br.com.paidepet.petshop.pet.domain;

import br.com.paidepet.petshop.pet.application.api.PetRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
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
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idPet", updatable = false, unique = true, nullable = false)
    private UUID idPet;
    @NotNull
    private UUID idClienteRef;
    @NotBlank
    private String nomePet;
    @Enumerated(EnumType.STRING)
    private Porte porte;
    @Enumerated(EnumType.STRING)
    @NotNull
    private TipoPet tipoPet;
    private String microchip;
    @NotBlank
    private String raca;
    @Enumerated(EnumType.STRING)
    @NotNull
    private SexoPet sexoPet;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaAlteracao;

    public Pet(UUID idCliente, @Valid PetRequest petRequest){
        this.idClienteRef = idCliente;
        this.nomePet = petRequest.getNomePet();
        this.porte = petRequest.getPorte();
        this.tipoPet = petRequest.getTipoPet();
        this.microchip = petRequest.getMicrochip();
        this.raca = petRequest.getRaca();
        this.sexoPet = petRequest.getSexoPet();
        this.pelagemCor = petRequest.getPelagemCor();
        this.dataNascimento = petRequest.getDataNascimento();
        this.rga = petRequest.getRga();
        this.peso = petRequest.getPeso();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}