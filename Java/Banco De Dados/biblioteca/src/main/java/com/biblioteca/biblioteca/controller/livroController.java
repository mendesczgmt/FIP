package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.dtos.livroDto;
import com.biblioteca.biblioteca.models.Livro;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.biblioteca.biblioteca.services.LivroService;
import com.biblioteca.biblioteca.repositores.livroRepository;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/livros")
public class livroController {
    @Autowired
    private LivroService livroService;

    @Autowired
    private livroRepository repository;

    @GetMapping
    public List<Livro> listarLivros(){
        return livroService.obterTodosLivros();
    }

    @PostMapping
    @Transactional
    public void cadastrarLivro(@RequestBody @Valid livroDto livro){
        livroService.salvarLivro(new Livro(livro));
    }

    @GetMapping("/autor/{autor}")
    public List<Livro> encontrarLivrosPorAutor(@PathVariable String autor) {
        return livroService.encontrarLivrosPorAutor(autor);
    }

    @GetMapping("/genero/{genero}")
    public List<Livro> encontrarLivrosPorGenero(@PathVariable String genero) {
        return livroService.encontrarLivrosPorGenero(genero);
    }

    @DeleteMapping("/delete/{titulo}")
    public void deletarLivrosPorTitulo(@PathVariable String titulo) {
        livroService.deletarLivrosPorTitulo(titulo);
    }
    @PutMapping("/atualizar")
    public void atualizarLivros(@RequestBody livroDto livro) {
        livroService.atualizarLivros(livro);
    }

}
