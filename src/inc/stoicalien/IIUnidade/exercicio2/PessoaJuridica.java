package inc.stoicalien.IIUnidade.exercicio2;

/* @author rickt */
public class PessoaJuridica extends Pessoa {
    private double impostoAPagar;

    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
        calcularImposto();
    }

    @Override
    public void calcularImposto() {
        impostoAPagar = getRendaBruta() * 0.1;
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
    public String toString() {
        return "Pessoa Jurídica"  + " empresa= " + getNome() + " |"
                + " rendaBruta= " + getRendaBruta()
                + " | imposto a pagar = R$"
                + impostoAPagar;
    }
    
}
