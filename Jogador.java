package SistemaDeCombate;

public class Jogador {
    
    private String nomeDoJogador;
    private int pontosDeVidaDoJogador = 0;
    private double forcaDoJogador = 0;
    private double constituicaoDoJogador = 0;
    private int agilidadeDoJogador = 0;
    private int destrezaDoJogador = 0;
    private int VidaMaximaDoJogador = 0;
    
    public void setNomeDoJogador(String nomeDoJogador)
    {
        this.nomeDoJogador = nomeDoJogador;
    }
    
    public String getNomeDoJogador()
    {
        return this.nomeDoJogador;
    }

    public void setVidaMaximaDoJogador(int VidaMaximaDoJogador)
    {
        this.VidaMaximaDoJogador = VidaMaximaDoJogador;
    }
    
    public int getVidaMaximaDoJogador()
    {
        return this.VidaMaximaDoJogador;
    }
  
    public void setPontosDeVidaDoJogador(int pontosDeVidaDoJogador)
    {
        this.pontosDeVidaDoJogador = pontosDeVidaDoJogador;
    }
    
    public int getPontosDeVidaDoJogador()
    {
        return this.pontosDeVidaDoJogador;
    }
    
    public void setForcaDoJogador(double forcaDoJogador)
    {
        this.forcaDoJogador = forcaDoJogador;
    }
    
    public double getForcaDoJogador()
    {
        return this.forcaDoJogador;
    }
    
    public void setConstituicaoDoJogador(double constituicaoDoJogador)
    {
        this.constituicaoDoJogador = constituicaoDoJogador;
    }
    
    public double getConstituicaoDoJogador()
    {
        return this.constituicaoDoJogador;
    }
    
    public void setAgilidadeDoJogador(int agilidadeDoJogador)
    {
        this.agilidadeDoJogador = agilidadeDoJogador;
    }
    
    public int getAgilidadeDoJogador()
    {
        return this.agilidadeDoJogador;
    }
    
    public void setDestrezaDoJogador(int destrezaDoJogador)
    {
        this.destrezaDoJogador = destrezaDoJogador;
    }
    
    public int getDestrezaDoJogador()
    {
        return this.destrezaDoJogador;
    }
}
