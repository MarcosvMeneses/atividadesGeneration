package atividades7_2;

import java.util.Scanner;

public class atividade_3 {

	public static void main(String[] args) {
		
		int idade;
		boolean doador;
		String nome;	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador");
		nome = scanner.next();
		
		System.out.println("Digite a idade do doador");
		idade = scanner.nextInt();
		
		System.out.println("Primeira doação de sangue?\nDigite true para sim ou false para não.");
		doador = scanner.nextBoolean();
		
        	/*boolean valor;
        	
        	if (doador.equals("sim") || doador.equals("true")) {
            valor = true;
        	}
        	
        	else if (input.equals("não") || input.equals("nao")|| input.equals("false")) {
            valor = false;
          	} 
        	
        	else {
        	System.out.println("Entrada inválida! Por favor digite sim ou não.");
            valor = false;}*/
		
		if ((idade >= 18 || idade <= 69) && (idade >= 60 || idade <= 69 || doador == false)){
			
			System.out.println(nome +" está apta para doar sangue!");
			
		}
		else if ((idade >= 60 || idade <= 69 || doador == true) && idade < 18){
			
			System.out.println(nome +" não está apta para doar sangue!");
						
		}
		
		scanner.close();
	}
}
