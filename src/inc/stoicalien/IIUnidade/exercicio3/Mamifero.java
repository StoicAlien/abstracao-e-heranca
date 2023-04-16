package inc.stoicalien.IIUnidade.exercicio3;

/* @author rickt */
public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, String cor, int comprimento, int velocidade, String alimento) {
        super(nome, cor, "terra", comprimento, 4, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    @Override
    public String toString() {
        return "Mamífero" + super.toString() +
                "alimento= " + alimento + "}"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVelocidade() {
        return super.getVelocidade(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPatas() {
        return super.getPatas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getComprimento() {
        return super.getComprimento(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAmbiente() {
        return super.getAmbiente(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCor() {
        return super.getCor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
