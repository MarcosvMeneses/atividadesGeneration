package atividade9;

import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os 9 elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        
        System.out.println("\n\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }
        
        int somaPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaPrincipal += matriz[i][i];
        }
        System.out.println("\n\nSoma dos Elementos da Diagonal Principal:");
        System.out.println(somaPrincipal);
        
        int somaSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaSecundaria += matriz[i][2 - i];
        }
        System.out.println("\nSoma dos Elementos da Diagonal Secundária:");
        System.out.println(somaSecundaria);
        
        scanner.close();
    }
}
	

