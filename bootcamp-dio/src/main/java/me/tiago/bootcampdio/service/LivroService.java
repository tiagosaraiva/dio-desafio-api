package me.tiago.bootcampdio.service;

import me.tiago.bootcampdio.domain.model.Livro;

import java.util.List;

public interface LivroService {
    Livro FindById(long id);
    Livro Create(Livro livroToCreate);
    Livro Borrow(Long id);
    List<Livro> GetAll();
    List<Livro> GetByCategory(String categoria);
}
