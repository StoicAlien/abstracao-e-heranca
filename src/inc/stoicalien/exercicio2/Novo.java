package inc.stoicalien.exercicio2;

public class Novo extends Imovel {
    private double preco, porcentagem;
    private String endereco;

    public Novo(String endereco, double preco, double porcentagem) {        
        super(endereco, preco);
        this.porcentagem = porcentagem;
    }

    @Override
    public double getPreco() {
        return super.getPreco() * (porcentagem / 100) + super.getPreco();
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public String toString() {
        return "Imóvel Novo{" + "preco= " + super.getPreco() + ", acréscimo= " + porcentagem + "% ,"
                + " endereco= " + getEndereco()
                + ", Total = " + getPreco() + "}";
    }
    
}
