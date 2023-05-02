package br.com.paidepet.petshop.pet.application.api;

import br.com.paidepet.petshop.pet.domain.Pet;
import br.com.paidepet.petshop.pet.domain.Porte;
import br.com.paidepet.petshop.pet.domain.SexoPet;
import br.com.paidepet.petshop.pet.domain.TipoPet;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class PetClienteListResponse {
    private UUID idPet;
    private String nomePet;
    private TipoPet tipoPet;
    private String raca;
    private String pelagemCor;
    private LocalDate dataNascimento;

    public static List<PetClienteListResponse> converter(List<Pet> getPetsByCliente) {
        return getPetsByCliente.stream()
                .map(PetClienteListResponse::new)
                .collect(Collectors.toList());
    }
    public PetClienteListResponse(Pet pet){
        this.idPet = pet.getIdPet();
        this.nomePet = pet.getNomePet();
        this.tipoPet = pet.getTipoPet();
        this.raca = pet.getRaca();
        this.pelagemCor = pet.getPelagemCor();
        this.dataNascimento = pet.getDataNascimento();
    }
}

