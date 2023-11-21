package com.biblioteca.biblioteca.services;

import com.biblioteca.biblioteca.dtos.livroDto;
import com.biblioteca.biblioteca.models.Livro;
import com.biblioteca.biblioteca.repositores.livroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private livroRepository livroRepository;

    public List<Livro> obterTodosLivros() {
        return livroRepository.findAll();
    }

    public void salvarLivro(Livro livro) {
        livroRepository.save(livro);
    }

    public List<Livro> encontrarLivrosPorAutor(String autor) {
        return livroRepository.findByAutor(autor);
    }

    public List<Livro> encontrarLivrosPorGenero(String genero) {
        return livroRepository.findByGenero(genero);
    }

    public void deletarLivrosPorTitulo(String titulo) {
        livroRepository.deleteByTitulo(titulo);
    }

    public void atualizarLivros(livroDto livroDTO) {
       Livro livro = livroRepository.findByTitulo(livroDTO.getTitulo());

        livro.setTitulo(livro.getTitulo());
        livro.setAutor(livro.getAutor());
        livro.setGenero(livro.getGenero());
        livro.setAno_de_publicacao(livro.getAno_de_publicacao());

    }
}