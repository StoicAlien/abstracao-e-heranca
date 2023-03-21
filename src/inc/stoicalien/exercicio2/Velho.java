package inc.stoicalien.exercicio2;

public class Velho extends Imovel {
    private double porcentagem;

    public Velho(String endereco, double preco, double porcentagem) {        
        super(endereco, preco);
        this.porcentagem = porcentagem;
    }

    @Override
    public double getPreco() {
        return super.getPreco() - super.getPreco() * (porcentagem / 100);
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public String toString() {
        return "Imóvel Velho{" + "preco= " + super.getPreco() + ", desconto= " + porcentagem + "% ,"
                + " endereco= " + getEndereco()
                + ", Total = " + getPreco() + "}";
    }
}
