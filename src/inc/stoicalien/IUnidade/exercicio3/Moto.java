package inc.stoicalien.IUnidade.exercicio3;

public class Moto extends Veiculo {
    private int velocidadeAtual;

    public Moto(String modelo, int ano, int velocidadeAtual) {
        super(modelo, ano, velocidadeAtual);
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 9;
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
        return "Moto{" + "modelo= " + super.getModelo()
                + ", ano= " + super.getAno()
                + ", velocidadeAtual= " + velocidadeAtual + "}";
    }
    
}
