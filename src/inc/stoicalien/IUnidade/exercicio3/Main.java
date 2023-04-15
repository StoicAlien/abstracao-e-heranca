package inc.stoicalien.IUnidade.exercicio3;

/*
Exercício 3: Crie uma classe abstrata chamada "Veiculo" que tenha os seguintes
atributos: modelo, ano e velocidade atual. Essa classe deve ter
um método abstrato chamado "acelerar()" que deve ser implementado
pelas classes filhas.

Em seguida, crie duas classes filhas da classe "Veiculo": "Carro" e "Moto".
Cada uma dessas classes deve ter um construtor que inicializa o modelo,
o ano e a velocidade atual do veículo (use o método construtor da classe pai).
Implemente o método "acelerar()" nas classes filhas para que elas aumentem a
velocidade atual do veículo em uma determinada quantidade (por exemplo,
10 km/h para o carro e 15 km/h para a moto).

Por fim, crie uma classe "Main" que cria um array de objetos da classe
"Veiculo" contendo um objeto de cada uma das classes filhas ("Carro" e "Moto").
Percorra o array chamando o método "acelerar()" para cada objeto,
aumentando a velocidade atual do veículo. Em seguida, mostre na tela
o modelo, o ano e a velocidade atual de cada veículo.
*/

public class Main {

    public static void main(String[] args) {
        Veiculo[] carros = new Carro[2];
        Veiculo[] motos = new Moto[2];
        
        carros[0] = new Carro("A", 2012, 60);
        carros[1] = new Carro("B", 2009, 40);
        motos[0] = new Moto("C", 2019, 75);
        motos[1] = new Moto("D", 2003, 110);
        
        // Modelo A
        carros[0].acelerar(); // velocidade atual = 65
        carros[0].acelerar(); // velocidade atual = 70
        carros[0].acelerar(); // velocidade atual = 75
        
        // Modelo B
        carros[1].acelerar(); // velocidade atual = 45
        
        // Modelo C
        motos[0].acelerar(); // velocidade atual = 84
        motos[0].acelerar(); // velocidade atual = 93
        motos[0].acelerar(); // velocidade atual = 102
        motos[0].acelerar(); // velocidade atual = 111
        
        // Modelo D
        motos[1].acelerar(); // velocidade atual = 119
        motos[1].acelerar(); // velocidade atual = 128
        
        for (Veiculo carro : carros) {
            System.out.println(carro);
        }
        
        for (Veiculo moto : motos) {
            System.out.println(moto);
        }
                
    }
    
}
