package com.biblioteca.biblioteca.dtos;

import com.biblioteca.biblioteca.models.Livro;
import lombok.Getter;


import javax.validation.constraints.NotBlank;

public record livroDto(
        @NotBlank
        String id,
        @NotBlank
        String titulo,
        @NotBlank
        String autor,
        @NotBlank
        String ano_de_publicacao,
        @NotBlank
        String genero
) {
        public livroDto(Livro livro){
                this(livro.getId(), livro.getTitulo(), livro.getAutor(), livro.getAno_de_publicacao(), livro.getGenero());
        }

        public String getTitulo() {
                return this.titulo();
        }
}
