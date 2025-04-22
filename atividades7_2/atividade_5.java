package atividades7_2;

import java.util.Scanner;

import java.util.Map;
import java.util.HashMap;

public class atividade_5 {

	public static void main(String[] args) {
		
		int codigo, quantidade;
		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> produto = new HashMap<>();
		produto.put(1, "Cachorro Quente");
		produto.put(2, "X-Salada");
		produto.put(3, "X-Bacon");
		produto.put(4, "Bauru");
		produto.put(5, "Refrigerante");
		produto.put(6, "Suco de laranja");
		
		String produto1 = produto.getOrDefault(1, "Desconhecido");
		String produto2 = produto.getOrDefault(2, "Desconhecido");
		String produto3 = produto.getOrDefault(3, "Desconhecido");
		String produto4 = produto.getOrDefault(4, "Desconhecido");
		String produto5 = produto.getOrDefault(5, "Desconhecido");
		String produto6 = produto.getOrDefault(6, "Desconhecido");
		
		System.out.println("Digite o código do produto");
		codigo = scanner.nextInt();
		
		System.out.println("Digite a quantidade desejada");
		quantidade = scanner.nextInt();
		
		switch (codigo) {
			case 1: {
				System.out.println("Produto: "+ produto1 +"\nValor total: R$" + (10.00*quantidade));
				
				break;
			}	
			case 2: {
				System.out.println("Produto: "+ produto2 +"\nValor total: R$" + (15.00*quantidade));
				
				break;
			}	
			case 3: {
				System.out.println("Produto: "+ produto3 +"\nValor total: R$" + (18.00*quantidade));
				
				break;
			}	
			case 4: {
				System.out.println("Produto: "+ produto4 +"\nValor total: R$" + (12.00*quantidade));
				
				break;
			}	
			case 5: {
				System.out.println("Produto: "+ produto5 +"\nValor total: R$" + (8.00*quantidade));
				
				break;
			}	
			case 6: {
				System.out.println("Produto: "+ produto6 +"\nValor total: R$" + (13.00*quantidade));
				
				break;
			}	
			default: {
				System.out.println("Opção invalida, por favor tente novamente.");
				
			}

			}
		
		scanner.close();
	}
}
