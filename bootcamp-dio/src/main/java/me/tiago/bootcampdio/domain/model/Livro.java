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
    public String getAutor() {
        return autor;
    }
    private String categoria;
    public String getCategoria() {
        return categoria;
    }
    private String serie;
    public String getSerie() {
        return serie;
    }
    private  String url;
    public String getUrl() {
        return url;
    }
    private int paginas;
    public int getPaginas() {
        return paginas;
    }
    private boolean emprestado;
    public boolean getEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado)
    {
        this.emprestado = emprestado;
    }


}
