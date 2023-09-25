package SistemaDeCombate;

import java.util.Random;

public class Pocao {
    
    Random gerador = new Random();
    
    private int quantidadeDePocoes;
    private int valorDeCura;
    private int rolagemDevalorDeCura;
    
    public void setQuantidadeDePocoes(int quantidadeDePocoes)
    {
        this.quantidadeDePocoes = quantidadeDePocoes;
    }
    
    public int getQuantidadeDePocoes()
    {
        return this.quantidadeDePocoes;
    }
    
    public int getValorDeCura()
    {
        valorDeCura = 0;
        for (int i = 0; i < 3; i++)
        {
            rolagemDevalorDeCura = gerador.nextInt(6) + 1;
            valorDeCura += rolagemDevalorDeCura;
        }
        return valorDeCura;
    }
}
