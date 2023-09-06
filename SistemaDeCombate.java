package SistemaDeCombate;

import java.util.Scanner;

public class SistemaDeCombate {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Jogador jogador = new Jogador();
        Arma armaDoJogador = new Arma();
        int escolhaInicial;
        String nomeDoJogador;
        int totalDePontos = 15;
        int pontoDestribuidoParaUmAtributo;
        int escolhaDeArma;
        
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
                
                System.out.printf("Pontos de vida: ");
                pontoDestribuidoParaUmAtributo = input.nextInt();
                jogador.setPontosDeVidaDoJogador(pontoDestribuidoParaUmAtributo);
                totalDePontos -= pontoDestribuidoParaUmAtributo;
                
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
                
                System.out.println("\nPontos de vida: " + jogador.getPontosDeVidaDoJogador());
                System.out.println("Forca: " + jogador.getForcaDoJogador());
                System.out.println("Constituicao: " + jogador.getConstituicaoDoJogador());
                System.out.println("Agilidade: " + jogador.getAgilidadeDoJogador());
                System.out.println("Destreza: " + jogador.getDestrezaDoJogador());
                
                System.out.println("\nEscolha uma arma\n");
                System.out.println("1- Arma leve 2- Arma pesada");
                escolhaDeArma = input.nextInt();
                armaDoJogador.setCategoria(escolhaDeArma);
                if(escolhaDeArma == 1)
                {
                    System.out.println("\nArma leve selecionada\n");
                }
                else if(escolhaDeArma == 2)
                {
                    System.out.println("\nArma pesada selecionada\n");
                }
                
                break;
            }
            else if(escolhaInicial == 2)
            {
                System.out.println("\nEra uma vez...\n");
            }
            else if(escolhaInicial == 3)
            {
                System.out.println("\nSaindo...\n");
                break;
            }
        }
    } 
}