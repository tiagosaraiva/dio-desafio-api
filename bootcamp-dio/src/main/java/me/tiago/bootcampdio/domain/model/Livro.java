package me.tiago.bootcampdio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_livros")
public class Livro {

    public  Livro()
    {

    }
    public  Livro(
            String Titulo,
            String Autor,
            String Categoria,
            String Serie,
            int Paginas,
            boolean Emprestado
            )
    {
        this.titulo = Titulo;
        this.autor = Autor;
        this.categoria = Categoria;
        this.serie = Serie;
        this.paginas = Paginas;
        this.emprestado = Emprestado;
    }
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String titulo;
    private String autor;
    private String categoria;
    private String serie;
    private int paginas;
    private boolean emprestado;
}
