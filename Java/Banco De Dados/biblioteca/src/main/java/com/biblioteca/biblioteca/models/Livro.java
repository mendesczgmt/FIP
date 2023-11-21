package com.biblioteca.biblioteca.models;

import com.biblioteca.biblioteca.dtos.livroDto;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Document(collection = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Livro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String titulo;
    private String autor;
    private String ano_de_publicacao;
    private String genero;

    public Livro(livroDto dados) {
        this.titulo = dados.titulo();
        this.autor = dados.autor();
        this.ano_de_publicacao = dados.ano_de_publicacao();
        this.genero = dados.genero();
    }

}
