package atividades8_2;

import java.util.Scanner;

public class atividade_1 {

	public static void main(String[] args) {
		
		int n1, n2, contador;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero do intervalo");
		n1 = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero do intervalo");
		n2 = scanner.nextInt();
		
			
			if(n2 <= n1) {
				System.out.println("O intervalo � inv�lido, o primeiro n�mero deve ser menor que o segundo.");
				scanner.close();
				return;
			}

			for(contador = n1; contador <= n2 ; contador ++) {
			
			
			if(contador % 3 == 0 && contador % 5 == 0) {
				System.out.println(contador + " � m�ltiplo de 3 e 5");
						
			}
		}
		
		scanner.close();	
	
	}
}
