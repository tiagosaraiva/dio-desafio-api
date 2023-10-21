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
            String Url,
            int Paginas,
            boolean Emprestado
            )
    {
        this.titulo = Titulo;
        this.autor = Autor;
        this.categoria = Categoria;
        this.serie = Serie;
        this.url = Url;
        this.paginas = Paginas;
        this.emprestado = Emprestado;
    }
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    public Long getId()
    {
        return this.Id;
    }
    private String titulo;
    public String getTitulo(){
        return this.titulo;
    }
    private String autor;
    private String categoria;
    private String serie;
    private  String url;
    private int paginas;
    private boolean emprestado;
}
