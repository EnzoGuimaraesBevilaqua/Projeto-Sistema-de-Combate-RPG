package SistemaDeCombate;

public class Arma {
    
    private String nomeDaArma;
    private int categoriaDaArma;
    private int constanteDeDano;
    
    public void setNomeDaArma(String nomeDaArma)
    {
        this.nomeDaArma = nomeDaArma;
    }
    
    public String getNomeDaArma()
    {
        return this.nomeDaArma;
    }
    
    public void setCategoriaDaArma(int categoriaDaArma)
    {
        this.categoriaDaArma = categoriaDaArma;
    }
    
    public int getCategoriaDaArma()
    {
        return this.categoriaDaArma;
    }
    
    public void setConstanteDeDano(int constanteDeDano)
    {
        this.constanteDeDano = constanteDeDano;
    }
    
    public int getConstanteDeDano()
    {
        return this.constanteDeDano;
    }
}
