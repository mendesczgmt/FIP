import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //--------------------------------------
        Scanner input = new Scanner(System.in);
        Vegas gerenciador = new Vegas();
        boolean verdade = true;
        boolean verdade1 = true;
        boolean menuLogin = true;
        boolean menuLogin1 = true;
        boolean equipamentos;
        boolean formal;
        String email;
        String senha;
        String razaoSocial;
        String telefoneContato;
        String cep;
        String rua;
        String bairro;
        int resposta;
        int numero;
        int dia;
        int hIncio;
        int hFim;
        
        //--------------------------------------
        Endereco endereco1 = new Endereco("000", "Rua do Santos", "Centro", 198);
        Artista artista1 = new Artista("Mendes", "(83)9999-9999", endereco1, "testeads@gmail.com", "233", false);
        gerenciador.adicionarArtista(artista1);
        Estabelecimento estabelecimento1 = new Estabelecimento("Barril 083", "3421-1234", endereco1, "barril@gmail.com", "233", true, true);
         //--------------------------------------
        while(verdade == true) {
            System.out.println("---------- SEJA BEM VINDO(A) AO VEGAS ----------");
            System.out.println("--- MENU ---");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastro");
            System.out.println("3 - Sair");
            System.out.print("Digite sua resposta: ");
            resposta = input.nextInt();
         //--------------------------------------
            switch (resposta) {
                case 1:
                    System.out.println("--- MENU ---");
                    System.out.println("1- Artista");
                    System.out.println("2- Estabelecimento");
                    System.out.print("Digite sua resposta: ");
                    resposta = input.nextInt();
                    switch(resposta) {
                        case 1:
                            System.out.print("Digite seu email: ");
                            email = input.next();
                            System.out.print("Digite sua senha: ");
                            senha = input.next();
                            if(gerenciador.aprovarLogin(artista1, email, senha) == true) {
                                menuLogin = true;
                                while(menuLogin == true) {
                                System.out.println("--- MENU ---");
                                System.out.println("1- Mostrar artistas");
                                System.out.println("2- Mostrar estabelecimentos");
                                System.out.println("3- Mostrar agenda");
                                System.out.println("4- Cadastrar shows");
                                System.out.println("5- Configurações");
                                System.out.println("6- Sair");
                                System.out.print("Digite sua resposta: ");
                                resposta = input.nextInt();
                                switch(resposta) {
                                    case 1:
                                        gerenciador.mostrarArtistas();
                                        break;
                                    case 2:
                                        gerenciador.mostrarEstabelecimentos();
                                        break;
                                    case 3:
                                        artista1.exibirShows();
                                        break;
                                    case 4:
                                        System.out.print("Digite o dia que deseja marcar: ");
                                        dia = input.nextInt();
                                        System.out.print("Digite o horário inicial que deseja marcar: ");
                                        hIncio = input.nextInt();
                                        System.out.print("Digite o horário final que deseja marcar: ");
                                        hFim = input.nextInt();
                                        artista1.marcarShow(dia, hIncio, hFim);
                                        break;
                                    case 5:
                                    menuLogin1 = true;
                                    while(menuLogin1 == true) {
                                    System.out.println("--- MENU ---");
                                    System.out.println("1- Mudar email");
                                    System.out.println("2- Mudar senha");
                                    System.out.println("3- Mudar contato");
                                    System.out.println("4- Mudar razão social");
                                    System.out.println("5- Mudar endereço");
                                    System.out.println("6- Mudar status de equipamento");
                                    System.out.println("7- Sair");
                                    System.out.print("Digite sua resposta: ");
                                    resposta = input.nextInt();
                                    switch(resposta) {
                                        case 1:
                                            System.out.println("Digite email: ");
                                            email = input.next();
                                            artista1.mudarEmail(email);
                                            break;
                                        case 2:
                                            System.out.println("Digite sua senha: ");
                                            senha = input.next();
                                            artista1.mudarSenha(artista1, senha);
                                            break;
                                        case 3:
                                            System.out.println("Digite seu contato: ");
                                            telefoneContato = input.next();
                                            artista1.mudarContato(artista1, telefoneContato);
                                            break;
                                        case 4:
                                            System.out.println("Digite sua razão social: ");
                                            razaoSocial = input.next();
                                            artista1.mudarRazao(artista1, razaoSocial);
                                            break;
                                        case 5:
                                            System.out.println("Endereço mudado com sucesso");
                                        case 6:
                                            System.out.println("--- MENU ---");
                                            System.out.println("1- Possuo equipamento");
                                            System.out.println("2- Não possuo equipamento");
                                            System.out.println("Digite sua resposta: ");
                                            resposta = input.nextInt();
                                            switch(resposta) {
                                                case 1:
                                                    equipamentos = true;
                                                    artista1.mudarEquipamentos(artista1, equipamentos);
                                                    break;
                                                case 2:
                                                    equipamentos = false;
                                                    artista1.mudarEquipamentos(artista1, equipamentos);
                                                    break;
                                            }
                                        case 7:
                                            menuLogin1 = false;
                                    }

                                }
                                    case 6:
                                        System.out.println("Deslogado com sucesso!");
                                        menuLogin = false;
                                        break;
                                }
                                }
                            }
                            else{System.out.println("Problema ao fazer login");}
                            break;
                            case 2:
                                System.out.print("Digite seu email: ");
                                email = input.next();
                                System.out.print("Digite sua senha: ");
                                senha = input.next();
                                if(gerenciador.aprovarEstabelecimento(estabelecimento1, email, senha) == true) {
                                    menuLogin = true;
                                    while(menuLogin == true) {
                                    System.out.println("--- MENU ---");
                                    System.out.println("1- Mostrar artistas");
                                    System.out.println("2- Mostrar estabelecimentos");
                                    System.out.println("3- Mostrar agenda");
                                    System.out.println("4- Cadastrar shows");
                                    System.out.println("5- Configurações");
                                    System.out.println("6- Sair");
                                    System.out.print("Digite sua resposta: ");
                                    resposta = input.nextInt();
                                    switch(resposta) {
                                        case 1:
                                            gerenciador.mostrarArtistas();
                                            break;
                                        case 2:
                                            gerenciador.mostrarEstabelecimentos();
                                            break;
                                        case 3:
                                            estabelecimento1.exibirShows();
                                            break;
                                        case 4:
                                            System.out.print("Digite o dia que deseja marcar: ");
                                            dia = input.nextInt();
                                            System.out.print("Digite o horário inicial que deseja marcar: ");
                                            hIncio = input.nextInt();
                                            System.out.print("Digite o horário final que deseja marcar: ");
                                            hFim = input.nextInt();
                                            estabelecimento1.marcarShow(dia, hIncio, hFim);
                                            break;
                                        case 5:
                                            menuLogin1 = true;
                                            while(menuLogin1 == true) {
                                            System.out.println("--- MENU ---");
                                            System.out.println("1- Mudar email");
                                            System.out.println("2- Mudar senha");
                                            System.out.println("3- Mudar contato");
                                            System.out.println("4- Mudar razão social");
                                            System.out.println("5- Mudar endereço");
                                            System.out.println("6- Mudar status de equipamento");
                                            System.out.println("7- Sair");
                                            System.out.print("Digite sua resposta: ");
                                            resposta = input.nextInt();
                                            switch(resposta) {
                                                case 1:
                                                    System.out.println("Digite email: ");
                                                    email = input.next();
                                                    estabelecimento1.mudarEmail(email);
                                                    break;
                                                case 2:
                                                    System.out.println("Digite sua senha: ");
                                                    senha = input.next();
                                                    estabelecimento1.mudarSenha(estabelecimento1, senha);
                                                    break;
                                                case 3:
                                                    System.out.println("Digite seu contato: ");
                                                    telefoneContato = input.next();
                                                    estabelecimento1.mudarContato(estabelecimento1, telefoneContato);
                                                    break;
                                                case 4:
                                                    System.out.println("Digite sua razão social: ");
                                                    razaoSocial = input.next();
                                                    estabelecimento1.mudarRazao(estabelecimento1, razaoSocial);
                                                    break;
                                                case 5:
                                                    System.out.println("Endereço mudado com sucesso");
                                                case 6:
                                                    System.out.println("--- MENU ---");
                                                    System.out.println("1- Possuo equipamento");
                                                    System.out.println("2- Não possuo equipamento");
                                                    System.out.println("Digite sua resposta: ");
                                                    resposta = input.nextInt();
                                                    switch(resposta) {
                                                        case 1:
                                                            equipamentos = true;
                                                            estabelecimento1.mudarEquipamentos(estabelecimento1, equipamentos);
                                                            break;
                                                        case 2:
                                                            equipamentos = false;
                                                            estabelecimento1.mudarEquipamentos(estabelecimento1, equipamentos);
                                                            break;
                                                    }
                                                case 7:
                                                    menuLogin1 = false;
                                            }

                                        }
                                        case 6:
                                            System.out.println("Deslogado com sucesso!");
                                            menuLogin = false;
                                            break;
                                    }
                                    }
                                }
                                else{System.out.println("Problema ao fazer login");}
                                break;

                            
                                }
                            break;
                        
                                
                    
         //--------------------------------------
                case 2:
                    while(verdade1 == true) {
                        System.out.println("--- MENU ---");
                        System.out.println("1- Artista");
                        System.out.println("2- Estabelecimento");
                        System.out.print("Digite sua resposta: ");
                        resposta = input.nextInt();
                        switch (resposta) {
                            case 1:
                                System.out.print("Digite seu nome artístico: ");
                                razaoSocial = input.next();
                                System.out.print("Digite seu email: ");
                                email = input.next();
                                System.out.print("Digite sua senha: ");
                                senha = input.next();
                                System.out.print("Digite seu telefone para contato: ");
                                telefoneContato = input.next();
                                System.out.println("Você possui equipamentos própios para seus shows?");
                                System.out.print("1- Sim\n2- Não\nResposta: ");
                                resposta = input.nextInt();
                                if(resposta == 1) {
                                    equipamentos = true;
                                }else {
                                    equipamentos = false;
                                }
                                System.out.println("Vamos cadastrar seu endereço ");
                                System.out.print("Digite o seu cep: ");
                                cep = input.next();
                                System.out.println("Digite sua Rua: ");
                                rua = input.next();
                                System.out.print("Digite seu bairro: ");
                                bairro = input.next();
                                System.out.print("Digite o número da sua casa: ");
                                numero = input.nextInt();

                                Endereco endereco = new Endereco(cep, rua, bairro, numero);
                                Artista artista = new Artista(razaoSocial, telefoneContato, endereco, email, senha, equipamentos);
                                gerenciador.adicionarArtista(artista);
                                break;
         //--------------------------------------
                            case 2:
                                System.out.print("Digite sua razão social: ");
                                razaoSocial = input.next();
                                System.out.print("Digite o email de sua empresa: ");
                                email = input.next();
                                System.out.print("Digite sua senha: ");
                                senha = input.next();
                                System.out.print("Digite o telefone para contato da sua empresa: ");
                                telefoneContato = input.next();
                                System.out.println("Sua empresa possui equipamentos própios para seus shows?");
                                System.out.print("1- Sim\n2- Não\nResposta: ");
                                resposta = input.nextInt();
                                if(resposta == 1) {
                                    equipamentos = true;
                                }else {
                                    equipamentos = false;
                                }
                                System.out.println("Sua empresa é formal?");
                                System.out.print("1- Sim\n2- Não\nResposta: ");
                                resposta = input.nextInt();
                                if(resposta == 1) {
                                    formal = true;
                                }else {
                                    formal = false;
                                }
                                System.out.println("Vamos cadastrar seu endereço ");
                                System.out.print("Digite o seu cep: ");
                                cep = input.next();
                                System.out.print("Digite sua Rua: ");
                                rua = input.next();
                                System.out.print("Digite seu bairro: ");
                                bairro = input.next();
                                System.out.print("Digite o número da sua empresa: ");
                                numero = input.nextInt();

                                Endereco endereco2 = new Endereco(cep, rua, bairro, numero);
                                Estabelecimento estabelecimento = new Estabelecimento(razaoSocial, telefoneContato, endereco2, email, senha, equipamentos, formal);
                                gerenciador.adicionarEstabelecimento(estabelecimento);
                        }
                        verdade1 = false;
                        
                    }
                    break;
                case 3:
                    System.out.println("Volte sempre!!!");
                    verdade = false;
                    break;
            }

        }
        
       
}
}