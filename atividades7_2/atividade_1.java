package atividades7_2;

import java.util.Scanner;

public class atividade_1 {
	
	public static void main(String[] args) {
	
	int a, b, c;
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Digite o valor de A");
	a = scanner.nextInt();
	
	System.out.println("Digite o valor de B");
	b = scanner.nextInt();
	
	System.out.println("Digite o valor de C");
	c = scanner.nextInt();
	
		if(a+b > c) {
			System.out.println("A Soma de A + B � Maior do que C");
	
		}
		if(a+b < c) {
			System.out.println("A Soma de A + B � Menor do que C");
			
		}
		if(a+b == c) {
			System.out.println("A Soma de A + B � Igual do que C");
			
		}
	scanner.close();
	}
}