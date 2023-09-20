package SistemaDeCombate;

public class Adversario {
    
    private String nomeDoAdversario;
    private int pontosDeVidaDoAdversario = 0;
    private int VidaMaximaDoAdversario;
    private int danoDoAdversario = 0;
    private int defesaDoAdversario = 0;
    private double agilidadeDoAdversario = 0;
    
    
    public void setNomeDoAdiversario(String nomeDoAdiversario)
    {
        this.nomeDoAdversario = nomeDoAdiversario;
    }
    
    public String getNomeDoAdiversario()
    {
        return this.nomeDoAdversario;
    }
    
    public void setPontosDeVidaDoAdiversario(int pontosDeVidaDoAdiversario)
    {
        this.pontosDeVidaDoAdversario = pontosDeVidaDoAdiversario;
    }
    
    public int getPontosDeVidaDoAdiversario()
    {
        return this.pontosDeVidaDoAdversario;
    }
    
    public void setVidaMaximaDoAdversario(int VidaMaximaDoAdversario)
    {
        this.VidaMaximaDoAdversario = VidaMaximaDoAdversario;
    }
    
    public int getVidaMaximaDoAdversario()
    {
        return VidaMaximaDoAdversario;
    }
    
    public void setDanoDoAdversario(int danoDoAdversario)
    {
        this.danoDoAdversario = danoDoAdversario;
    }
    
    public int getDanoDoAdversario()
    {
        return this.danoDoAdversario;
    }
    
    public void setDefesaDoAdversario(int constituicaoDoAdiversario)
    {
        this.defesaDoAdversario = constituicaoDoAdiversario;
    }
    
    public int getDefesaDoAdversario()
    {
        return this.defesaDoAdversario;
    }
    
    public void setAgilidadeDoAdiversario(double agilidadeDoAdiversario)
    {
        this.agilidadeDoAdversario = agilidadeDoAdiversario;
    }
    
    public double getAgilidadeDoAdiversario()
    {
        return this.agilidadeDoAdversario;
    }
}
