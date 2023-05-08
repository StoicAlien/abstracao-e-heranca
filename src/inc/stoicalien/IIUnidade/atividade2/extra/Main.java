/*
EXTRA – Crie um algoritmo em Java com método para calcular potência.
Usar recursividade./
 */

package inc.stoicalien.IIUnidade.atividade2.extra;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author rickt */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean quit = false;
        int escolha = 2;
        System.out.println("Bem-vindo ao Calculador de Potência!".toUpperCase());
        while (!quit) {
            try {
                System.out.print("Deseja inserir uma base e expoente para"
                        + " calcular potência?"
                        + " 1 -> sim, 2 -> não: ");
                escolha = scanner.nextInt();         
                switch (escolha) {
                    case 1:
                        scanner.nextLine();
                        executarPrograma();
                        break;
                    case 2:
                        quit = true;
                        break;
                    default:
                        System.out.println("Entrada inválida: Deve-se entrar com 1 ou 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Deve-se entrar com um número inteiro");
                scanner.nextLine();
            } finally {
                System.out.println();
            }
        }
        scanner.close();
    }

    private static void executarPrograma() {
        System.out.print("Insira um número inteiro ou racional (base): ");        
        double base = scanner.nextDouble();
        System.out.print("Insira um número inteiro (expoente): ");
        int expoente = scanner.nextInt();
        System.out.println();
        double potencia = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " = " + potencia);
    }

    private static double calcularPotencia(double base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * calcularPotencia(base, expoente - 1);
    }

}
