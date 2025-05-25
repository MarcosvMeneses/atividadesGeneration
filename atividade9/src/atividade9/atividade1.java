package atividade9;
import java.util.Scanner;


public class atividade1 {
	
	 public static void main(String[] args) {
	        // Vetor com os valores fornecidos
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite um número para buscar (ou 'sair' para terminar): ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            
            try {
                int numero = Integer.parseInt(entrada);
                int posicao = buscarNumero(vetor, numero);
                
                if (posicao != -1) {
                    System.out.println("O número " + numero + " está localizado na posição: " + posicao);
                } else {
                    System.out.println("O número " + numero + "	não foi encontrado");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido ou 'sair' para terminar.");
            }
        }
	        
        scanner.close();
    }
	    
    public static int buscarNumero(int[] vetor, int numero) {
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numero) {
	                return i;
            }
	     }
       return -1;
    }
}


