/*
1 – Crie um algoritmo em Java com método para inverter uma string usando
recursão.
 */

package inc.stoicalien.IIUnidade.atividade2.exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author rickt */
public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean quit = false;
        int escolha = 2;
        System.out.println("Bem-vindo ao invertedor de Strings!".toUpperCase());
        while (!quit) {
            try {
                System.out.print("Deseja inserir uma string para inverter? 1 -> sim, 2 -> não: ");
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
        System.out.print("Insira string que deseja inverter (Ex: jAvA meLHoR LinGUAgem): ");
        String str = scanner.nextLine().toUpperCase().trim();
        int posicaoStr = str.length() - 1;
        String strInvertida = inverterString(str, "", posicaoStr);
        System.out.println("\nString inserida= " + str.toUpperCase());
        System.out.println("String invertida= " + strInvertida);
    }

    private static String inverterString(String velhaStr, String novaStr, int posicaoStr) {
        if (posicaoStr < 0) {
            return "";
        }
        return novaStr + velhaStr.charAt(posicaoStr) +
                inverterString(velhaStr, novaStr, posicaoStr - 1);
    }

}
