package atividades6_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade_2 {
	
	public static void main(String[] args) {
		
		float n1, n2, n3, n4, media;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota");
		n1 = scanner.nextFloat();
		
		System.out.println("Digite sua segunda nota");
		n2 = scanner.nextFloat();
		
		System.out.println("Digite sua terceira nota");
		n3 = scanner.nextFloat();
		
		System.out.println("Digite sua quarta nota");
		n4 = scanner.nextFloat();
		
		//n1 =10, n2=8, n3=7 e n4=7,5
		media = (n1+n2+n3+n4)/4;
		
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.println("Sua média é " + df.format(media));
		//DecimalFormat usado para que a media mostre somente uma casa decimal e não fique como 8,125 
		
		scanner.close();
	}

}
