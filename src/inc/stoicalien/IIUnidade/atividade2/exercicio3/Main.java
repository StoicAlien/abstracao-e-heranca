/*
3 – Crie um algoritmo em Java com método para imprimir todos os números
inteiros de 1 a n. Usar recursividade.
 */

package inc.stoicalien.IIUnidade.atividade2.exercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author rickt */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean quit = false;
        int escolha = 2;
        System.out.println("Bem-vindo ao Contador de Números Inteiros!".toUpperCase());
        while (!quit) {
            try {
                System.out.print("Deseja inserir um número inteiro para ser contado até ele?"
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
        System.out.print("Insira um número inteiro: ");
        int n = scanner.nextInt();
        System.out.println();
        contagemProgressiva(n, 1);
    }

    private static void contagemProgressiva(int n, int posAtual) {
        if (posAtual > n) {
            System.out.println("GO!");
            return;
        }
        System.out.println(posAtual);
        contagemProgressiva(n, posAtual + 1);
    }

}
