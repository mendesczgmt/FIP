import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

        private List<Livro> livros;
        private List<Autor> autores;
        private List<Usuario> usuarios;

        public Biblioteca() {
            livros = new ArrayList<>();
            autores = new ArrayList<>();
            usuarios = new ArrayList<>();
        }

        public void adicionarLivro(Livro livro) {
            livros.add(livro);
        }

        public void removerLivro(Livro livro) {
            livros.remove(livro);
        }

        public void adicionarAutor(Autor autor) {
            autores.add(autor);
        }

        public void adicionarUsuario(Usuario usuario) {
            usuarios.add(usuario);
        }

        public void emprestarLivro(Livro livro, Usuario usuario) {
            if (livros.contains(livro) && usuarios.contains(usuario)) {
                livro.setEmprestado(true);
            }
        }

        public void devolverLivro(Livro livro, Usuario usuario) {
            if (livros.contains(livro) && usuarios.contains(usuario)) {
                livro.setEmprestado(false);
            }
        }
    }