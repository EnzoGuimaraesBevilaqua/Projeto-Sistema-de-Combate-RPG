package SistemaDeCombate;

public class Adversario {
    
    private String nomeDoAdversario;
    private int pontosDeVidaDoAdversario = 0;
    private int VidaMaximaDoAdversario;
    private int danoDoAdversario = 0;
    private int defesaDoAdversario = 0;
    private double agilidadeDoAdversario = 0;
    
    public void setNomeDoAdversario(String nomeDoAdversario)
    {
        this.nomeDoAdversario = nomeDoAdversario;
    }
    
    public String getNomeDoAdversario()
    {
        return this.nomeDoAdversario;
    }
    
    public void setPontosDeVidaDoAdversario(int pontosDeVidaDoAdversario)
    {
        this.pontosDeVidaDoAdversario = pontosDeVidaDoAdversario;
    }
    
    public int getPontosDeVidaDoAdversario()
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
    
    public void setDefesaDoAdversario(int constituicaoDoAdversario)
    {
        this.defesaDoAdversario = constituicaoDoAdversario;
    }
    
    public int getDefesaDoAdversario()
    {
        return this.defesaDoAdversario;
    }
    
    public void setAgilidadeDoAdversario(double agilidadeDoAdversario)
    {
        this.agilidadeDoAdversario = agilidadeDoAdversario;
    }
    
    public double getAgilidadeDoAdversario()
    {
        return this.agilidadeDoAdversario;
    }
}
