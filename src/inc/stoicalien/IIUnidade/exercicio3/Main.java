package inc.stoicalien.IIUnidade.exercicio3;

import java.util.LinkedList;
import java.util.List;

/* @author rickt */

/*
Exercício 03 – Animais

Um animal contém nome,comprimento,número de patas (padrão é 4),cor,
ambiente e velocidade (emm/s).

Um peixe é um animal,tem 0 patas, seu ambiente é o mar (padrão), cor cinzenta
(padrão). Além disso tem como características barbatanas e cauda.

Um mamífero é um animal e seu ambiente padrão é terra.
Um urso é um mamífero, cor castanho e seu alimento preferido é o mel.

Crie as classes Animal, Peixe e Mamífero.
Para a classe Animal, coloque os atributos:
Nome, comprimento, patas, cor, ambiente, velocidade

Para a classe Peixe, codifique o atributo características.

Para a classe Mamifero, coloque o atributo alimento.

Por último, crie uma classe teste de forma a ter um jardim zoológico com os
seguintes animais: camelo, tubarão, urso`do`canadá.
*/

public class Main {
    
    private static List<Animal> jardimZoologico = new LinkedList<>();
    public static void main(String[] args) {
        Animal animal1 = new Mamifero("camelo".toUpperCase(), "marrom", 255, 10,
                "cactos, espinhos e arbustos");
        Animal animal2 = new Mamifero("urso do canadá".toUpperCase(), "preto", 240, 40,
                "bagas, nozes, raízes, insetos, peixes e pequenos mamíferos");
        Animal animal3 = new Mamifero("gato".toUpperCase(), "malhado", 35, 48,
                "ração, pássaros, roedores e insetos");
        Animal animal4 = new Mamifero("morcego".toUpperCase(), "preto", 10, 80,
                "frutas, néctar, insetos, aranhas e outros animais pequenos");
        
        Animal animal5 = new Peixe("tubarão".toUpperCase(), "cinza", 400, 70,
                "corpo hidrodinâmico em forma de torpedo, uma pele áspera e"
                        + " escamosa, nadadeiras pontiagudas e dentes afiados");
        Animal animal6 = new Peixe("salmão".toUpperCase(), "prata", 70, 6, 
                "corpo alongado e escamoso, com uma cabeça pequena e uma boca larga");
        Animal animal7 = new Peixe("peixe-palhaço".toUpperCase(), "laranja", 10, 4,
                "pele lisa e brilhante e três faixas brancas distintas em seu"
                        + " corpo alaranjado, nadadeiras pontiagudas e em tons"
                        + " de laranja ou amarelo");
        Animal animal8 = new Peixe("pirarucu".toUpperCase(), "marrom esverdeado", 300, 40, 
                "corpo alongado e escamoso e uma cabeça grande e arredondada");
        
        jardimZoologico.add(animal1);
        jardimZoologico.add(animal2);
        jardimZoologico.add(animal3);
        jardimZoologico.add(animal4);
        jardimZoologico.add(animal5);
        jardimZoologico.add(animal6);
        jardimZoologico.add(animal7);
        jardimZoologico.add(animal8);
        
        imprimirJardimZoologico();
    }

    private static void imprimirJardimZoologico() {
        for (Animal animal : jardimZoologico) {
            System.out.println(animal + "\n");
        }
    }
    
}
