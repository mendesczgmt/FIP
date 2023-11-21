package com.biblioteca.biblioteca.repositores;

import com.biblioteca.biblioteca.models.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface  livroRepository extends MongoRepository<Livro, String> {

    List<Livro> findByAutor(String autor);

    List<Livro> findByGenero(String genero);
    List<Livro> findByTitulo(String titulo);

    void deleteByTitulo(String titulo);
}
