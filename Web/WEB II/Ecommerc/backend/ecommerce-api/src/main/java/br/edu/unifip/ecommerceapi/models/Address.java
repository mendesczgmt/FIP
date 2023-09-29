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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String logradouro;
    private String cidade;
    private String bairro;
    private String uf;
    @OneToOne(mappedBy = "address")
    private User usuario;

    public Address(AddressDTO dados) {
        this.logradouro = dados.logradouro();
        this.cidade = dados.cidade();
        this.bairro = dados.bairro();
        this.uf = dados.uf();
    }
}
