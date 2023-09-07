package SistemaDeCombate;

import java.util.Scanner;
import java.util.Random;

public class SistemaDeCombate {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        
        Jogador jogador = new Jogador();
        Adversario adversario1 = new Adversario();
        Arma armaDoJogador = new Arma();
        Armadura armaduraDoJogador = new Armadura();
        
        Pocao pocoesDoJogador = new Pocao();
        Pocao pocoesDoAdversario = new Pocao();

        int VidaMaximaDoJogador; 
        int escolhaInicial;
        String nomeDoJogador;
        int totalDePontos = 15;
        int pontoDestribuidoParaUmAtributo;
        int escolhaDeArma;
        int escolhaDeArmadura;
        int escolhaDeAcao;
        int escolhaDeAcaoDoAdversario;
        int dano;
        int vida;
        int pocao;
        
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
                jogador.setNomeDoJogador(nomeDoJogador);
                System.out.println("Bem vindo, " + jogador.getNomeDoJogador());
                
                System.out.println("\nDestribua 15 pontos de atributo\n");
                
                /*System.out.printf("Pontos de vida: ");
                pontoDestribuidoParaUmAtributo = input.nextInt();
                jogador.setPontosDeVidaDoJogador(pontoDestribuidoParaUmAtributo);
                totalDePontos -= pontoDestribuidoParaUmAtributo;*/
                         
                System.out.printf("Forca: ");
                pontoDestribuidoParaUmAtributo = input.nextInt();
                jogador.setForcaDoJogador(pontoDestribuidoParaUmAtributo);
                totalDePontos -= pontoDestribuidoParaUmAtributo;
                
                System.out.printf("Constituicao: ");
                pontoDestribuidoParaUmAtributo = input.nextInt();
                jogador.setConstituicaoDoJogador(pontoDestribuidoParaUmAtributo);
                totalDePontos -= pontoDestribuidoParaUmAtributo;
                
                System.out.printf("Agilidade: ");
                pontoDestribuidoParaUmAtributo = input.nextInt();
                jogador.setAgilidadeDoJogador(pontoDestribuidoParaUmAtributo);
                totalDePontos -= pontoDestribuidoParaUmAtributo;
                
                System.out.printf("Destreza: ");
                pontoDestribuidoParaUmAtributo = input.nextInt();
                jogador.setDestrezaDoJogador(pontoDestribuidoParaUmAtributo);
                totalDePontos -= pontoDestribuidoParaUmAtributo;

              //Calculo da Vida maxima do Jogador
                for (int i = 0; i < 3; i++) 
                {
                    VidaMaximaDoJogador += gerador.nextInt(6) + 1;
                }
                jogador.setVidaMaximaDoJogador(VidaMaximaDoJogador);

              
                
                System.out.println("\nPontos de vida: " + jogador.getVidaMaximaDoJogador());
                System.out.println("Forca: " + jogador.getForcaDoJogador());
                System.out.println("Constituicao: " + jogador.getConstituicaoDoJogador());
                System.out.println("Agilidade: " + jogador.getAgilidadeDoJogador());
                System.out.println("Destreza: " + jogador.getDestrezaDoJogador());
                
                System.out.println("\nEscolha uma arma\n");
                System.out.println("1- Adaga (leve) 2- Machadinha (leve) 3- Espada longa (pesada)");
                escolhaDeArma = input.nextInt();
                armaDoJogador.setCategoriaDaArma(escolhaDeArma);
                if(escolhaDeArma == 1)
                {
                    System.out.println("\nAdaga selecionada\n");
                }
                else if(escolhaDeArma == 2)
                {
                    System.out.println("\nMachadinha selecionada\n");
                }
                else if(escolhaDeArma == 3)
                {
                    System.out.println("\nEspada longa selecionada\n");
                }
                
                System.out.println("Escolha uma armadura\n");
                System.out.println("1- Armadura de couro (leve) 2- Armadura acolchoada (leve) 3- Armadura de malha (pesada)");
                escolhaDeArmadura = input.nextInt();
                if(escolhaDeArmadura == 1)
                {
                    System.out.println("\nArmadura de couro selecionada");
                }
                else if(escolhaDeArmadura == 2)
                {
                    System.out.println("\nArmadura acolchoada selecionada");
                }
                else if(escolhaDeArmadura == 3)
                {
                    System.out.println("\nArmadura de malha selecionada");
                }

                armaduraDoJogador.setDefesa(5);
              
                adversario1.setNomeDoAdiversario("Golem");
                adversario1.setPontosDeVidaDoAdiversario(20);
                adversario1.setDanoDoAdversario(8);
                adversario1.setDefesaDoAdversario(12);
                adversario1.setAgilidadeDoAdiversario(5);
                
                while(true) //while do combate --------------------------------
                {
                    System.out.println("\n&      G");
                    System.out.printf("%d      %d\n", jogador.getPontosDeVidaDoJogador(), 
adversario1.getPontosDeVidaDoAdiversario());
                    System.out.println("1- Atacar  2- Defender  3- Usar pocao");
                    escolhaDeAcao = input.nextInt();
                    
                    if(jogador.getAgilidadeDoJogador() > adversario1.getAgilidadeDoAdiversario()) //teste
                    {
                        if(escolhaDeAcao == 1)
                        {
                            dano = armaDoJogador.getConstanteDeDano();
                            vida = adversario1.getPontosDeVidaDoAdiversario();
                            
                            vida -= dano;
                            adversario1.setPontosDeVidaDoAdiversario(vida);
                            
                            if(adversario1.getPontosDeVidaDoAdiversario() <= 0)
                            {
                                System.out.println("\nJogador venceu");
                                break;
                            }
                        }
                        else if(escolhaDeAcao == 2)
                        {
                            
                        }
                        else if(escolhaDeAcao == 3)
                        {
                            
                        }
                        else if(escolhaDeAcao == 4)
                        {
                            break;
                        }
                    }
                    else
                    {
                        if(escolhaDeAcao == 1)
                        {
                            
                        }
                        else if(escolhaDeAcao == 2)
                        {
                            
                        }
                        else if(escolhaDeAcao == 3)
                        {
                            
                        }
                        else if(escolhaDeAcao == 4)
                        {
                            break;
                        }
                        
                    } //if-else agilidade
                    
                } //while do combate ------------------------------------------
                
                break;
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

  public static void combate(){
       pocoesDoJogador.setQuantidadeDePocoes(3);
       pocoesDoAdversario.setQuantidadeDePocoes(3);
       jogador.setPontosdeVidaDoJogador(jogador.getVidaMaximaDoJogador());
       while(true) //while do combate --------------------------------
                {
                    System.out.println("\n&      G");
                    System.out.printf("%d      %d\n", jogador.getPontosDeVidaDoJogador(),                 
                    adversario1.getPontosDeVidaDoAdiversario());
                    
                    System.out.println("1- Atacar  2- Defender  3- Usar pocao");
                    escolhaDeAcao = input.nextInt();
                    
                    if(jogador.getAgilidadeDoJogador() > adversario1.getAgilidadeDoAdiversario()) //teste
                    {
                        if(escolhaDeAcao == 1)
                        {
                            dano = armaDoJogador.getConstanteDeDano();
                            vida = adversario1.getPontosDeVidaDoAdiversario();
                            
                            vida -= dano;
                            adversario1.setPontosDeVidaDoAdiversario(vida);
                            
                            if(adversario1.getPontosDeVidaDoAdiversario() <= 0)
                            {
                                System.out.println("\nJogador venceu");
                                break;
                            }
                        }
                        else if(escolhaDeAcao == 2)
                        {
                            armaduraDoJogador.setDefesa(2*armaduraDoJogador.getDefesa());
                        }
                        else if(escolhaDeAcao == 3)
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
                                if(jogador.getPontosDeVidaDoJogador() > jogador.getVidaMaximaDoJogador()){
                                  jogador.setPontosDeVidaDoJogador(jogador.getVidaMaximaDoJogador());
                                }else{}
                              
                            }
                            else
                            {
                              
                            }
                        }
                        else if(escolhaDeAcao == 4)
                        {
                            break;
                        }
                    }
                    else
                    {
                        escolhaDeAcaoDoAdversario = gerador.nextInt(2);
                        if(escolhaDeAcaoDoAdversario == 0)
                        {
                            dano = adversario1.getDanoDoAdversario();
                            vida = jogador.getPontosDeVidaDoJogador();

                            vida -= dano;
                            jogador.setPontosDeVidaDoJogador(vida);

                            if(jogador.getPontosDeVidaDoJogador <= 0)
                            {
                                System.out.println("\nGAME OVER\n");
                                break;
                            }
                        }
                        else if(escolhaDeAcaoDoAdversario == 1)
                        {
                          
                        }
                        else if(escolhaDeAcaoDoAdversario == 2)
                        {
                            if(pocoesDoAdversario.getQuantidadeDePocoes() >= 1)
                            {
                                vida = adversario1.getPontosDeVidaDoAdversario();
                                pocao = pocoesDoAdversario.getQuantidadeDePocoes();
                              
                                vida += pocoesDoAdversario.getCura();
                                pocao--;
                              
                                pocoesDoAdversario.setQuantidadeDePocoes(pocao);
                                adversario1.setPontosDeVidaDoAdversario(vida);
                            }
                            else
                            {
                              
                            }
                        }
                        
                        if(escolhaDeAcao == 1)
                        {
                            
                        }
                        else if(escolhaDeAcao == 2)
                        {
                            
                        }
                        else if(escolhaDeAcao == 3)
                        {
                            
                        }
                        else if(escolhaDeAcao == 4)
                        {
                            break;
                        }
                        
                    } //if-else agilidade
                    
                } //while do combate ------------------------------------------
    
  }
}
