package SistemaDeCombate;

import java.util.Scanner;
import java.util.Random;

public class SistemaDeCombate {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        
        Jogador jogador = new Jogador();
        Adversario adversario1 = new Adversario();
        Adversario adversario2 = new Adversario();
        Adversario adversario3 = new Adversario();
        Adversario adversario4 = new Adversario();
        Adversario adversario5 = new Adversario();
        Adversario adversario6 = new Adversario();
        
        Arma armaDoJogador = new Arma();
        //Armas iniciais
        Arma arma1 = new Arma();
        Arma arma2 = new Arma();
        Arma arma3 = new Arma();
        //Armas avançadas
        Arma arma4 = new Arma();
        Arma arma5 = new Arma();
        Arma arma6 = new Arma();
        
        Armadura armaduraDoJogador = new Armadura();
        //Armaduras iniciais
        Armadura armadura1 = new Armadura();
        Armadura armadura2 = new Armadura();
        Armadura armadura3 = new Armadura();
        //Armaduras avançadas
        Armadura armadura4 = new Armadura();
        Armadura armadura5 = new Armadura();
        Armadura armadura6 = new Armadura();

        int escolhaInicial;
        String nomeDoJogador;
        int vida = 0;
        int rolagemDeVida = 0;
        int adversarioSelecionado;
        int vitoria = 0;
        int confirmacao = 0;
        
        adversario1.setNomeDoAdversario("Golem");
        adversario1.setPontosDeVidaDoAdversario(20);
        adversario1.setVidaMaximaDoAdversario(adversario1.getPontosDeVidaDoAdversario());
        adversario1.setDanoDoAdversario(12);
        adversario1.setDefesaDoAdversario(18);
        adversario1.setAgilidadeDoAdversario(1.5);
        
        adversario2.setNomeDoAdversario("Lobisomem");
        adversario2.setPontosDeVidaDoAdversario(15);
        adversario2.setVidaMaximaDoAdversario(adversario2.getPontosDeVidaDoAdversario());
        adversario2.setDanoDoAdversario(14);
        adversario2.setDefesaDoAdversario(12);
        adversario2.setAgilidadeDoAdversario(9.5);
        
        adversario3.setNomeDoAdversario("Bugbear");
        adversario3.setPontosDeVidaDoAdversario(12);
        adversario3.setVidaMaximaDoAdversario(adversario3.getPontosDeVidaDoAdversario());
        adversario3.setDanoDoAdversario(10);
        adversario3.setDefesaDoAdversario(14);
        adversario3.setAgilidadeDoAdversario(6.5);
        
        adversario4.setNomeDoAdversario("Elfo negro");
        adversario4.setPontosDeVidaDoAdversario(42);
        adversario4.setVidaMaximaDoAdversario(adversario4.getPontosDeVidaDoAdversario());
        adversario4.setDanoDoAdversario(20);
        adversario4.setDefesaDoAdversario(20);
        adversario4.setAgilidadeDoAdversario(3.5);
        
        adversario5.setNomeDoAdversario("Bruxa");
        adversario5.setPontosDeVidaDoAdversario(40);
        adversario5.setVidaMaximaDoAdversario(adversario5.getPontosDeVidaDoAdversario());
        adversario5.setDanoDoAdversario(23);
        adversario5.setDefesaDoAdversario(18);
        adversario5.setAgilidadeDoAdversario(3.5);
        
        adversario6.setNomeDoAdversario("Kalameet");
        adversario6.setPontosDeVidaDoAdversario(100);
        adversario6.setVidaMaximaDoAdversario(adversario6.getPontosDeVidaDoAdversario());
        adversario6.setDanoDoAdversario(50);
        adversario6.setDefesaDoAdversario(20);
        adversario6.setAgilidadeDoAdversario(3.5);
        
        arma1.setNomeDaArma("Espada de Madeira (Leve)");
        arma1.setCategoriaDaArma(1);
        arma1.setConstanteDeDano(1);
        
        arma2.setNomeDaArma("Foice (Leve)");
        arma2.setCategoriaDaArma(1);
        arma2.setConstanteDeDano(7);
        
        arma3.setNomeDaArma("Espada Longa (Pesada)");
        arma3.setCategoriaDaArma(2);
        arma3.setConstanteDeDano(5);
        
        arma4.setNomeDaArma("Zweihander (Pesada)");
        arma4.setCategoriaDaArma(2);
        arma4.setConstanteDeDano(10);
        
        arma5.setNomeDaArma("Moonlight Greatsword (Pesada)");
        arma5.setCategoriaDaArma(2);
        arma5.setConstanteDeDano(12);
        
        arma6.setNomeDaArma("Rivers of Blood (Leve)");
        arma6.setCategoriaDaArma(1);
        arma6.setConstanteDeDano(18);
        
        armadura1.setNomeDaArmadura("Sem Armadura");
        armadura1.setConstanteDeDefesa(0);
        
        armadura2.setNomeDaArmadura("Armadura de Couro");
        armadura2.setConstanteDeDefesa(2);
        
        armadura3.setNomeDaArmadura("Armadura de Malha");
        armadura3.setConstanteDeDefesa(3);
        
        armadura4.setNomeDaArmadura("Bencao de Zeus");
        armadura4.setConstanteDeDefesa(5);
        
        armadura5.setNomeDaArmadura("Armadura Matadora de Dragao");
        armadura5.setConstanteDeDefesa(10);
        
        armadura6.setNomeDaArmadura("Armadura de Berserk");
        armadura6.setConstanteDeDefesa(18);
        
        while(true)
        {
            System.out.printf("\n");
            System.out.println(" /$$$$$$$                                                         /$$$$$$$                               ");
            System.out.println("| $$__  $$                                                       | $$__  $$                              ");
            System.out.println("| $$  \\ $$  /$$$$$$  /$$$$$$   /$$$$$$   /$$$$$$  /$$$$$$$       | $$  \\ $$  /$$$$$$  /$$$$$$$   /$$$$$$ ");
            System.out.println("| $$  | $$ /$$__  $$|____  $$ /$$__  $$ /$$__  $$| $$__  $$      | $$$$$$$  |____  $$| $$__  $$ /$$__  $$");
            System.out.println("| $$  | $$| $$  \\__/ /$$$$$$$| $$  \\ $$| $$  \\ $$| $$  \\ $$      | $$__  $$  /$$$$$$$| $$  \\ $$| $$$$$$$$");
            System.out.println("| $$  | $$| $$      /$$__  $$| $$  | $$| $$  | $$| $$  | $$      | $$  \\ $$ /$$__  $$| $$  | $$| $$_____/");
            System.out.println("| $$$$$$$/| $$     |  $$$$$$$|  $$$$$$$|  $$$$$$/| $$  | $$      | $$$$$$$/|  $$$$$$$| $$  | $$|  $$$$$$$");
            System.out.println("|_______/ |__/      \\_______/ \\____  $$ \\______/ |__/  |__/      |_______/  \\_______/|__/  |__/ \\_______/");
            System.out.println("                              /$$  \\ $$                                                                  ");
            System.out.println("                             |  $$$$$$/                                                                  ");
            System.out.println("                              \\______/                                                                   ");
            System.out.println("1- Comecar");
            System.out.println("2- Historia");
            System.out.println("3- Equipamentos");
            System.out.println("4- Creditos");
            System.out.println("5- Sair");
            escolhaInicial = input.nextInt();

            if(escolhaInicial == 1)
            {
                System.out.printf("\nInsira seu nome: ");
                nomeDoJogador = input.next();
                
                jogador.setNomeDoJogador(nomeDoJogador);
                System.out.println("Bem vindo, " + jogador.getNomeDoJogador() + "\n");
                
                for(int i = 0; i < 3; i++) 
                {
                    rolagemDeVida = gerador.nextInt(6) + 1;
                    System.out.printf("%d° rolagem de vida: %d\n", i + 1, rolagemDeVida);
                    vida += rolagemDeVida;
                }
                System.out.println("Total: " + vida);
                
                levelUp(jogador,15, vida);
                
                escolhaDeArma(armaDoJogador, arma1, arma2, arma3);
                
                escolhaDeArmadura(armaduraDoJogador, armadura1, armadura2, armadura3, jogador);
                
                armaduraDoJogador.setValorDeArmadura(armaduraDoJogador.getConstanteDeDefesa() + (int) (1.5 * jogador.getConstituicaoDoJogador()));
                
                adversarioSelecionado = gerador.nextInt(3);
                
                if(adversarioSelecionado == 0)
                {
                    vitoria = combate(adversario1, jogador, armaDoJogador, armaduraDoJogador);
                }
                else if(adversarioSelecionado == 1)
                {
                    vitoria = combate(adversario2, jogador, armaDoJogador, armaduraDoJogador);
                }
                else if(adversarioSelecionado == 2)
                {
                    vitoria = combate(adversario3, jogador, armaDoJogador, armaduraDoJogador);
                }
                
                if(vitoria == 1)
                {
                    System.out.println("Level Up!!!");
                    levelUp(jogador, 5, jogador.getVidaMaximaDoJogador());
                    
                    escolhaDeArmadura(armaduraDoJogador, armadura4, armadura5, armadura6, jogador);
                    
                    armaduraDoJogador.setValorDeArmadura(armaduraDoJogador.getConstanteDeDefesa() + (int) (1.5 * jogador.getConstituicaoDoJogador()));
                    
                    adversarioSelecionado = gerador.nextInt(2);
                    
                    if(adversarioSelecionado == 0)
                    {
                        vitoria = combate(adversario4, jogador, armaDoJogador, armaduraDoJogador);
                    }
                    else if(adversarioSelecionado == 1)
                    {
                        vitoria = combate(adversario5, jogador, armaDoJogador, armaduraDoJogador);
                    }
                    
                    if(vitoria == 1)
                    {
                        System.out.println("Level Up!!!");
                        levelUp(jogador, 10, jogador.getVidaMaximaDoJogador());
                        
                        escolhaDeArma(armaDoJogador, arma4, arma5, arma6);
                        
                        armaduraDoJogador.setValorDeArmadura(armaduraDoJogador.getConstanteDeDefesa() + (int) (1.5 * jogador.getConstituicaoDoJogador()));
                        
                        vitoria = combate(adversario6, jogador, armaDoJogador, armaduraDoJogador);
                        
                        if(vitoria == 1)
                        {
                            victory();
                            System.out.println("Apos eras, finalmente Kalameet foi derrotado.\n");
                            System.out.println("Seu olhar feroz que assustava todos que ousavam o desafiar nao surtiu efeito no corajoso heroi!\n");
                            System.out.println("Aquele que trouxe paz ao mundo...\n");
                            System.out.println("VIVA AO MAIOR HEROI DE TODOS OS TEMPOS: " + jogador.getNomeDoJogador() + "!!!\n");
                            break;
                        }
                        else
                        {
                            gameOver();
                            break;
                        }
                    }
                    else
                    {
                        gameOver();
                        break;
                    }
                }
                else
                {
                    gameOver();
                    break;
                }
            }
            else if(escolhaInicial == 2)
            {
                System.out.println("\nEra uma vez, em uma terra muito distante...\n");
                System.out.println("Criaturas misticas viviam no mesmo plano que os mortais, mas dentre elas existia uma que era mais temivel e perigosa que as outras.\n");
                System.out.println("Uma vez por ano, o dragao Kalameet sobrevoava as montanhas a caminho dos vilarejos proximos, onde usava sua forca e chamas negras para destruir tudo em seu caminho.\n");
                System.out.println("Durante eras, inumeros herois tentaram enfrentar e derrotar o grande dragao, mas ao se deparar com suas largas asas e escamas escuras como a noite, tremiam de medo.\n");
                System.out.println("Ate que um dia...\n");
            }
            else if(escolhaInicial == 3)
            {
                System.out.println("\nMecanicas");
                System.out.println("Armas Pesadas = K + d12 + 1,5*For.");
                System.out.println("Armas Leves = K + d6 + d6 + d4 + Des.");
                System.out.println("Armaduras = K + 1,5*Cons.");
                System.out.println("Poções = d6 + d6 + d6");
                System.out.println("\nArmas");
                System.out.println(arma1.getNomeDaArma() + ": K = " + arma1.getConstanteDeDano());
                System.out.println(arma2.getNomeDaArma() + ": K = " + arma2.getConstanteDeDano());
                System.out.println(arma3.getNomeDaArma() + ": K = " + arma3.getConstanteDeDano());
                System.out.println(arma4.getNomeDaArma() + ": K = " + arma4.getConstanteDeDano());
                System.out.println(arma5.getNomeDaArma() + ": K = " + arma5.getConstanteDeDano() + " Habilidade especial: Frostbyte (causa dano adicional após atacar quatro vezes (+7) e diminui o dano do oponente por um turno (-15))");
                System.out.println(arma6.getNomeDaArma() + ": K = " + arma6.getConstanteDeDano() + " Habilidade especial: Sangramento (causa dano adicional após atacar tres vezes (+10)");
                System.out.println("\nArmaduras");
                System.out.println(armadura2.getNomeDaArmadura() + ": K = " + (int) armadura2.getConstanteDeDefesa());
                System.out.println(armadura3.getNomeDaArmadura() + ": K = " + (int) armadura3.getConstanteDeDefesa());
                System.out.println(armadura4.getNomeDaArmadura() + ": K = " + (int) armadura4.getConstanteDeDefesa() + " Habilidade especial: 40% de chance de stunar quem o ataca");
                System.out.println(armadura5.getNomeDaArmadura() + ": K = " + (int) armadura5.getConstanteDeDefesa() + " Habilidade especial: Concede resistencia aos ataques de dragoes (-5) Nerfs : -1 de agilidade e fica fadigado a cada 5 turnos");
                System.out.println(armadura6.getNomeDaArmadura() + ": K = " + (int) armadura6.getConstanteDeDefesa() + " Nerfs: -4 de agilidade e perde 2 de vida a cada turno");
                System.out.println("\nVoltar ao menu (1)");
                confirmacao = input.nextInt();
            }
            else if(escolhaInicial == 4)
            {
                System.out.println("\nCriadores: Antonio Lucas e Enzo Guimaraes\n");
                System.out.println("\nASCII ARTs: Tua Xiong (Dragao vs Cavaleiro), Steven Maddison (Small Village)\n");
                System.out.println("\nVoltar ao menu (1)");
                confirmacao = input.nextInt();
            }
            else if(escolhaInicial == 5)
            {
                System.out.println("\nSaindo...\n");
                break;
            }
        }
    }
    
    public static int combate(Adversario adversarioGenerico, Jogador jogador, Arma arma, Armadura armadura)
    {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        
        Pocao pocoesDoJogador = new Pocao();
        Pocao pocoesDoAdversario = new Pocao();
        pocoesDoJogador.setQuantidadeDePocoes(3);
        pocoesDoAdversario.setQuantidadeDePocoes(3);
        
        double armaduraMaximaDoJogador = armadura.getValorDeArmadura();
        int defesaMaximaDoAdversario = adversarioGenerico.getDefesaDoAdversario();
        int escolhaDeAcaoDoJogador;
        int escolhaDeAcaoDoAdversario;
        double dano;
        int vida = 0;
        int cura = 0;
        int pocao;
        int stun = 0;
        boolean adversario_stun = false;
        int sangramento = 0;
        int frostbyte = 0;
        int fadiga = 0;
        boolean adversario_frostbyte = false;
        
        while(true) //while do combate
        {   
            if(adversarioGenerico.getNomeDoAdversario() == "Kalameet")
            {
                System.out.println("\n                                               _   __,----'~~~~~~~~~`-----.__");
                System.out.println("                                        .  .    `//====-              ____,-'~`");
                System.out.println("                        -.            \\_|// .   /||\\\\  `~~~~`---.___./");
                System.out.println("                  ______-==.       _-~o  `\\/    |||  \\\\           _,'`");
                System.out.println("            __,--'   ,=='||\\=_    ;_,_,/ _-'|-   |`\\   \\\\        ,'");
                System.out.println("         _-'      ,='    | \\\\`.    '',/~7  /-   /  ||   `\\.     /");
                System.out.println("       .'       ,'       |  \\\\  \\_  \"  /  /-   /   ||      \\   /");
                System.out.println("      / _____  /         |     \\\\.`-_/  /|- _/   ,||       \\ /");
                System.out.println("     ,-'     `-|--'~~`--_ \\     `==-/  `| \\'--===-'       _/`");
                System.out.println("               '         `-|      /|    )-'\\~'      _,--\"'");
                System.out.println("                           '-~^\\_/ |    |   `\\_   ,^             /\\");
                System.out.println("                                /  \\     \\__   \\/~               `\\__");
                System.out.println("                            _,-' _/'\\ ,-'~____-'`-/                 ``===\\");
                System.out.println("                           ((->/'    \\|||' `.     `\\.  ,                _||");
                System.out.println("             ./                       \\_     `\\      `~---|__i__i__\\--~'_/");
                System.out.println("            <_n_                     __-^-_    `)  \\-.______________,-~'");
                System.out.println("             `B'\\)                  ///,-'~`__--^-  |-------~~~~^'");
                System.out.println("             /^>                           ///,--~`-\\");
                System.out.println("            `  `                                       ");
            }
            System.out.println("\n" + adversarioGenerico.getNomeDoAdversario());
            System.out.println("Vida: " + adversarioGenerico.getPontosDeVidaDoAdversario() + "/" + adversarioGenerico.getVidaMaximaDoAdversario() + "\nPocoes: " + pocoesDoAdversario.getQuantidadeDePocoes() + "\nArmadura: " + adversarioGenerico.getDefesaDoAdversario() + "\nAgilidade: " + adversarioGenerico.getAgilidadeDoAdversario());
            System.out.println("\n" + jogador.getNomeDoJogador());
            System.out.println("Vida: " + jogador.getPontosDeVidaDoJogador() + "/" + jogador.getVidaMaximaDoJogador() + "\nPocoes: " + pocoesDoJogador.getQuantidadeDePocoes() + "\nArmadura: " + (int) armadura.getValorDeArmadura() + "\nAgilidade: " + jogador.getAgilidadeDoJogador());
            System.out.println("\n1- Atacar  2- Defender  3- Usar pocao");
            
            escolhaDeAcaoDoJogador = input.nextInt();
            if(armadura.getNomeDaArmadura() == "Armadura de Berserk")
            {   
                if(jogador.getPontosDeVidaDoJogador() > 2)
                {
                    jogador.setPontosDeVidaDoJogador(jogador.getPontosDeVidaDoJogador() - 2);
                }
            }
            else if(armadura.getNomeDaArmadura() == "Armadura Matadora de Dragao")
            {
                fadiga++;
            }
            if(escolhaDeAcaoDoJogador == 4)
            {
                System.out.println("\nCheat de aumentar vida\n");
                vida = 999;
                jogador.setPontosDeVidaDoJogador(vida);
                jogador.setVidaMaximaDoJogador(vida);
            }
            if(escolhaDeAcaoDoJogador == 5)
            {
                System.out.println("\nCheat de aumentar pocao\n");
                pocoesDoJogador.setQuantidadeDePocoes(99);
            }
            else if(escolhaDeAcaoDoJogador == 6)
            {
                System.out.println("\n" + jogador.getNomeDoJogador() + " venceu!!!\n");
                return 1; 
            }
            else if(escolhaDeAcaoDoJogador == 7)
            {
                System.out.println("\nSaindo...\n");
                break;
            }
            if(jogador.getAgilidadeDoJogador() > adversarioGenerico.getAgilidadeDoAdversario())
            {
                armadura.setValorDeArmadura(armaduraMaximaDoJogador);
                if(fadiga > 4)
                {
                    fadiga = 0;
                    System.out.println(jogador.getNomeDoJogador() + " esta afetado pela fadiga e nao pode se mover nesse turno!");
                }
                else
                {
                    if(escolhaDeAcaoDoJogador == 1)
                    {   
                        System.out.println("\n" + jogador.getNomeDoJogador() + " escolheu atacar!");
                        if(arma.getCategoriaDaArma() == 1)
                        {
                            dano = (int) (arma.getConstanteDeDano() + gerador.nextInt(8) + 1 + gerador.nextInt(8) + 1 + gerador.nextInt(6) + 1 + jogador.getDestrezaDoJogador() - adversarioGenerico.getDefesaDoAdversario());

                            if(arma.getNomeDaArma() == "Rivers of Blood (Leve)")
                            {
                                sangramento++;
                                if(sangramento >= 3)
                                {
                                    dano += 10;
                                    sangramento = 0;
                                    System.out.println("O adversario sofreu +10 de dano por Sangramento!");
                                }
                            }    
                        }
                        else
                        {
                            dano = (int) (arma.getConstanteDeDano() + gerador.nextInt(12) + 1 + 1.5*jogador.getForcaDoJogador() - adversarioGenerico.getDefesaDoAdversario());
                            if(arma.getNomeDaArma() == "Moonlight Greatsword (Pesada)")
                            {
                                frostbyte++;
                                if(frostbyte >= 4)
                                {
                                    dano += 7;
                                    frostbyte = 0;
                                    adversario_frostbyte = true;
                                    System.out.println("O adversario sofreu +7 de dano por frostbyte e seu dano foi reduzido para o proximo turno!");
                                }
                            }
                        }
                        if(dano <= 0)
                        {
                            dano = 1;
                        }
                        vida = adversarioGenerico.getPontosDeVidaDoAdversario();

                        vida -= dano;
                        adversarioGenerico.setPontosDeVidaDoAdversario(vida);
                        System.out.println("Dano: " + dano);

                        if(adversarioGenerico.getPontosDeVidaDoAdversario() <= 0)
                        {
                            System.out.println("\n" + jogador.getNomeDoJogador() + " venceu!!!\n");
                            return 1;
                        }
                    }
                    else if(escolhaDeAcaoDoJogador == 2)
                    {
                        System.out.println("\n" + jogador.getNomeDoJogador() + " escolheu defender! \nSua Defesa dobrou!");
                        armadura.setValorDeArmadura(2*armadura.getValorDeArmadura());
                    }
                    else if(escolhaDeAcaoDoJogador == 3)
                    {
                        if(pocoesDoJogador.getQuantidadeDePocoes() <= 0)
                        {
                            System.out.println("\n" + jogador.getNomeDoJogador() + " escolheu usar uma pocao, mas elas ja acabaram...");
                        }
                        else
                        {    
                            System.out.println("\n" + jogador.getNomeDoJogador() + " escolheu usar uma pocao!");

                            vida = jogador.getPontosDeVidaDoJogador();
                            cura = pocoesDoJogador.getValorDeCura();
                            pocao = pocoesDoJogador.getQuantidadeDePocoes();

                            vida += cura;
                            pocao--;

                            pocoesDoJogador.setQuantidadeDePocoes(pocao);

                            if(vida > jogador.getVidaMaximaDoJogador())
                            {
                                cura = jogador.getVidaMaximaDoJogador() - jogador.getPontosDeVidaDoJogador();
                                System.out.println("Cura: " + cura);
                                jogador.setPontosDeVidaDoJogador(jogador.getVidaMaximaDoJogador());
                            }
                            else
                            {
                                System.out.println("Cura: " + cura);
                                jogador.setPontosDeVidaDoJogador(vida);
                            }
                        }
                    }
                }   
                escolhaDeAcaoDoAdversario = gerador.nextInt(6);
                       
                adversarioGenerico.setDefesaDoAdversario(defesaMaximaDoAdversario);
                if(adversario_stun == true)
                {
                    System.out.println("\nO adversario esta stunado! \nNao consegue se mover!");
                    adversario_stun = false;
                }
                else
                {
                    if(escolhaDeAcaoDoAdversario == 0 || escolhaDeAcaoDoAdversario == 1 || escolhaDeAcaoDoAdversario == 2)
                    {
                        System.out.println("\n" + adversarioGenerico.getNomeDoAdversario() + " escolheu atacar!");

                        dano = (int) (adversarioGenerico.getDanoDoAdversario() - armadura.getValorDeArmadura());
                        if(adversarioGenerico.getNomeDoAdversario() == "Kalameet" && armadura.getNomeDaArmadura() == "Armadura Matadora de Dragao")
                        {
                            dano = dano - 5;
                        }
                        if(adversario_frostbyte == true)
                        {
                            dano = dano - 15;
                            adversario_frostbyte = false;
                            System.out.println("Dano de " + adversarioGenerico.getNomeDoAdversario() + " reduzido para esse ataque! (-15)");
                        }
                        if(dano <= 0)
                        {
                            dano = 1;
                        }
                        
                        vida = jogador.getPontosDeVidaDoJogador();

                        vida -= dano;
                        jogador.setPontosDeVidaDoJogador(vida);
                        System.out.println("Dano: " + dano);

                        if(jogador.getPontosDeVidaDoJogador() <= 0)
                        {
                            System.out.println("\nGAME OVER\n");
                            System.out.println("\nVoce falhou em sua missao e o dragao destruiu o vilarejo...\n");
                            return 0;
                        }

                        if(armadura.getNomeDaArmadura() == "Bencao de Zeus")
                        {
                            stun = gerador.nextInt(5) + 1;
                            if(stun == 1 || stun == 2)
                            {
                                System.out.println("\nO adversario foi stunado pelos raios!!!");
                                adversario_stun = true;
                            }
                        }    
                    }
                    else if(escolhaDeAcaoDoAdversario == 3 || escolhaDeAcaoDoAdversario == 4)
                    {
                        System.out.println("\n" + adversarioGenerico.getNomeDoAdversario() + " escolheu defender! \nSua Defesa dobrou!");
                        if(adversario_frostbyte == true)
                        {
                            adversario_frostbyte = false;
                        }

                        adversarioGenerico.setDefesaDoAdversario(2*adversarioGenerico.getDefesaDoAdversario());
                    }
                    else if(escolhaDeAcaoDoAdversario == 5)
                    {
                        if(adversario_frostbyte == true)
                        {
                            adversario_frostbyte = false;
                        }
                        if(pocoesDoAdversario.getQuantidadeDePocoes() <= 0)
                        {
                            System.out.println("\n" + adversarioGenerico.getNomeDoAdversario() + " escolheu usar uma pocao, mas elas ja acabaram...");
                        }
                        else
                        {    
                            System.out.println("\n" + adversarioGenerico.getNomeDoAdversario() + " escolheu usar uma pocao!");
                        
                            vida = adversarioGenerico.getPontosDeVidaDoAdversario();
                            cura = pocoesDoAdversario.getValorDeCura();
                            pocao = pocoesDoAdversario.getQuantidadeDePocoes();

                            vida += cura;
                            pocao--;

                            pocoesDoAdversario.setQuantidadeDePocoes(pocao);

                            if(vida > adversarioGenerico.getVidaMaximaDoAdversario())
                            {
                                cura = adversarioGenerico.getVidaMaximaDoAdversario() - adversarioGenerico.getPontosDeVidaDoAdversario();
                                System.out.println("Cura: " + cura);
                                adversarioGenerico.setPontosDeVidaDoAdversario(adversarioGenerico.getVidaMaximaDoAdversario());
                            }
                            else
                            {
                                System.out.println("Cura: " + cura);
                                adversarioGenerico.setPontosDeVidaDoAdversario(vida);
                            }
                        }
                    }
                }//if-else stun
            }      
            else if(adversarioGenerico.getAgilidadeDoAdversario() > jogador.getAgilidadeDoJogador())
            {
                escolhaDeAcaoDoAdversario = gerador.nextInt(6);
                
                adversarioGenerico.setDefesaDoAdversario(defesaMaximaDoAdversario);
                if(adversario_stun == true)
                {
                    System.out.println("\nO adversario esta stunado! \nNao consegue se mover!");
                    adversario_stun = false;
                }
                else
                {
                    if(escolhaDeAcaoDoAdversario == 0 || escolhaDeAcaoDoAdversario == 1 || escolhaDeAcaoDoAdversario == 2)
                    {
                        System.out.println("\n" + adversarioGenerico.getNomeDoAdversario() + " escolheu atacar!");

                        dano = (int) (adversarioGenerico.getDanoDoAdversario() - armadura.getValorDeArmadura());
                        if(adversarioGenerico.getNomeDoAdversario() == "Kalameet" && armadura.getNomeDaArmadura() == "Armadura Matadora de Dragao")
                        {
                            dano = dano - 5;
                        }
                        if(adversario_frostbyte == true)
                        {
                            dano = dano - 15;
                            adversario_frostbyte = false;
                            System.out.println("Dano de " + adversarioGenerico.getNomeDoAdversario() + " reduzido para esse ataque! (-15)");
                        }
                        if(dano <= 0)
                        {
                            dano = 1;
                        }
                        vida = jogador.getPontosDeVidaDoJogador();

                        vida -= dano;
                        jogador.setPontosDeVidaDoJogador(vida);
                        System.out.println("Dano: " + dano);

                        if(jogador.getPontosDeVidaDoJogador() <= 0)
                        {
                            System.out.println("\nGAME OVER\n");
                            System.out.println("\nVoce falhou em sua missao e o dragao destruiu o vilarejo...\n");
                            return 0;
                        }

                        if(armadura.getNomeDaArmadura() == "Bencao de Zeus")
                        {
                            stun = gerador.nextInt(5) + 1;
                            if(stun == 1 || stun == 2)
                            {
                                System.out.println("\nO adversario foi stunado pelos raios!!!");
                                adversario_stun = true;
                            }
                        }
                    }
                    else if(escolhaDeAcaoDoAdversario == 3 || escolhaDeAcaoDoAdversario == 4)
                    {
                        System.out.println("\n" + adversarioGenerico.getNomeDoAdversario() + " escolheu defender! \nSua Defesa dobrou!");

                        adversarioGenerico.setDefesaDoAdversario(2*adversarioGenerico.getDefesaDoAdversario());
                        if(adversario_frostbyte == true)
                        {
                            adversario_frostbyte = false;
                        }
                    }
                    else if(escolhaDeAcaoDoAdversario == 5)
                    {
                        if(adversario_frostbyte == true)
                        {
                            adversario_frostbyte = false;
                        }
                        if(pocoesDoAdversario.getQuantidadeDePocoes() <= 0)
                        {
                            System.out.println("\n" + adversarioGenerico.getNomeDoAdversario() + " escolheu usar uma pocao, mas elas ja acabaram...");
                            
                        }
                        else
                        {    
                            System.out.println("\n" + adversarioGenerico.getNomeDoAdversario() + " escolheu usar uma pocao!");
                        
                            vida = adversarioGenerico.getPontosDeVidaDoAdversario();
                            cura = pocoesDoAdversario.getValorDeCura();
                            pocao = pocoesDoAdversario.getQuantidadeDePocoes();

                            vida += cura;
                            pocao--;

                            pocoesDoAdversario.setQuantidadeDePocoes(pocao);

                            if(vida > adversarioGenerico.getVidaMaximaDoAdversario())
                            {
                                cura = adversarioGenerico.getVidaMaximaDoAdversario() - adversarioGenerico.getPontosDeVidaDoAdversario();
                                System.out.println("Cura: " + cura);
                                adversarioGenerico.setPontosDeVidaDoAdversario(adversarioGenerico.getVidaMaximaDoAdversario());
                            }
                            else
                            {
                                System.out.println("Cura: " + cura);
                                adversarioGenerico.setPontosDeVidaDoAdversario(vida);
                            }
                        }
                    }
                }//if-else stun
                
                armadura.setValorDeArmadura(armaduraMaximaDoJogador);
                if(fadiga > 4)
                {
                    fadiga = 0;
                    System.out.println(jogador.getNomeDoJogador() + " esta afetado pela fadiga e nao pode se mover nesse turno!");
                }
                else
                {
                    if(escolhaDeAcaoDoJogador == 1)
                    {
                        System.out.println("\n" + jogador.getNomeDoJogador() + " escolheu atacar!");
                        if(arma.getCategoriaDaArma() == 1)
                        {
                            dano = (int) (arma.getConstanteDeDano() + gerador.nextInt(6) + 1 + gerador.nextInt(6) + 1 + gerador.nextInt(4) + 1 + jogador.getDestrezaDoJogador() - adversarioGenerico.getDefesaDoAdversario());
                            if(arma.getNomeDaArma() == "Rivers of Blood (Leve)")
                            {
                                sangramento++;
                                if(sangramento >= 3)
                                {
                                    dano += 10;
                                    sangramento = 0;
                                    System.out.println("O adversario sofreu +10 de dano por Sangramento!");
                                }
                            }
                        }
                        else
                        {
                            dano = (int) (arma.getConstanteDeDano() + gerador.nextInt(12) + 1 + 1.5*jogador.getForcaDoJogador() - adversarioGenerico.getDefesaDoAdversario());
                            if(arma.getNomeDaArma() == "Moonlight Greatsword (Pesada)")
                            {
                                frostbyte++;
                                if(frostbyte >= 4)
                                {
                                    dano += 7;
                                    frostbyte = 0;
                                    adversario_frostbyte = true;
                                    System.out.println("O adversario sofreu +7 de dano por frostbyte e seu dano foi reduzido para o proximo turno!");
                                }
                            }
                        }
                        if(dano <= 0)
                        {
                            dano = 1;
                        }
                        vida = adversarioGenerico.getPontosDeVidaDoAdversario();

                        vida -= dano;
                        adversarioGenerico.setPontosDeVidaDoAdversario(vida);
                        System.out.println("Dano: " + dano);

                        if(adversarioGenerico.getPontosDeVidaDoAdversario() <= 0)
                        {
                            System.out.println("\n" + jogador.getNomeDoJogador() + " venceu!!!\n");
                            return 1;
                        }
                    }
                    else if(escolhaDeAcaoDoJogador == 2)
                    {
                        System.out.println("\n" + jogador.getNomeDoJogador() + " escolheu defender! \nSua Defesa dobrou!");
                        armadura.setValorDeArmadura(2*armadura.getValorDeArmadura());
                    }
                    else if(escolhaDeAcaoDoJogador == 3)
                    {   
                        if(pocoesDoJogador.getQuantidadeDePocoes() <= 0)
                        {
                            System.out.println("\n" + jogador.getNomeDoJogador() + " escolheu usar uma pocao, mas elas ja acabaram...");
                        }
                        else
                        {    
                            System.out.println("\n" + jogador.getNomeDoJogador() + " escolheu usar uma pocao!");

                            vida = jogador.getPontosDeVidaDoJogador();
                            cura = pocoesDoJogador.getValorDeCura();
                            pocao = pocoesDoJogador.getQuantidadeDePocoes();

                            vida += cura;
                            pocao--;

                            pocoesDoJogador.setQuantidadeDePocoes(pocao);

                            if(vida > jogador.getVidaMaximaDoJogador())
                            {
                                cura = jogador.getVidaMaximaDoJogador() - jogador.getPontosDeVidaDoJogador();
                                System.out.println("Cura: " + cura);
                                jogador.setPontosDeVidaDoJogador(jogador.getVidaMaximaDoJogador());
                            }
                            else
                            {
                                System.out.println("Cura: " + cura);
                                jogador.setPontosDeVidaDoJogador(vida);
                            }
                        }
                    }
                }
            } //if-else agilidade        
            
        } //while do combate
        
        return 0;
    }
    
    public static void levelUp(Jogador jogador, int pontos, int vida)
    {
        Scanner input = new Scanner(System.in);
        int totalDePontos = pontos;
        int pontoDestribuidoParaUmAtributo;
        
        System.out.println("\nDestribua pontos de atributo\n");
        
        while(true)
        {
            System.out.printf("Pontos Disponiveis: %d\n", totalDePontos);
            System.out.printf("Forca: ");
         
            pontoDestribuidoParaUmAtributo = input.nextInt();
            
            if(pontoDestribuidoParaUmAtributo <= totalDePontos && pontoDestribuidoParaUmAtributo >= 0)
            {
                jogador.setForcaDoJogador(pontoDestribuidoParaUmAtributo + jogador.getForcaDoJogador());
                break;
            }
        }

        totalDePontos -= pontoDestribuidoParaUmAtributo;  

        if(totalDePontos > 0)
        {
            while(true)
            {
                System.out.printf("Pontos Disponiveis: %d\n", totalDePontos);
                System.out.printf("Constituicao: ");

                pontoDestribuidoParaUmAtributo = input.nextInt();
                
                if(pontoDestribuidoParaUmAtributo <= totalDePontos && pontoDestribuidoParaUmAtributo >= 0)
                {
                    jogador.setConstituicaoDoJogador(pontoDestribuidoParaUmAtributo + jogador.getConstituicaoDoJogador());
                    break;
                }
            }
                  
            totalDePontos -= pontoDestribuidoParaUmAtributo;
        }
        if(totalDePontos > 0)
        {
            
            while(true)
            {
                System.out.printf("Pontos Disponiveis: %d\n", totalDePontos);
                System.out.printf("Agilidade: ");

                pontoDestribuidoParaUmAtributo = input.nextInt();
                if(pontoDestribuidoParaUmAtributo <= totalDePontos && pontoDestribuidoParaUmAtributo >= 0)
                {
                    jogador.setAgilidadeDoJogador(pontoDestribuidoParaUmAtributo + jogador.getAgilidadeDoJogador());
                    break;
                }
            }

            totalDePontos -= pontoDestribuidoParaUmAtributo;
        }
        if(totalDePontos > 0)
        {
            while(true)
            {
                System.out.printf("Pontos Disponiveis: %d\n", totalDePontos);
                System.out.printf("Destreza: ");

                pontoDestribuidoParaUmAtributo = input.nextInt();
                if(pontoDestribuidoParaUmAtributo <= totalDePontos && pontoDestribuidoParaUmAtributo >= 0)
                {
                    jogador.setDestrezaDoJogador(pontoDestribuidoParaUmAtributo + jogador.getDestrezaDoJogador());
                    break;
                }
            }
            
            totalDePontos -= pontoDestribuidoParaUmAtributo;
        }
        
        vida += jogador.getConstituicaoDoJogador();
        jogador.setPontosDeVidaDoJogador(vida);
        jogador.setVidaMaximaDoJogador(vida);
                
        System.out.println("\nPontos de vida: " + jogador.getVidaMaximaDoJogador());
        System.out.printf("Forca: %.0f\n", jogador.getForcaDoJogador());
        System.out.printf("Constituicao: %.0f\n", jogador.getConstituicaoDoJogador());
        System.out.println("Agilidade: " + jogador.getAgilidadeDoJogador());
        System.out.println("Destreza: " + jogador.getDestrezaDoJogador());
        System.out.println("Pocoes: 3");
    }
    
    public static void escolhaDeArma(Arma armaDoJogador, Arma armaGenerica1, Arma armaGenerica2, Arma armaGenerica3)
    {
        Scanner input = new Scanner(System.in);
        
        int escolhaDeArma;
        
        while(true)
        {
            System.out.println("\nEscolha uma arma\n");
            System.out.println("1-" + armaGenerica1.getNomeDaArma() + " 2-" + armaGenerica2.getNomeDaArma() + " 3-" + armaGenerica3.getNomeDaArma());
            escolhaDeArma = input.nextInt();
        
            if(escolhaDeArma == 1)
            {
                armaDoJogador.setNomeDaArma(armaGenerica1.getNomeDaArma());
                if(armaDoJogador.getNomeDaArma() == "Espada de Madeira (Leve)")
                {
                    System.out.println("\nVoce tem coragem");
                }
                else
                {
                    System.out.println("\n" + armaGenerica1.getNomeDaArma() + " selecionada.");
                }    
                armaDoJogador.setCategoriaDaArma(armaGenerica1.getCategoriaDaArma());
                armaDoJogador.setConstanteDeDano(armaGenerica1.getConstanteDeDano());
                break;
            }
            else if(escolhaDeArma == 2)
            {
                armaDoJogador.setNomeDaArma(armaGenerica2.getNomeDaArma());
                System.out.println("\n" + armaGenerica2.getNomeDaArma() + " selecionada."); 
                armaDoJogador.setCategoriaDaArma(armaGenerica2.getCategoriaDaArma());
                armaDoJogador.setConstanteDeDano(armaGenerica2.getConstanteDeDano());
                if(armaDoJogador.getNomeDaArma() == "Moonlight Greatsword (Pesada)")
                {
                    System.out.println("Habilidade especial: Frostbyte (causa dano adicional após atacar quatro vezes (+7) e diminui o dano do oponente por um turno (-15)");
                }    
                break;
            }
            else if(escolhaDeArma == 3)
            {
                armaDoJogador.setNomeDaArma(armaGenerica3.getNomeDaArma());   
                System.out.println("\n" + armaGenerica3.getNomeDaArma() + " selecionada.");
                if(armaDoJogador.getNomeDaArma() == "Rivers of Blood (Leve)")
                {
                    System.out.println("Habilidade especial: Sangramento (causa dano adicional após atacar tres vezes)");
                }
                
                armaDoJogador.setCategoriaDaArma(armaGenerica3.getCategoriaDaArma());
                armaDoJogador.setConstanteDeDano(armaGenerica3.getConstanteDeDano());
                break;
            }
            else
            {
                
            }
        }
    }
    
    public static void escolhaDeArmadura(Armadura armaduraDoJogador, Armadura armaduraGenerica1, Armadura armaduraGenerica2, Armadura armaduraGenerica3, Jogador jogador)
    {
        Scanner input = new Scanner(System.in);
        
        int escolhaDeArmadura;
        
        while(true)
        {
            System.out.println("\nEscolha uma armadura\n");
            System.out.println("1-" + armaduraGenerica1.getNomeDaArmadura() + " 2-" + armaduraGenerica2.getNomeDaArmadura() + " 3-" + armaduraGenerica3.getNomeDaArmadura());
            escolhaDeArmadura = input.nextInt();
        
            if(escolhaDeArmadura == 1)
            {
                armaduraDoJogador.setNomeDaArmadura(armaduraGenerica1.getNomeDaArmadura());
                if(armaduraDoJogador.getNomeDaArmadura() == "Sem Armadura")
                {
                    System.out.println("\nSem Armadura?");
                }
                else if(armaduraDoJogador.getNomeDaArmadura() == "Bencao de Zeus")
                {
                    System.out.println("\n" + armaduraGenerica1.getNomeDaArmadura() + " selecionada.");
                    System.out.println("\nSeu corpo eh envolto em raios");
                    System.out.println("\nHabilidade Especial: 40% de chance de stunar quem o atacar");
                }    
                
                armaduraDoJogador.setConstanteDeDefesa(armaduraGenerica1.getConstanteDeDefesa());
                break;
            }
            else if(escolhaDeArmadura == 2)
            {   
                armaduraDoJogador.setNomeDaArmadura(armaduraGenerica2.getNomeDaArmadura());
                System.out.println("\n" + armaduraGenerica2.getNomeDaArmadura() + " selecionada.");
                
                if(armaduraDoJogador.getNomeDaArmadura() == "Armadura Matadora de Dragao")
                {
                    System.out.println("\nBoa defesa, porem pesada (perdeu 1 de agilidade) e fica fadigado a cada 5 turnos");
                     
                    jogador.setAgilidadeDoJogador(jogador.getAgilidadeDoJogador() - 1);
                }
                
                armaduraDoJogador.setConstanteDeDefesa(armaduraGenerica2.getConstanteDeDefesa());
                break;
            }
            else if(escolhaDeArmadura == 3)
            {
                armaduraDoJogador.setNomeDaArmadura(armaduraGenerica3.getNomeDaArmadura());
                System.out.println("\n" + armaduraGenerica3.getNomeDaArmadura() + " selecionada.");
                
                if(armaduraDoJogador.getNomeDaArmadura() == "Armadura de Berserk")
                {
                    System.out.println("\nOtima defesa, porem bem pesada (perdeu 4 de agilidade) e perde 2 de vida a cada turno");

                    jogador.setAgilidadeDoJogador(jogador.getAgilidadeDoJogador() - 4);
                }
                
                armaduraDoJogador.setConstanteDeDefesa(armaduraGenerica3.getConstanteDeDefesa());
                break;
            }
            else
            {
                
            }
        }
    }
    public static void gameOver()
    {
        System.out.println("                                                         /===-_---~~~~~~~~~------____");
        System.out.println("                                                        |===-~___                _,-'");
        System.out.println("                         -==\\\\                         `//~\\\\   ~~~~`---.___.-~~");
        System.out.println("                     ______-==|                         | |  \\\\           _-~`");
        System.out.println("               __--~~~  ,-/-==\\\\                        | |   `\\        ,'");
        System.out.println("            _-~       /'    |  \\\\                      / /      \\      /");
        System.out.println("          .'        /       |   \\\\                   /' /        \\   /'");
        System.out.println("         /  ____  /         |    \\`\\.__/-~~ ~ \\ _ _/'  /          \\/'");
        System.out.println("        /-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`");
        System.out.println("                          \\_|      /        _)   ;  ),   __--~~");
        System.out.println("                            '~~--_/      _-~/-  / \\   '-~ \\");
        System.out.println("                           {\\__--_/}    / \\\\_&gt;- )&lt;__\\      \\");
        System.out.println("                           /'   (_/  _-~  | |__&gt;--&lt;__|      |");
        System.out.println("                          |0  0 _/) )-~     | |__&gt;--&lt;__|     |");
        System.out.println("                          / /~ ,_/       / /__&gt;---&lt;__/      |");
        System.out.println("                         o o _//        /-~_&gt;---&lt;__-~|      /");
        System.out.println("                         (^(~          /~_&gt;---&lt;__-/      _-~");
        System.out.println("                        ,/|           |~_&gt;---&lt;__-|     _-~");
        System.out.println("                     ,//('(           \\~_&gt;---&lt;__-\\   _-~");
        System.out.println("                    ( ( '))           \\~_&gt;---&lt;__-_-~~");
        System.out.println("                 `-)) )) (             \\~_&gt;---&lt;__-~");
        System.out.println("                ,/,'//( (               ////&gt--&lt////");
        System.out.println("              ,( ( ((, ))              ///,        ///,");
        System.out.println("            `~/  )` ) ,/|");
        System.out.println("          ._-~//( )/ )) `");
        System.out.println("           ;'( ')/ ,)(  ");
        System.out.println("          ' ') '( (/");
        System.out.println("            '   '  `");
        System.out.println("~         ~~          __");
        System.out.println("       _T      .,,.    ~--~ ^^");
        System.out.println(" ^^   // \\                    ~");
        System.out.println("      ][O]    ^^      ,-~ ~");
        System.out.println("   /''-I_I         _II____");
        System.out.println("__/_  /   \\ ______/ ''   /'\\_,__");
        System.out.println("  | II--'''' \\,--:--..,_/,.-{ },");
        System.out.println("; '/__\\,.--';|   |[] .-.| O{ _ }");
        System.out.println(":' |  | []  -|   ''--:.;[,.'\\,/");
        System.out.println("'  |[]|,.--'' '',   ''-,.    |");
        System.out.println("  ..    ..-''    ;       ''. '");
    }
    public static void victory()
    {
        System.out.println("\n                                   .''.");
        System.out.println("       .''.      .        *''*    :_\\/_:     .");
        System.out.println("      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.");
        System.out.println("  .''.: /\\ :    /)\\   ':'* /\\ *  : '..'.  -=:o:=-");
        System.out.println(" :_\\/_:'.:::.  | ' *''*    * '.\\'/.'_\\(/_'.':'.'");
        System.out.println(" : /\\ : :::::  =  *_\\/_*     -= o =- /)\\    '  *");
        System.out.println("  '..'  ':::' === * /\\ *     .'/.\\'.  ' .");
        System.out.println("      *        |   *..*         :");
        System.out.println("      ~         ~~          __");
        System.out.println("             _T      .,,.    ~--~ ^^");
        System.out.println("       ^^   // \\                    ~");
        System.out.println("            ][O]    ^^      ,-~ ~");
        System.out.println("         /''-I_I         _II____");
        System.out.println("      __/_  /   \\ ______/ ''   /'\\_,__");
        System.out.println("        | II--'''' \\,--:--..,_/,.-{ },");
        System.out.println("      ; '/__\\,.--';|   |[] .-.| O{ _ }");
        System.out.println("      :' |  | []  -|   ''--:.;[,.'\\,/");
        System.out.println("      '  |[]|,.--'' '',   ''-,.    |");
        System.out.println("        ..    ..-''    ;       ''. '");
    }
}
