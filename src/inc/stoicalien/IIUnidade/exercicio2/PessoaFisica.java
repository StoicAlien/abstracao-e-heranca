package inc.stoicalien.IIUnidade.exercicio2;

/* @author rickt */
public class PessoaFisica extends Pessoa {
    private double impostoAPagar;

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
        calcularImposto();
    }
    
    @Override
    public double getImpostoAPagar() {
        return impostoAPagar;
    }

    @Override
    public double getRendaBruta() {
        return super.getRendaBruta(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularImposto() {
        if (getRendaBruta() <= 1400) {
            impostoAPagar = getRendaBruta() * 0 - 0;
        } else if (getRendaBruta() <= 2100) {
            impostoAPagar = getRendaBruta() * 0.1 - 100;
        } else if (getRendaBruta() <= 2800) {
            impostoAPagar = getRendaBruta() * 0.15 - 270;
        } else if (getRendaBruta() <= 3600) {
            impostoAPagar = getRendaBruta() * 0.25 - 500;
        } else {
            impostoAPagar = getRendaBruta() * 0.3 - 700;
        }
    }        
    
    @Override
    public String toString() {
        return "Pessoa Física:" + " nome= " + getNome() + " |"
                + " rendaBruta= " + getRendaBruta()
                + " | imposto a pagar = R$"
                + impostoAPagar;
    }

}
