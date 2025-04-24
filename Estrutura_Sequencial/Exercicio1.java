//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//mensagem explicativa, conforme exemplos.

package Estrutura_Sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.printf("Com a soma de %d + %d temos: %n", a, b);
		System.out.println("SOMA = " + soma);
		System.out.println();
	
		
		sc.close();
	}

}
