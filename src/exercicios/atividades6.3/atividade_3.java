package exercicios;

import java.util.Scanner;

public class atividade_3 {

		public static void main(String[] args) {
			
			float salarioBruto, adNoturno, horasExtras, descontos, salarioLiquido;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite seu salário");
			salarioBruto = scanner.nextFloat();
			
			System.out.println("Digite seu adicional noturno");
			adNoturno = scanner.nextFloat();
			
			System.out.println("Digite suas horas extras");
			horasExtras = scanner.nextFloat();
			
			System.out.println("Digite seus descontos");
			descontos = scanner.nextFloat();
			
			
			//salario bruto=2000, adnoturno= 500, hrextra= 100 e descontos = 500
			salarioLiquido = salarioBruto + adNoturno + (horasExtras * 5) - descontos;
			
			System.out.println("Seu salário líquido é: " + salarioLiquido );
			
			scanner.close();
		}
}
