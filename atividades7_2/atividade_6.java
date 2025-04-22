package atividades7_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atividade_6 {

	public static void main(String[] args) {
		
		String nome;
		int codCargo;
		float salario;
		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> cargo = new HashMap<>();
		cargo.put(1, "Gerente");
		cargo.put(2, "Vendedor");
		cargo.put(3, "Supervisor");
		cargo.put(4, "Motorista");
		cargo.put(5, "Estoquista");
		cargo.put(6, "Técnico de TI");
		
		String cargo1 = cargo.getOrDefault(1, "Desconhecido");
		String cargo2 = cargo.getOrDefault(2, "Desconhecido");
		String cargo3 = cargo.getOrDefault(3, "Desconhecido");
		String cargo4 = cargo.getOrDefault(4, "Desconhecido");
		String cargo5 = cargo.getOrDefault(5, "Desconhecido");
		String cargo6 = cargo.getOrDefault(6, "Desconhecido");
		
		System.out.println("Digite seu nome");
		nome = scanner.nextLine();
		
		System.out.println("Digite o código referente ao seu cargo");
		codCargo = scanner.nextInt();
		
		System.out.println("Digite seu salário");
		salario = scanner.nextInt();
		
		switch (codCargo) {
			case 1: {
				System.out.println("Nome do colaborador: " + nome + "\nCargo: " + cargo1 +"\nSalário: R$" + (salario*1.1));
			
				break;
			}	
			case 2: {
				System.out.println("Nome do colaborador: " + nome + "\nCargo: " + cargo2 +"\nSalário: R$" + (salario*1.07));
				
			
				break;
			}	
			case 3: {
				System.out.println("Nome do colaborador: " + nome + "\nCargo: " + cargo3 +"\nSalário: R$" + (salario*1.09));
				
			
				break;
			}	
			case 4: {
				System.out.println("Nome do colaborador: " + nome + "\nCargo: " + cargo4 +"\nSalário: R$" + (salario*1.06));
				
			break;
			}	
			case 5: {
				System.out.println("Nome do colaborador: " + nome + "\nCargo: " + cargo5 +"\nSalário: R$" + (salario*1.05));
			
			break;
			}	
			case 6: {
				System.out.println("Nome do colaborador: " + nome + "\nCargo: " + cargo6 +"\nSalário: R$" + (salario*1.08));
				
				break;
			}	
			default: {
				System.out.println("Opção invalida, por favor tente novamente.");
			
			}

		}
	
	scanner.close();
		
	}
}
