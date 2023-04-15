package inc.stoicalien.IIUnidade.exercicio2;

import java.util.LinkedList;
import java.util.List;

/* @author rickt */

/*
Exercício 02 – Imposto de Renda

A Receita Federal possui um cadastro dos contribuintes. Cada contribuinte
possui nome.
Escreva um programa para calcular o imposto a ser pago para 6 contribuintes.

Os contribuintes podem ser:

                 Pessoa Jurídica:
O imposto corresponde a 10% da renda bruta da empresa.

                 Pessoa Física:
Renda Bruta      Alíquota       Parcela a deduzir
0 a 1400         0%             R$ 0
1400,01 a 2100   10%            RS 100
2100,01 a 2800   15%            RS 270
2800,01 a 3600   25%            RS 500
3600,01 ou mais  30%            RS 700

Escreva um programa para calcular e imprimir na tela o imposto a ser pago de 6
contribuintes, sendo 3 PJ e 3 PF.
*/

public class Main {
    
    private static List contribuintes = new LinkedList();
    public static void main(String[] args) {
        Pessoa pf1 = new PessoaFisica("Shepard", 1500);
        Pessoa pf2 = new PessoaFisica("Garrus", 2450);
        Pessoa pf3 = new PessoaFisica("Tali", 3462);
        Pessoa pf4 = new PessoaFisica("Joker", 1346.66);
        Pessoa pj1 = new PessoaJuridica("Cerberus", 367438.5);
        Pessoa pj2 = new PessoaJuridica("Eclipse", 75630);
        Pessoa pj3 = new PessoaJuridica("Spectre", 38210);
        Pessoa pj4 = new PessoaJuridica("Blue Suns", 64783.1);        
        
        contribuintes.add(pf1);
        contribuintes.add(pf2);
        contribuintes.add(pf3);
        contribuintes.add(pf4);
        contribuintes.add(pj1);
        contribuintes.add(pj2);
        contribuintes.add(pj3);
        contribuintes.add(pj4);
        
        imprimirContribuintes();
    }

    private static void imprimirContribuintes() {
        for (Object contribuinte : contribuintes) {
            System.out.println(contribuinte);
        }
    }
    
}
