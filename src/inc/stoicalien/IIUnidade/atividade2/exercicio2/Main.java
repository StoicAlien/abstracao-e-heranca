/*
2 – Crie um algoritmo em Java com método para contar o número de ocorrências
de um determinado caractere em uma string. Usar recursividade.
 */

package inc.stoicalien.IIUnidade.atividade2.exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author rickt */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean quit = false;
        int escolha = 2;
        System.out.println("Bem-vindo ao Contador de Ocorrências de Caracteres em uma String!".toUpperCase());
        while (!quit) {
            try {
                System.out.print("Deseja inserir uma string? 1 -> sim, 2 -> não: ");
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
        System.out.print("Insira string (Ex: lYinG fRoM you): ");
        String str = scanner.nextLine().toUpperCase().trim();
        System.out.print("Deseja contar as ocorrências de qual caractere da"
                + " String '" + str + "'? ");
        char caractere = scanner.next().toUpperCase().charAt(0);
        int posicaoStr = str.length() - 1;
        int ocorrencias = contarOcorrencias(caractere, str, posicaoStr);
        System.out.println("\nString inserida= " + str.toUpperCase());
        System.out.println("Caractere verificado= " + caractere);
        System.out.println("Ocorrências de '" + caractere + "'= " + ocorrencias);
    }

    private static int contarOcorrencias(char caractere, String str, int posicaoStr) {
        if (posicaoStr < 0) {
            return 0;
        }
//        System.out.println(str.charAt(posicaoStr) +
//                " == " + caractere);
//        System.out.println(str.charAt(posicaoStr) == caractere);
        return (str.charAt(posicaoStr) == caractere ? 1 : 0) + 
                contarOcorrencias(caractere, str, posicaoStr - 1);
    }

}
