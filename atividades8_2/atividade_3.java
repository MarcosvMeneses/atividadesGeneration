package atividades8_2;

import java.util.Scanner;

public class atividade_3 {
	
	public static void main(String[] args) {
		
		int idade = 0, menor21 = 0 , maior50 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(idade >= 0) {
			
			System.out.println("Digite uma idade");
			idade = scanner.nextInt();
			
			if(idade > 0 && idade < 21) menor21++;
			else if(idade > 50) maior50++;
						
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor21 + "\nTotal de pessoas maiores de 50 anos: " + maior50);
		
		scanner.close();
	}

}
