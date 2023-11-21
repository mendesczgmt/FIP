import java.util.UUID;

public class Livro {
    private static int proximoId = 1;

    private String titulo;
    private Autor autor;
    private int id = 1;
    private boolean emprestado;

    public Livro(int id,String titulo, Autor autor) {
        this.id = proximoId;
        proximoId++;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    
} 
