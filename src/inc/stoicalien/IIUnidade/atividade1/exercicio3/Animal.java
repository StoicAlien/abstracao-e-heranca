package inc.stoicalien.IIUnidade.exercicio3;

/* @author rickt */
public abstract class Animal {
    private String nome, cor, ambiente;
    private int comprimento, patas, velocidade;

    public Animal(String nome, String cor, String ambiente, int comprimento, int patas, int velocidade) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.patas = patas;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "{" + "nome= " + nome + ", cor= " + cor + ", "
                + "ambiente= " + ambiente + ", comprimento= " + comprimento + 
                "cm , patas= " + patas + ", velocidade= " + velocidade + " km/h,\n";
    }
    
    
}
