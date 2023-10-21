package me.tiago.bootcampdio.controller;

import jakarta.servlet.Servlet;
import me.tiago.bootcampdio.domain.model.Livro;
import me.tiago.bootcampdio.service.LivroService;
import me.tiago.bootcampdio.service.LivroServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

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

    @PostMapping
    public ResponseEntity<Livro> findById(@RequestBody Livro livro){
        var livroCreated = livroService.Create(livro);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(livroCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(livroCreated);
    }

}
