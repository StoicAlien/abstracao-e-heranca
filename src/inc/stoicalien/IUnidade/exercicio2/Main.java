package inc.stoicalien.IUnidade.exercicio2;

/*
Exercício 2: Crie a classe Imovel, que possui um endereço e um preço.

a. crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie
métodos de acesso e impressão deste valor adicional.

b. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie
métodos de acesso e impressão para este desconto.
*/

public class Main {

    public static void main(String[] args) {
        Imovel imovel1 = new Velho("A", 10, 2);
        Imovel imovel2 = new Novo("B", 45, 8);
        Imovel imovel3 = new Velho("C", 21, 2);
        Imovel imovel4 = new Velho("D", 100, 3);
        Imovel imovel5 = new Velho("E", 23, 6);
        Imovel imovel6 = new Novo("F", 92, 15);
        Imovel imovel7 = new Novo("G", 76, 6);
        
        System.out.println(imovel1);
        System.out.println(imovel2);
        System.out.println(imovel3);
        System.out.println(imovel4);
        System.out.println(imovel5);
        System.out.println(imovel6);
        System.out.println(imovel7);
    }
    
}
