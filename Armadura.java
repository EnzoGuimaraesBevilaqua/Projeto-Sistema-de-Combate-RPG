package SistemaDeCombate;

public class Armadura {
    
    private String nomeDaArmadura;
    private double valorDeArmadura;
    private double constanteDeDefesa;
    
    public void setNomeDaArmadura(String nomeDaArmadura)
    {
        this.nomeDaArmadura = nomeDaArmadura;
    }
    
    public String getNomeDaArmadura()
    {
        return this.nomeDaArmadura;
    }
    
    public void setConstanteDeDefesa(double constanteDeDefesa)
    {
        this.constanteDeDefesa = constanteDeDefesa;
    }
    
    public double getConstanteDeDefesa()
    {
        return this.constanteDeDefesa;
    }
    
    public void setValorDeArmadura(double valorDeArmadura)
    {
        this.valorDeArmadura = valorDeArmadura;
    }
    
    public double getValorDeArmadura()
    {
        return this.valorDeArmadura;
    }
}
