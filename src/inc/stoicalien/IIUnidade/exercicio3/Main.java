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
    
    private static List jardimZoologico = new LinkedList();
    public static void main(String[] args) {
        Animal animal1 = new Mamifero("camelo", "marrom", 255, 10);
        Animal animal2 = new Mamifero("urso do canadá", "preto", 240, 40);
        Animal animal3 = new Mamifero("gato", "malhado", 35, 48);
        Animal animal4 = new Mamifero("morcego", "preto", 10, 80);
        
        Animal animal5 = new Peixe("tubarão", "azul", 400, 70);
        Animal animal6 = new Peixe("salmão", "prata", 70, 6);
        Animal animal7 = new Peixe("peixe-palhaço", "laranja", 10, 4);
        Animal animal8 = new Peixe("pirarucu", "marrom esverdeado", 300, 40);
        
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
        for (Object animal : jardimZoologico) {
            System.out.println(animal);
        }
    }
    
}
