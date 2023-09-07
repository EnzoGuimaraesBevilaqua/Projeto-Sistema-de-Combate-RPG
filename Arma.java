package SistemaDeCombate;

public class Arma {
    
    String categoriaDaArma;
    int constanteDeDano = 10;
    
    public void setCategoriaDaArma(int categoriaDaArma)
    {
        if(categoriaDaArma == 1)
        {
            this.categoriaDaArma = "Leve";
        }
        else if(categoriaDaArma == 2)
        {
            this.categoriaDaArma = "Leve";
        }
        else if(categoriaDaArma == 3)
        {
            this.categoriaDaArma = "Pesada";
        }
    }
    
    public String getCategoriaDaArma()
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
