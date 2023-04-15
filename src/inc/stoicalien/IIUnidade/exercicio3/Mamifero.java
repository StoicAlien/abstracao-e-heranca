package inc.stoicalien.IIUnidade.exercicio3;

/* @author rickt */
public class Mamifero extends Animal {

    public Mamifero(String nome, String cor, int comprimento, int velocidade) {
        super(nome, cor, "terra", comprimento, 4, velocidade);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
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
