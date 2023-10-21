package me.tiago.bootcampdio.service;

import me.tiago.bootcampdio.domain.model.Livro;
import me.tiago.bootcampdio.domain.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LivroServiceImp implements LivroService {

    private final LivroRepository livroRepository;


    public LivroServiceImp(LivroRepository livroRepository)
    {
        this.livroRepository = livroRepository;
    }
    @Override
    public Livro FindById(long id) {
       return livroRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Livro Create(Livro livroToCreate) {
        if (livroRepository.existsByTitulo(livroToCreate.getTitulo()))
        {
            throw new IllegalArgumentException("O livro já existe");
        }

        return livroRepository.save(livroToCreate);
    }

    @Override
    public Livro Borrow(Long id) {
        return null;
    }

    @Override
    public List<Livro> GetAll() {
        return null;
    }

    @Override
    public List<Livro> GetByCategory(String categoria) {
        return null;
    }
}
