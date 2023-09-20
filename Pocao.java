package SistemaDeCombate;

import java.util.Random;

public class Pocao {
    
    Random gerador = new Random();
    
    private int quantidadeDePocoes;
    private int cura;
    
    public void setQuantidadeDePocoes(int quantidadeDePocoes)
    {
        this.quantidadeDePocoes = quantidadeDePocoes;
    }
    
    public int getQuantidadeDePocoes()
    {
        return this.quantidadeDePocoes;
    }
    
    public int getCura()
    {
        for (int i = 0; i < 3; i++)
        {
            cura += gerador.nextInt(6) + 1;
        }
        return cura;
    }
}
