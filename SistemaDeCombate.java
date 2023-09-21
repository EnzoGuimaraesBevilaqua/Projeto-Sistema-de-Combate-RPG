package SistemaDeCombate;

import java.util.Scanner;
import java.util.Random;
import java.util.Set;

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
        int adversarioSelecionado;
        int vitoria = 0;
        
        adversario1.setNomeDoAdiversario("Golem");
        adversario1.setPontosDeVidaDoAdiversario(20);
        adversario1.setVidaMaximaDoAdversario(adversario1.getPontosDeVidaDoAdiversario());
        adversario1.setDanoDoAdversario(12);
        adversario1.setDefesaDoAdversario(18);
        adversario1.setAgilidadeDoAdiversario(1.5);
        
        adversario2.setNomeDoAdiversario("Lobisomem");
        adversario2.setPontosDeVidaDoAdiversario(15);
        adversario2.setVidaMaximaDoAdversario(adversario2.getPontosDeVidaDoAdiversario());
        adversario2.setDanoDoAdversario(14);
        adversario2.setDefesaDoAdversario(12);
        adversario2.setAgilidadeDoAdiversario(9.5);
        
        adversario3.setNomeDoAdiversario("Bugbear");
        adversario3.setPontosDeVidaDoAdiversario(12);
        adversario3.setVidaMaximaDoAdversario(adversario3.getPontosDeVidaDoAdiversario());
        adversario3.setDanoDoAdversario(10);
        adversario3.setDefesaDoAdversario(14);
        adversario3.setAgilidadeDoAdiversario(6.5);
        
        adversario4.setNomeDoAdiversario("Elfo negro");
        adversario4.setPontosDeVidaDoAdiversario(42);
        adversario4.setVidaMaximaDoAdversario(adversario4.getPontosDeVidaDoAdiversario());
        adversario4.setDanoDoAdversario(30);
        adversario4.setDefesaDoAdversario(20);
        adversario4.setAgilidadeDoAdiversario(5.5);
        
        adversario5.setNomeDoAdiversario("Bruxa");
        adversario5.setPontosDeVidaDoAdiversario(40);
        adversario5.setVidaMaximaDoAdversario(adversario5.getPontosDeVidaDoAdiversario());
        adversario5.setDanoDoAdversario(32);
        adversario5.setDefesaDoAdversario(18);
        adversario5.setAgilidadeDoAdiversario(8.5);
        
        adversario6.setNomeDoAdiversario("Kalameet");
        adversario6.setPontosDeVidaDoAdiversario(100);
        adversario6.setVidaMaximaDoAdversario(adversario6.getPontosDeVidaDoAdiversario());
        adversario6.setDanoDoAdversario(50);
        adversario6.setDefesaDoAdversario(20);
        adversario6.setAgilidadeDoAdiversario(5.5);
        
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
        
        arma5.setNomeDaArma("Martelo Colossal (Pesada)");
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
        
        armadura4.setNomeDaArmadura("Armadura de Cavaleiro");
        armadura4.setConstanteDeDefesa(5);
        
        armadura5.setNomeDaArmadura("Armadura de Paladino");
        armadura5.setConstanteDeDefesa(8);
        
        armadura6.setNomeDaArmadura("Armadura de Berserk");
        armadura6.setConstanteDeDefesa(12);
        
        while(true)
        {
            System.out.println("1- Comecar");
            System.out.println("2- Historia");
            System.out.println("3- Sair");
            escolhaInicial = input.nextInt();

            if(escolhaInicial == 1)
            {
                System.out.printf("\nInsira seu nome: ");
                nomeDoJogador = input.next();
                
                if(nomeDoJogador.length() > 7)
                {
                    continue;
                }
                jogador.setNomeDoJogador(nomeDoJogador);
                System.out.println("Bem vindo, " + jogador.getNomeDoJogador() + "\n");

                //Calculo da Vida do Jogador
                for (int i = 0; i < 3; i++) 
                {
                    vida += gerador.nextInt(6) + 1;
                    System.out.println("Rolagem de vida: " + vida);
                }
                
                levelUp(jogador,15, vida);
                
                escolhaDeArma(armaDoJogador, arma1, arma2, arma3);
                
                escolhaDeArmadura(armaduraDoJogador, armadura1, armadura2, armadura3);
                
                armaduraDoJogador.setValorDeArmadura(armaduraDoJogador.getConstanteDeDefesa() + 1.5*jogador.getConstituicaoDoJogador());
                
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
                    levelUp(jogador, 5, jogador.getVidaMaximaDoJogador());
                    
                    escolhaDeArma(armaDoJogador, arma4, arma5, arma6);
                    
                    armaduraDoJogador.setValorDeArmadura(armaduraDoJogador.getConstanteDeDefesa() + 1.5*jogador.getConstituicaoDoJogador());
                    
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
                        levelUp(jogador, 10, jogador.getVidaMaximaDoJogador());
                        
                        escolhaDeArmadura(armaduraDoJogador, armadura4, armadura5, armadura6);
                        
                        armaduraDoJogador.setValorDeArmadura(armaduraDoJogador.getConstanteDeDefesa() + 1.5*jogador.getConstituicaoDoJogador());
                        
                        vitoria = combate(adversario6, jogador, armaDoJogador, armaduraDoJogador);
                        
                        if(vitoria == 1)
                        {
                            System.out.println("Apos eras, finalmente Kalameet foi derrotado.\n");
                            System.out.println("Seu olhar feroz que assustava todos que ousavam o desafiar nao surtiu efeito no corajoso heroi!\n");
                            System.out.println("Aquele que trouxe paz ao mundo...\n");
                            System.out.println("VIVA AO MAIOR HEROI DE TODOS OS TEMPOS: " + jogador.getNomeDoJogador() + "!!!\n");
                            break;
                        }
                        else
                        {
                            break;
                        }
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
            else if(escolhaInicial == 2)
            {
                System.out.println("\nEra uma vez, em uma terra muito distante…\n");
                System.out.println("Criaturas misticas viviam no mesmo plano que os mortais, mas dentre elas existia uma que era mais temivel e perigosa que as outras.\n");
                System.out.println("Uma vez por ano, o dragao Kalameet sobrevoava as montanhas a caminho dos vilarejos proximos, onde usava sua forca e chamas negras para destruir tudo em seu caminho…\n");
                System.out.println("Durante eras, inumeros herois tentaram enfrentar e derrotar o grande dragao, mas ao se deparar com suas largas asas e escamas escuras como a noite, tremiam de medo.\n");
                System.out.println("Ate que um dia...\n");
            }
            else if(escolhaInicial == 3)
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
        int pocao;
        
        while(true) //while do combate###########################################################################
        {
            System.out.println("\n" + adversarioGenerico.getNomeDoAdiversario() + "\n" + adversarioGenerico.getPontosDeVidaDoAdiversario());
            System.out.println("\n" + jogador.getNomeDoJogador() + "\n" + jogador.getPontosDeVidaDoJogador() + "\n");
            System.out.println("Pocoes do jogador: " + pocoesDoJogador.getQuantidadeDePocoes());
            System.out.println("Pocoes do adversario: " + pocoesDoAdversario.getQuantidadeDePocoes());
            System.out.printf("Armadura do jogador: %.0f\n", armadura.getValorDeArmadura());
            System.out.println("Armadura do adversario: " + adversarioGenerico.getDefesaDoAdversario());
            System.out.println("1- Atacar  2- Defender  3- Usar pocao");
            escolhaDeAcaoDoJogador = input.nextInt();
            
            if(escolhaDeAcaoDoJogador == 4)
            {
                System.out.println("\nCheat de aumentar vida");
                vida = jogador.getVidaMaximaDoJogador();
                jogador.setPontosDeVidaDoJogador(vida);
            }
            else if(escolhaDeAcaoDoJogador == 5)
            {
                System.out.println("\nCheat de vencer combate");
                return 1;
                    
            }
            else if(escolhaDeAcaoDoJogador == 6)
            {
                System.out.println("\nSaindo...\n");
                break;
            }
            if(jogador.getAgilidadeDoJogador() > adversarioGenerico.getAgilidadeDoAdiversario()) //teste
            {
                armadura.setValorDeArmadura(armaduraMaximaDoJogador);
                if(escolhaDeAcaoDoJogador == 1)
                {
                    if(arma.getCategoriaDaArma() == 1)
                    {
                        dano = (int) (arma.getConstanteDeDano() + gerador.nextInt(8) + 1 + gerador.nextInt(8) + 1 + gerador.nextInt(6) + 1 + jogador.getDestrezaDoJogador() - adversarioGenerico.getDefesaDoAdversario());
                    }
                    else
                    {
                        dano = (int) (arma.getConstanteDeDano() + gerador.nextInt(12) + 1 + 1.5*jogador.getForcaDoJogador() - adversarioGenerico.getDefesaDoAdversario());
                    }
                    if(dano <= 0)
                    {
                        dano = 1;
                    }
                    vida = adversarioGenerico.getPontosDeVidaDoAdiversario();
                            
                    vida -= dano;
                    adversarioGenerico.setPontosDeVidaDoAdiversario(vida);
                    System.out.println("\nDano do jogador: " + dano);
                            
                    if(adversarioGenerico.getPontosDeVidaDoAdiversario() <= 0)
                    {
                        System.out.println("\nJogador venceu\n");
                        return 1;
                    }
                }
                else if(escolhaDeAcaoDoJogador == 2)
                {
                    armadura.setValorDeArmadura(2*armadura.getValorDeArmadura());
                }
                else if(escolhaDeAcaoDoJogador == 3)
                {
                    if(pocoesDoJogador.getQuantidadeDePocoes() >= 1)
                    {
                        vida = jogador.getPontosDeVidaDoJogador();
                        pocao = pocoesDoJogador.getQuantidadeDePocoes();
                              
                        vida += pocoesDoJogador.getCura();
                        pocao--;
                              
                        pocoesDoJogador.setQuantidadeDePocoes(pocao);
                        jogador.setPontosDeVidaDoJogador(vida);
                                
                        //caso o jogador cure a mais que a vida maxima
                        if(jogador.getPontosDeVidaDoJogador() > jogador.getVidaMaximaDoJogador())
                        {
                            jogador.setPontosDeVidaDoJogador(jogador.getVidaMaximaDoJogador());
                        }
                    }
                }
                        
                escolhaDeAcaoDoAdversario = gerador.nextInt(6);
                       
                adversarioGenerico.setDefesaDoAdversario(defesaMaximaDoAdversario);
                if(escolhaDeAcaoDoAdversario == 0 || escolhaDeAcaoDoAdversario == 1 || escolhaDeAcaoDoAdversario == 2)
                {
                    System.out.println("\nAdversario: ataque");
                            
                    dano = (int) (adversarioGenerico.getDanoDoAdversario() - armadura.getValorDeArmadura());
                    if(dano <= 0)
                    {
                        dano = 1;
                    }
                    vida = jogador.getPontosDeVidaDoJogador();

                    vida -= dano;
                    jogador.setPontosDeVidaDoJogador(vida);
                    System.out.println("\nDano do adversario: " + dano);

                    if(jogador.getPontosDeVidaDoJogador() <= 0)
                    {
                        System.out.println("\nGAME OVER\n");
                        return 0;
                    }
                }
                else if(escolhaDeAcaoDoAdversario == 3 || escolhaDeAcaoDoAdversario == 4)
                {
                    System.out.println("\nAdversario: defesa");
                            
                    adversarioGenerico.setDefesaDoAdversario(2*adversarioGenerico.getDefesaDoAdversario());
                }
                else if(escolhaDeAcaoDoAdversario == 5)
                {
                    System.out.println("\nAdversario: pocao");
                            
                    if(pocoesDoAdversario.getQuantidadeDePocoes() >= 1)
                    {
                        vida = adversarioGenerico.getPontosDeVidaDoAdiversario();
                        pocao = pocoesDoAdversario.getQuantidadeDePocoes();
                              
                        vida += pocoesDoAdversario.getCura();
                        pocao--;
                              
                        pocoesDoAdversario.setQuantidadeDePocoes(pocao);
                        adversarioGenerico.setPontosDeVidaDoAdiversario(vida);
                                
                        if(adversarioGenerico.getPontosDeVidaDoAdiversario() > adversarioGenerico.getVidaMaximaDoAdversario())
                        {
                            adversarioGenerico.setPontosDeVidaDoAdiversario(adversarioGenerico.getVidaMaximaDoAdversario());
                        }
                    }
                }
            }
                    
            else if(adversarioGenerico.getAgilidadeDoAdiversario() > jogador.getAgilidadeDoJogador())
            {
                escolhaDeAcaoDoAdversario = gerador.nextInt(6);
                
                adversarioGenerico.setDefesaDoAdversario(defesaMaximaDoAdversario);
                if(escolhaDeAcaoDoAdversario == 0 || escolhaDeAcaoDoAdversario == 1 || escolhaDeAcaoDoAdversario == 2)
                {
                    System.out.println("\nAdversario: ataque");
                            
                    dano = (int) (adversarioGenerico.getDanoDoAdversario() - armadura.getValorDeArmadura());
                    if(dano <= 0)
                    {
                        dano = 1;
                    }
                    vida = jogador.getPontosDeVidaDoJogador();

                    vida -= dano;
                    jogador.setPontosDeVidaDoJogador(vida);
                    System.out.println("\nDano do adversario: " + dano);

                    if(jogador.getPontosDeVidaDoJogador() <= 0)
                    {
                        System.out.println("\nGAME OVER\n");
                        return 0;
                    }
                }
                else if(escolhaDeAcaoDoAdversario == 3 || escolhaDeAcaoDoAdversario == 4)
                {
                    System.out.println("\nAdversario: defesa");
                            
                    adversarioGenerico.setDefesaDoAdversario(2*adversarioGenerico.getDefesaDoAdversario());
                }
                else if(escolhaDeAcaoDoAdversario == 5)
                {
                    System.out.println("\nAdversario: pocao");
                            
                    if(pocoesDoAdversario.getQuantidadeDePocoes() >= 1)
                    {
                        vida = adversarioGenerico.getPontosDeVidaDoAdiversario();
                        pocao = pocoesDoAdversario.getQuantidadeDePocoes();
                              
                        vida += pocoesDoAdversario.getCura();
                        pocao--;
                              
                        pocoesDoAdversario.setQuantidadeDePocoes(pocao);
                        adversarioGenerico.setPontosDeVidaDoAdiversario(vida);
                                
                        if(adversarioGenerico.getPontosDeVidaDoAdiversario() > adversarioGenerico.getVidaMaximaDoAdversario())
                        {
                            adversarioGenerico.setPontosDeVidaDoAdiversario(adversarioGenerico.getVidaMaximaDoAdversario());
                        }
                    }
                }
                
                armadura.setValorDeArmadura(armaduraMaximaDoJogador);
                if(escolhaDeAcaoDoJogador == 1)
                {
                    if(arma.getCategoriaDaArma() == 1)
                    {
                        dano = (int) (arma.getConstanteDeDano() + gerador.nextInt(6) + 1 + gerador.nextInt(6) + 1 + gerador.nextInt(4) + 1 + jogador.getDestrezaDoJogador() - adversarioGenerico.getDefesaDoAdversario());
                    }
                    else
                    {
                        dano = (int) (arma.getConstanteDeDano() + gerador.nextInt(12) + 1 + 1.5*jogador.getForcaDoJogador() - adversarioGenerico.getDefesaDoAdversario());
                    }
                    if(dano <= 0)
                    {
                        dano = 1;
                    }
                    vida = adversarioGenerico.getPontosDeVidaDoAdiversario();
                            
                    vida -= dano;
                    adversarioGenerico.setPontosDeVidaDoAdiversario(vida);
                    System.out.println("\nDano do jogador: " + dano);
                            
                    if(adversarioGenerico.getPontosDeVidaDoAdiversario() <= 0)
                    {
                        System.out.println("\nJogador venceu\n");
                        return 1;
                    }
                }
                else if(escolhaDeAcaoDoJogador == 2)
                {
                    armadura.setValorDeArmadura(2*armadura.getValorDeArmadura());
                }
                else if(escolhaDeAcaoDoJogador == 3)
                {
                    if(pocoesDoJogador.getQuantidadeDePocoes() >= 1)
                    {
                        vida = jogador.getPontosDeVidaDoJogador();
                        pocao = pocoesDoJogador.getQuantidadeDePocoes();
                              
                        vida += pocoesDoJogador.getCura();
                        pocao--;
                              
                        pocoesDoJogador.setQuantidadeDePocoes(pocao);
                        jogador.setPontosDeVidaDoJogador(vida);
                                
                        //caso o jogador cure a mais que a vida maxima
                        if(jogador.getPontosDeVidaDoJogador() > jogador.getVidaMaximaDoJogador())
                        {
                            jogador.setPontosDeVidaDoJogador(jogador.getVidaMaximaDoJogador());
                        }
                    }
                }
                        
            } //if-else agilidade
                    
        } //while do combate#####################################################################################
        
        return 0;
    }
    
    public static void levelUp(Jogador jogador, int pontos, int vida)
    {
        Scanner input = new Scanner(System.in);
        int totalDePontos = pontos;
        int pontoDestribuidoParaUmAtributo;
        
        System.out.println("\nLevel Up!!!");
        System.out.println("\nDestribua pontos de atributo\n");
        
        while(true)
        {
            System.out.printf("Pontos Disponiveis: %d\n", totalDePontos);
            System.out.printf("Forca: ");
         
            pontoDestribuidoParaUmAtributo = input.nextInt();
            
            if(pontoDestribuidoParaUmAtributo <= totalDePontos)
            {
                jogador.setForcaDoJogador(pontoDestribuidoParaUmAtributo + jogador.getForcaDoJogador());
                break;
            }
        }

        totalDePontos -= pontoDestribuidoParaUmAtributo;  

        if(totalDePontos > 0)
        {
            while(true){
                System.out.printf("Pontos Disponiveis: %d\n", totalDePontos);
                System.out.printf("Constituicao: ");

                pontoDestribuidoParaUmAtributo = input.nextInt();
                
                if(pontoDestribuidoParaUmAtributo <= totalDePontos)
                {
                    jogador.setConstituicaoDoJogador(pontoDestribuidoParaUmAtributo + jogador.getConstituicaoDoJogador());
                    break;
                }
            }
                  
            totalDePontos -= pontoDestribuidoParaUmAtributo;
        }
        if(totalDePontos > 0)
        {
            
            while(true){
                System.out.printf("Pontos Disponiveis: %d\n", totalDePontos);
                System.out.printf("Agilidade: ");

                pontoDestribuidoParaUmAtributo = input.nextInt();
                if(pontoDestribuidoParaUmAtributo <= totalDePontos)
                {
                    jogador.setAgilidadeDoJogador(pontoDestribuidoParaUmAtributo + jogador.getAgilidadeDoJogador());
                    break;
                }
            }

            totalDePontos -= pontoDestribuidoParaUmAtributo;
        }
        if(totalDePontos > 0)
        {
            while(true){
                System.out.printf("Pontos Disponiveis: %d\n", totalDePontos);
                System.out.printf("Destreza: ");

                pontoDestribuidoParaUmAtributo = input.nextInt();
                if(pontoDestribuidoParaUmAtributo <= totalDePontos)
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
        System.out.println("Pocao: 3");
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
                System.out.println("\n" + armaGenerica2.getNomeDaArma() + " selecionada.");
                armaDoJogador.setNomeDaArma(armaGenerica2.getNomeDaArma());
                armaDoJogador.setCategoriaDaArma(armaGenerica2.getCategoriaDaArma());
                armaDoJogador.setConstanteDeDano(armaGenerica2.getConstanteDeDano());
                break;
            }
            else if(escolhaDeArma == 3)
            {
                System.out.println("\n" + armaGenerica3.getNomeDaArma() + " selecionada.");
                armaDoJogador.setNomeDaArma(armaGenerica3.getNomeDaArma());
                armaDoJogador.setCategoriaDaArma(armaGenerica3.getCategoriaDaArma());
                armaDoJogador.setConstanteDeDano(armaGenerica3.getConstanteDeDano());
                break;
            }
            else
            {
                
            }
        }
    }
    
    public static void escolhaDeArmadura(Armadura armaduraDoJogador, Armadura armaduraGenerica1, Armadura armaduraGenerica2, Armadura armaduraGenerica3)
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
                else
                {
                    System.out.println("\n" + armaduraGenerica1.getNomeDaArmadura() + " selecionada.");
                }    
                armaduraDoJogador.setConstanteDeDefesa(armaduraGenerica1.getConstanteDeDefesa());
                break;
            }
            else if(escolhaDeArmadura == 2)
            {
                System.out.println("\n" + armaduraGenerica2.getNomeDaArmadura() + " selecionada.");
                armaduraDoJogador.setNomeDaArmadura(armaduraGenerica2.getNomeDaArmadura());
                armaduraDoJogador.setConstanteDeDefesa(armaduraGenerica2.getConstanteDeDefesa());
                break;
            }
            else if(escolhaDeArmadura == 3)
            {
                System.out.println("\n" + armaduraGenerica3.getNomeDaArmadura() + " selecionada.");
                armaduraDoJogador.setNomeDaArmadura(armaduraGenerica3.getNomeDaArmadura());
                armaduraDoJogador.setConstanteDeDefesa(armaduraGenerica3.getConstanteDeDefesa());
                break;
            }
            else
            {
                
            }
        }
    }
}
