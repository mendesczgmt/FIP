package br.edu.unifip.ecommerceapi.dtos;

import br.edu.unifip.ecommerceapi.models.Address;
import jakarta.validation.constraints.NotBlank;

public record  AddressDTO(
        Long id,
        @NotBlank
    String uf,
        @NotBlank
    String bairro,
        @NotBlank
    String rua
)   {
    public AddressDTO(Address address){
            this(address.getId(), address.getUf(), address.getBairro(), address.getRua());
        }
}
