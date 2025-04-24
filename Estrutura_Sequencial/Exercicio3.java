//Fazer um programa para ler quatro valores inteiros A, B, C e D.
//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package Estrutura_Sequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		System.out.printf("Com os valores %d, %d, %d, %d.%n", A, B, C, D);
		System.out.println("Vamos calcular a diferença!");
		System.out.println();
		
		diferenca = ((A * B)-(C * D));
		
		System.out.println("Usando a formula DIFERENCA = (A * B - C * D)");
		System.out.println("DIFERENCA = " + diferenca);
		
		
		
		sc.close();
	}

}
