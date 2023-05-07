package inc.stoicalien.IIUnidade.atividade1.exercicio2;

/* @author rickt */
public abstract class Pessoa {
    private String nome, cpfCnpj;
    private double rendaBruta;
    
    public Pessoa(String nome, double rendaBruta, String cpfCnpj) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
        this.cpfCnpj = cpfCnpj;
    }
    
    public abstract void calcularImposto();    
    public abstract double getImpostoAPagar();

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }
        
}
