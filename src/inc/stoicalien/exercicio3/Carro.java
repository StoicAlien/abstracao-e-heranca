package inc.stoicalien.exercicio3;

public class Carro extends Veiculo {
    private int velocidadeAtual;

    public Carro(String modelo, int ano, int velocidadeAtual) {
        super(modelo, ano, velocidadeAtual);
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 5;
    }

    @Override
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    @Override
    public int getAno() {
        return super.getAno(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getModelo() {
        return super.getModelo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo= " + super.getModelo()
                + ", ano= " + super.getAno()
                + ", velocidadeAtual= " + velocidadeAtual + "}";
    }
    
}
