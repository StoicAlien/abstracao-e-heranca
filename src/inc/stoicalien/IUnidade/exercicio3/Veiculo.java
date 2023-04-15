package inc.stoicalien.IUnidade.exercicio3;

public abstract class Veiculo {
    private String modelo;
    private int ano, velocidadeAtual;

    public Veiculo(String modelo, int ano, int velocidadeAtual) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public abstract void acelerar();

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    
}
