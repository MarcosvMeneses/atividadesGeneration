package atividade9;

import java.util.Scanner;

public class atividade4 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PARTICIPANTES = 10;
        final int BIMESTRES = 4;
        double[][] notas = new double[PARTICIPANTES][BIMESTRES];
        double[] medias = new double[PARTICIPANTES];
        
        System.out.println("Digite as notas dos 10 participantes (4 bimestres cada):");
        for (int i = 0; i < PARTICIPANTES; i++) {
            for (int j = 0; j < BIMESTRES; j++) {
                notas[i][j] = scanner.nextDouble();
            }
        }
        
        for (int i = 0; i < PARTICIPANTES; i++) {
            double soma = 0;
            for (int j = 0; j < BIMESTRES; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / BIMESTRES;
        }
        
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < PARTICIPANTES; i++) {
            System.out.printf("Participante %d: %.2f\n", i+1, medias[i]);
        }
        
        scanner.close();
    }
}


