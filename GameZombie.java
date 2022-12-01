import java.util.Scanner;

public class GameZombie {

    static Scanner input = new Scanner(System.in);

    //metodo Menu com opção para entrar ou sair do jogo.
    public static int menu() {
        int opcao;
        String nome, sexo = null;

        do {
            // Menu inicial do jogo.
            System.out.println("*------------ Walking Dead ---------------*");
            System.out.println("Seja bem - vindo(a) ao nosso jogo!");
            System.out.println("Para continuar, digite alguma das opções a seguir:");
            System.out.println("           =================================");
            System.out.println("           |     1 - Entrar no jogo.       |");
            System.out.println("           |_______________________________|");
            System.out.println("           |                               |");
            System.out.println("           |     2 - Sair do jogo.         |");
            System.out.println("           =================================\n");
            System.out.println("Digite uma das opções:");
            opcao = input.nextInt();

            switch (opcao) { //Este código foi feito para o usuario escolher entre 1 para iniciar o jogo e 2 para sair.
                case 1:
                    break;
                case 2:
                    System.exit(0);//Caso a opção seja 2, o jogo encerra, (Você vera muito desse mesmo código durante todo o jogo)
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 1 && opcao != 2); // Este código foi feito para repetir o código acima até que uma das opções sejam selecionadas.
        return opcao;
    }

    //metodo para escolher nome do jogador.
    public static String nomedoJogador() { //Função feita para criação do personagem 

        String nomejogador; //Utilizada em todo o enredo, aqui se define o nome do personagem principal que ira aparecer no texto do jogo.
        System.out.println("Ok! Agora vamos dar inicio a criação do seu personagem.");
        System.out.println("Digite seu nome: ");
        input.nextLine();
        nomejogador = input.nextLine();
        return nomejogador;
    }

    //metodo para escolher sexo do jogador.
    public static String sexodoJogador() { //Função criada para selecionar o sexo do(a) jogador(a) principal.
        String sexo = null;
        for (int cont = 1; cont <= 3; cont++) { //Definindo um laço de repetição para escolha do sexo.
            System.out.println("Digite o sexo:  \nOpções: (Homem) ou (Mulher).");
            sexo = input.nextLine().toLowerCase(); //toLowerCase utilizado para tudo que o usúario digitar em Maiúsculo ficar em minúsculo, ou seja não ira fazer diferença se digitar HOMEM ou homem.

            if (cont >= 1 && cont < 3) { // Aqui é feito uma repetição que se a opçao for diferente de "homem" ou "mulher" aparecer a mensagem sexo inválido! Tente novamente...".
                if (!"mulher".equals(sexo) && !"homem".equals(sexo)) {
                    System.out.println("Sexo inválido! Tente novamente...");
                } else {
                    break;
                }
            } else if (cont == 3 && !"mulher".equals(sexo) && !"homem".equals(sexo)) { // Aqui foi definido um encerramento de jogo caso ele erre o sexo 3 vezes.
                System.out.println("Você errou muitas vezes. Inicie o jogo novamente...");
                System.exit(0);
            }
        }
        return sexo;
    }

    //metodo que conta a história do game. Nessa etapa o jogador decide por qual caminho quer seguir,
    // e cada opcão segue uma história diferente. Após escolher o metodo decisao trilha o caminho.
    public static String historia(String nomejogador) { // Esta função é para dar inicio a historia do jogo 
        String historia;

        do {
            System.out.println("Bem-vindo ao caos, " + nomejogador + ". Você é um personagem que vive no país mais infectado de todo mundo,\n"
                    + "Há cerca de trinta anos o governo decidiu usar as cavernas perto da cidade para guardar urânio e outros lixos radioativos.\n"
                    + "Ao longo dos anos a radiação foi afetando a população morta, alterando as células dos mortos e criando monstros mortos vivos.\n"
                    + "A aventura se passa em uma pequena cidade do interior, onde os mortos saem das tumbas e invadem a cidade contaminando a todos.\n"
                    + "Uma hipótese sobrenatural do acontecido dá a entender que espíritos ou demônios usaram a radiação para trazer os mortos de volta \n"
                    + "Outra explicação, mais científica, seria o fato de que a radiação criou ou ativou um tipo de vírus que traz os mortos de volta a vida.\n"
                    + "As criaturas mortas da região começam a voltar à vida aos poucos, até que um dia o fenômeno atinge massa crítica,\n"
                    + "e milhares de mortos vivos saem das tumbas e dos morgues da cidade e começam a invadir o local.\n"
                    + "O caos que se segue faz com que o exército vá para a cidade e bloqueie todas as saídas, deixando a população de quarentena.\n"
                    + "Dentro da cidade, você terá que sobreviver durante o tempo da quarentena, ou poderá fugir enfrentando o bloqueio do exército.\n"
                    + "Objetivo: Você terá que sobreviver até os cientistas fizerem o antídoto para esse virus, tentando escapar dos zumbis, lutando por comida e água ou tentando quebrar a barreira do exército.\n"
                    + "Existem relatos no maxímo em 1 mês, os cientistas vão ter criado o antídoto contra o virus.\n");

            System.out.println(" - " + nomejogador + " no dia 1, você acabou de acordar e logo tem que decidir entre duas escolhas.\n");
            System.out.println(nomejogador + ": O que devo fazer? Na escolha A é aonde posso encontrar suprimentos para me manter durante esses 3 dias. \n"
                    + "\n"
                    + "Mas também posso ir pelo caminho B que é procurar por armamento e enfrentar o exército, com esse escolha eu saíria mais rapido desse caos, mas enfrentaria outros problemas, \n"
                    + "estou indeciso, para onde devo ir?\n");
            System.out.println("");
            System.out.println("-----------------------ESCOLHA O CAMINHO--------------------------\n"
                    + "(A) Procurar por suprimentos\n"
                    + "(B) Ir atrás de armamento.");

            historia = input.nextLine().toLowerCase();

            if ("a".equals(historia)) {
                System.out.println("Certo, vou procurar por suprimento, é melhor, assim não precisarei enfrentar o exército.\n");
                break;
            }
            if ("b".equals(historia)) {
                System.out.println("Preciso ter cuidado, pois não terei que enfrentar apenas os Zumbis\n");
                break;
            } else {
                System.out.println("Opção inválida, insira opções entre a ou b por gentileza.\n");

            }
        } while (!"a".equals(historia) || !"b".equals(historia));
        return historia;
    }
        
        public static String desafio01_A(String nomejogador) { //Função criada para o primeiro desafio, resulta ao final bom caso a escolha do jogador foi a
            String desafio01A = null;
            Boolean tentativa = false;
            do {
                System.out.println("- No começo da manhã, " + nomejogador + " decide sair de casa para procurar suprimentos levando apenas,\n"  
                		+ "uma faca que pegou em sua casa... E no caminho se depara com um zumbi no caminho de um mercado da região\n"
                        + "Mas para conseguir sobreviver precisará de alimento e para conseguir, terá que enfrentar o zumbi.\n");
                System.out.println("");
                System.out.println("------------QUESTÃO DESAFIO-------------");
                System.out.println("(Você inicialmente possui uma faca\n"
                        + "utilizar a faca é arriscado, pois você entrará em uma distancia não segura diante a um zumbi\n"
                        + "Porem, se decidir passar por ele sem o enfrentar terá que se passar por um zumbi, mas tem o risco de ser notado e atacado."
                        + "Só tem um jeito de matar um zumbi, que é perfurar seu cérebro.\n"
                        + "\n");
                System.out.println("------------RESPONDA O DESAFIO-----------");
                System.out.println("De acordo com a situação, qual saída seria a melhor para ir até o supermercado? \n"
                        + "(A)Enfrentar o zumbi \n"
                        + "(B)Passar despercebido se passando por um zumbi\n");                       
                System.out.println("Responda:");
                desafio01A = input.nextLine().toLowerCase();

                switch (desafio01A.charAt(0)) {//Escolhas múltiplas das questões do desafio, letra A para correta, b.
                    case 'a':
                        System.out.println("Parabéns você derrotou o zumbi e conseguiu chegar até o mercado\n");
                        System.out.println("Você acabou com ele!\n");
                        break;
                    case 'b':
                        System.out.println("Você errou! Ele te notou e devorou você! ");
                        System.out.println("Você perdeu o jogo!");
                        System.exit(0);
                        break;               
                    default:
                        System.out.println("Opção invalida!");
                        System.exit(0);
                        break;
                }
            
            } while (!"a".equals(desafio01A));

            return desafio01A;
        }
        
        public static String desafio01_B(String nomejogador) { //Funções com o final B se resulta numa escolha ruim
            String desafio01B = null;
            for (int i = 0; i < 2; i++) {
                System.out.println("- Em meio de uma tempestade, " + nomejogador + " você sai para pegar armamentos em uma base militar abandonada\n"
                        + "\n"
                        + "No caminho você encontra uma base militar na porta de uma das estradas para a saída da cidade infectada,\n"
                        + "Porém você nota que tem muitos militares armados impedindo as pessoas de saírem, com medo de ser alguma pessoa infectada e acabar infectando outras cidades\n"
                        + "\n");
                System.out.println("");
                System.out.println("------------QUESTÃO DESAFIO-------------");
                System.out.println("Você pode tentar passar pela barreira do exército sem ser notado, \n"
                        + "você precisa tentar passar pela mata ao lado para não ser notado, porém pode ter alguns soldados camuflados lá... \n"
                        + "Ou, você pode pegar armamento na base militar e enfrentar a base do exército e sair da cidade, mas lembre-se... Você está sozinho!\n"
                        + "\n");
                System.out.println("------------RESPONSA O DESAFIO-----------");
                System.out.println("Com base nas suas opções, qual seria a melhor saída?\n"
                        + "(A)Fugir pela mata\n"
                        + "(B)Enfrentar o Exército\n");
                System.out.println("Responda:");
                desafio01B = input.nextLine().toLowerCase();

                switch (desafio01B.charAt(0)) {//Escolhas múltiplas das questões do desafio, todas incorretas 
                case 'a':
                    System.out.println("Você foi abatido por um soldado que estava camuflado, que escolha ruim");
                    System.out.println("Você perdeu o jogo!");
                    System.exit(0);
                    break;
                case 'b':
                    System.out.println("Você foi morto pelo exército, ficou como uma peneira!");
                    System.out.println("Você perdeu o jogo!");
                    System.exit(0);
                    break;               
                default:
                    System.out.println("Opção invalida!");
                    System.exit(0);
                    break;
                }

            }
            return desafio01B;
        }

        public static String desafio02_A(String nomejogador) {//Função criada para o primeiro desafio, resulta ao final 
            String desafio02A = null;
            for (int i = 0; i < 2; i++) {
                System.out.println("- Ao derrotar o zumbi e chegar ao mercado, você se depara com duas portas uma delas está todo o estoque do mercado\n"
                        + "O problema é que você não sabe em qual delas é a certa\n"
                        + "e conseguiria tranquilamente se manter até o momento que os cientitas criem um antídoto\n"
                        + "Na porta da esquerda você repara que tem marcas de sangue pela maçaneta.\n"
                        + "Já na da direita a porta está intacta, porém você nota que vem algum barulho de lá! \n"
                        + "\n"
                        + "Mas, chega de pensar pois não é seguro ficar aqui nos corredores do mercado...");
                System.out.println("");
                System.out.println("-------------------QUESTÃO DESAFIO--------------------------\n"
                        + "(A) Entrar na porta da Esquerda\n"
                        + "(B) Entrar na porta da Direita|\n");
                System.out.println("Responda: ");
                desafio02A = input.nextLine().toLowerCase();
                
            switch (desafio02A.charAt(0)) {
            case 'a':
                System.out.println("Parabéns, você conseguiu encontrar o Estoque de Alimentos!\n"
                		+ "Apesar da porta estar suja de sangue você enfrentou seu medo e se deu bem...\\n"
                		+ "Conseguiu encontrar mantimentos para aguentar até o final da epidemia de zumbis"
                		+ "Você venceu o jogo!!!");

                break;
            case 'b':
                System.out.println("O barulho que vinha da porta que você escutou não foi por acaso, TINHAM MUITOS ZUMBIS LÁ DENTRO");
                System.out.println("Você foi devorado.");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);
                break;               
            default:
                System.out.println("Opção invalida!");
                System.exit(0);
                break;
            }
           }
			return desafio02A;

        }
        
    public static void main(String[] args) {
        // Menu principal do jogo.
        menu();
        // Criando nome do jogador.
        String nomejogador = nomedoJogador();
        // Criando sexo do jogador
        sexodoJogador();
        // História do jogo.
        String historia = historia(nomejogador);
        
        
    }
}

