package br.edu.unifip.ecommerceapi.dtos;

import jakarta.validation.constraints.NotBlank;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public record AddressDTO(
        @NotNull
        UUID id,
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String uf) {
}
