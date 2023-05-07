package inc.stoicalien.IIUnidade.exercicio3;

/* @author rickt */
public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, String cor, int comprimento, int velocidade, String caracteristicas) {
        super(nome, cor, "mar", comprimento, 0, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
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

    @Override
    public String toString() {
        return "Peixe" + super.toString() + "características= "
                + caracteristicas + "}"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
