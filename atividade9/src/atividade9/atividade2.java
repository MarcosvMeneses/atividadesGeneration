package atividade9;

import java.util.Scanner;

public class atividade2 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("\nElementos nos índices ímpares:");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println("\n\nElementos pares:");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        System.out.println("\n\nSoma: " + soma);
        
        double media = (double) soma / vetor.length;
        System.out.printf("\nMédia: %.2f", media);
        
        scanner.close();
    }
}


