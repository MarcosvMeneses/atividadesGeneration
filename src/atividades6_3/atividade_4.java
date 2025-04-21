package atividades6_3;

import java.util.Scanner;

public class atividade_4 {
	
	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		n1 = scanner.nextFloat();
		
		System.out.println("Digite o segundo número");
		n2 = scanner.nextFloat();
		
		System.out.println("Digite o terceiro número");
		n3 = scanner.nextFloat();
		
		System.out.println("Digite o quarto número");
		n4 = scanner.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença é: " + diferenca);
		
		scanner.close();
	}
}
