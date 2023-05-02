package br.com.paidepet.petshop.pet.application.api;

import br.com.paidepet.petshop.pet.domain.Pet;
import br.com.paidepet.petshop.pet.domain.Porte;
import br.com.paidepet.petshop.pet.domain.SexoPet;
import br.com.paidepet.petshop.pet.domain.TipoPet;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class PetResponseById {
    private UUID idPet;
    private UUID idClienteRef;
    private String nomePet;
    private Porte porte;
    private TipoPet tipoPet;
    private String microchip;
    private String raca;
    private SexoPet sexoPet;
    private String pelagemCor;
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;

    public PetResponseById(Pet pet) {
        this.idPet = pet.getIdPet();
        this.idClienteRef = pet.getIdClienteRef();
        this.nomePet = pet.getNomePet();
        this.porte = pet.getPorte();
        this.tipoPet = pet.getTipoPet();
        this.microchip = pet.getMicrochip();
        this.raca = pet.getRaca();
        this.sexoPet = pet.getSexoPet();
        this.pelagemCor = pet.getPelagemCor();
        this.dataNascimento = pet.getDataNascimento();
        this.rga = pet.getRga();
        this.peso = pet.getPeso();
    }
}
