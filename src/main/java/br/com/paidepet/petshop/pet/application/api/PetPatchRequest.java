package br.com.paidepet.petshop.pet.application.api;

import br.com.paidepet.petshop.pet.domain.Porte;
import br.com.paidepet.petshop.pet.domain.SexoPet;
import br.com.paidepet.petshop.pet.domain.TipoPet;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class PetPatchRequest {
    @NotBlank
    private String nomePet;
    private Porte porte;
    @NotNull
    private TipoPet tipoPet;
    private String microchip;
    @NotBlank
    private String raca;
    @NotNull
    private SexoPet sexoPet;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;
}
