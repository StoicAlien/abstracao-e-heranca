package inc.stoicalien.IUnidade.exercicio2;

public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }        

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }
    
}
