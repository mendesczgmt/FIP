import java.util.ArrayList;
import java.util.List;

class Artista extends Usuario {
    boolean verdade = true;
    int escolhas;
    Usuario usuario;
    Vegas vegas;
    private Agenda[][] show;
    private boolean status;

    List <String> artes = new ArrayList<>();  
    List <String> incluirArtes = new ArrayList<>();

    public Artista(String razaoSocial, String telefoneContato, Endereco endereco, String email, String senha,
        boolean equipamentos) {
            super(razaoSocial, telefoneContato, endereco, email, senha, equipamentos);
            this.show = new Agenda[30][24];
            this.status = true;
    }

    public int getEscolhas() {
        return escolhas;
    }

    public void setEscolhas(int escolhas) {
        this.escolhas = escolhas;
    }

    public List<String> getArtes() {
        return artes;
    }

    public void setArtes(List<String> artes) {
        this.artes = artes;
    }

    public List<String> getIncluirArtes() {
        return incluirArtes;
    }

    public void setIncluirArtes(List<String> incluirArtes) {
        this.incluirArtes = incluirArtes;
    }

    public Agenda[][] getShow() {
        return show;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setShow(int dia, int hInicio, int hFim) {
        this.show[dia][hInicio] = new Agenda(dia, hInicio, hFim);
    }

    public void marcarShow(int dia, int hInicio, int hFim){
        if (disponibilidade(dia, hInicio, hFim)){
            setShow(dia, hInicio, hFim);
            System.out.println("Agendamento realizado com sucesso!");
        }else {
            System.out.println("Horário inválido!");
        }
    }

    public void mudarSenha(Artista artista, String senha) {
        setSenha(senha);
        System.out.println("Senha alterada com sucesso");
    }

    public void mudarEnderenco(Endereco endereco) {
        setEndereco(endereco);
        System.out.println("Endereço alterado com sucesso");
    }


    public void mudarEquipamentos(Artista artista,Boolean equipamentos) {
        if(isEquipamentos() == true)  {
            System.out.println("Os status de possuir equipamentos foram alterados para não possui");
            setEquipamentos(equipamentos);
        }
        else {
            System.out.println("Os status de não possui equipamentos foram alterados para Possui");
            setEquipamentos(equipamentos);
        }
    }

    public void mudarEmail(String email) {
        System.out.printf("O email foi atualizado de %s ", getEmail());
        setEmail(email);
        System.out.printf("para %s \n", getEmail());
    }


    public void mudarRazao(Artista artista, String senha) {
        setSenha(senha);
        System.out.println("Razão social alterada com sucesso");
    }

    public void mudarContato(Artista artista,String contato) {
        setSenha(senha);
        System.out.println("Contato de telefone alterado com sucesso");
    }

    //Verifica se agenda está vazia ou se existe algum conflito de horário
    public boolean disponibilidade(int dia, int hInicio, int hFim){
        if (hInicio != hFim){

            for (int i=0; i < getShow()[dia].length; i++){
                if (getShow()[dia][i] != null){
                    if ((hInicio > getShow()[dia][i].gethFinal() || hInicio < getShow()[dia][i].gethFinal()) &&
                            (hFim < getShow()[dia][i].gethInicial() || hFim > hInicio) &&
                            (hInicio < getShow()[dia][i].gethInicial() || hInicio > getShow()[dia][i].gethFinal() )){
                        setStatus(isStatus() && true);
                    }else {
                        setStatus(isStatus() && false);
                    }
                }
            }
        }else {
            setStatus(false);
        }

        return isStatus();
    }

    //Exibe todos os shows salvos na agenda

    public void exibirShows(){
        for (int d=0; d<getShow().length; d++){

            if (getShow()[d] != null){

                for (int h=0; h<getShow()[d].length; h++){

                    if (getShow()[d][h] != null){

                        System.out.println(getShow()[d][h].toString());

                    }

                }

            }

        }

    }
    
}
