import java.util.ArrayList;
import java.util.List;

class Vegas {
    private Estabelecimento estabelecimento;
    private Artista artista;
    Endereco endereco;
    String email;
    String senha;
    boolean aprovarLogin;
    
    List <Artista> artistas = new ArrayList<>();
    List <Estabelecimento> estabelecimentos = new ArrayList<>();
    Endereco endereco1 = new Endereco("58700-00", "ruadecima", "centro", 12);
    Artista artista1 = new Artista("Mateus Leite", "123", endereco1, "mateusleite@gmail.com", "123senha", false);

    public List<Artista> adicionarArtista(Artista artista) {
        artistas.add(artista);
        System.out.printf("O Artista %s foi cadastrado \n", artista.getRazaoSocial());
        return artistas;
    }

     public List<Artista> removerArtista(Artista artista) {
        artistas.remove(artista);
        System.out.printf("O Artista %s foi removido \n", artista.getRazaoSocial());
        
        return artistas; 
        }

    public List<Estabelecimento> adicionarEstabelecimento(Estabelecimento estabelecimento) {
        estabelecimentos.add(estabelecimento);
        System.out.printf("O estabelecimento %s foi cadastrado \n", estabelecimento.getRazaoSocial());
        System.out.println("--------------------------");

        return estabelecimentos;
    }

     public List<Artista> removerEstabelecimento(Artista artista) {
        artistas.remove(artista);
        System.out.printf("O Estabelecimento %s foi removido \n", artista.getRazaoSocial());
        System.out.println("--------------------------");
        return artistas;
     }

    public void mostrarEstabelecimentos() {
        if(estabelecimentos.size() > 1) { 
            System.out.println("Esses Estabelecimentos estão cadastrados: ");
            System.out.println("--------------------------");
            for (Estabelecimento estabelecimento : estabelecimentos) {
                System.out.println(estabelecimento.getRazaoSocial()); 
            }
        }
        else if(estabelecimentos.size() == 1) {
            System.out.println("O único estabelecimento cadastrado é esse: ");
            System.out.println("--------------------------");
            for (Estabelecimento estabelecimento : estabelecimentos) {
                System.out.println(estabelecimento.getRazaoSocial()); 
            }
        }
        else {System.out.println("Não existe estabelecimento cadastrado");}
    System.out.println("--------------------------");
    }

    public void mostrarArtistas() {
        if(artistas.size() > 1) {
            System.out.println("Esses Artistas estão cadastrados: ");
            System.out.println("--------------------------");
            for (Artista artista : artistas) {
                System.out.println(artista.getRazaoSocial()); 
            }
        }
        else if(artistas.size() == 1) {
            System.out.println("O único artista cadastrado é esse: ");
            System.out.println("--------------------------");
            for (Artista artista : artistas) {
                System.out.println(artista.getRazaoSocial()); 
                }
            }
        else {System.out.println("Não existe artistas cadastrados");}
    }

    public boolean aprovarLogin(Artista artista, String email, String senha) {
        if(artista.getEmail().equals(email) && artista.getSenha().equals(senha)) {
            System.out.println("Login efetuado com sucesso");
            aprovarLogin = true;
        } else {if (artista.getEmail().equals(email)) {System.out.println("Senha divergente");
            aprovarLogin = false;}
            else if(!artista.getEmail().equals(email)) {System.out.println("Email não encontrado");
        aprovarLogin = false;}}
        return aprovarLogin;
    }

    public boolean aprovarEstabelecimento(Estabelecimento estabelecimento, String email, String senha) {
        if(estabelecimento.getEmail().equals(email) && estabelecimento.getSenha().equals(senha)) {
            System.out.println("Login efetuado com sucesso");
            aprovarLogin = true;
        } else {if (estabelecimento.getEmail().equals(email)) {System.out.println("Senha divergente");
            aprovarLogin = false;}
            else if(!estabelecimento.getEmail().equals(email)) {System.out.println("Email não encontrado");
        aprovarLogin = false;}}
        return aprovarLogin;
    }

    public int quantiaArtistas() {
        return artistas.size();
    }
}
