package SistemaDeCombate;

public class Jogador {
    
    private String nomeDoJogador;
    private int pontosDeVidaDoJogador = 0;
    private int forcaDoJogador = 0;
    private int constituicaoDoJogador = 0;
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
    
    public void setForcaDoJogador(int forcaDoJogador)
    {
        this.forcaDoJogador = forcaDoJogador;
    }
    
    public int getForcaDoJogador()
    {
        return this.forcaDoJogador;
    }
    
    public void setConstituicaoDoJogador(int constituicaoDoJogador)
    {
        this.constituicaoDoJogador = constituicaoDoJogador;
    }
    
    public int getConstituicaoDoJogador()
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
