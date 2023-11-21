package br.edu.unifip.ecommerceapi.models;

import br.edu.unifip.ecommerceapi.dtos.AddressDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "address")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Address {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uf;
    private String bairro;
    private String rua;
    @OneToOne(mappedBy = "address")
    private User usuario;

    public Address(AddressDTO dados) {
        this.uf = dados.uf();
        this.bairro = dados.bairro();
        this.rua = dados.rua();
    }
}
