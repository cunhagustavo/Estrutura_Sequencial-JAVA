//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorPeca1, totalPeca1, valorPeca2, totalPeca2, valorPagar;
		
		//Vamos atribuir as informações da PEÇA 1
		
		System.out.println("Código da PEÇA 1:");
		codPeca1 = sc.nextInt();
		
		System.out.println("Quantas PEÇAS 1 vai querer?");
		numPeca1 = sc.nextInt();
		
		System.out.println("O valor da PEÇA 1 é: ");
		valorPeca1 = sc.nextDouble();
		
		totalPeca1 = numPeca1 * valorPeca1;
		
		System.out.printf("O valor total da PEÇA 1 é: R$ %.2f%n ", totalPeca1);
		
		
		
		//Vamos atribuir as informações da PEÇA 2
		
		System.out.println();
		System.out.println("Código da PEÇA 2:");
		codPeca2 = sc.nextInt();
		
		System.out.println("Quantas PEÇAS 2 vai querer?");
		numPeca2 = sc.nextInt();
		
		System.out.println("O valor da PEÇA 2 é: ");
		valorPeca2 = sc.nextDouble();
		
		totalPeca2 = numPeca2 * valorPeca2;
		
		System.out.printf("O valor total da PEÇA 2 é: R$ %.2f%n ", totalPeca2);
      
		
		
		//Total final
		
		valorPagar = totalPeca1 + totalPeca2;
		System.out.println();
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
		
		
		sc.close();
		
	}

}
