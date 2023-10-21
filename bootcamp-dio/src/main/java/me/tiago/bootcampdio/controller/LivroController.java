package me.tiago.bootcampdio.controller;

import jakarta.servlet.Servlet;
import me.tiago.bootcampdio.domain.model.Livro;
import me.tiago.bootcampdio.service.LivroService;
import me.tiago.bootcampdio.service.LivroServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService)
    {
        this.livroService = livroService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> findById(@PathVariable Long id){
        var livro = livroService.FindById(id);
        return ResponseEntity.ok(livro);
    }

    @GetMapping("/livros")
    public ResponseEntity<List<Livro>> getAll(){
        List<Livro> listaLivros = livroService.GetAll();
        return ResponseEntity.ok(listaLivros);
    }

    @GetMapping("/livros/categoria/{categoria}")
    public ResponseEntity<List<Livro>> getByCategory(@PathVariable String categoria){
        List<Livro> listaLivros = livroService.GetByCategory(categoria);
        return ResponseEntity.ok(listaLivros);
    }

    @PostMapping
    public ResponseEntity<Livro> create(@RequestBody Livro livro){
        var livroCreated = livroService.Create(livro);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(livroCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(livroCreated);
    }

}
