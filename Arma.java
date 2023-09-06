package SistemaDeCombate;

public class Arma {
    
    String categoria;
    int constanteDeDano;
    
    public void setCategoria(int categoria)
    {
        if(categoria == 1)
        {
            this.categoria = "Arma leve";
        }
        else if(categoria == 2)
        {
            this.categoria = "Arma pesada";
        }
    }
    
    public String getCategoria()
    {
        return this.categoria;
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