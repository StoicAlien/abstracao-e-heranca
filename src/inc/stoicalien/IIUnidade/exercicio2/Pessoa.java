package inc.stoicalien.IIUnidade.exercicio2;

/* @author rickt */
public abstract class Pessoa {
    private String nome;
    private double rendaBruta;
    
    public Pessoa(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }
    
    public abstract void calcularImposto();    
    public abstract double getImpostoAPagar();

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }        
    
}
