package me.tiago.bootcampdio.domain.repository;

import me.tiago.bootcampdio.domain.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

        boolean existsByTitulo(String titulo);
        boolean existsByCategoriaIgnoreCase(String categoria);
        List<Livro> findByCategoriaIgnoreCase(String categoria);
}
