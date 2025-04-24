//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais.

//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double raio, area, pi = 3.14159; 
		
		raio = sc.nextDouble();
		
		System.out.println("Se um Circulo com o raio = " + raio);
		System.out.println("Qual será a area desse Circulo?");
		System.out.println();
		
		
		area = pi*(raio*raio);
		
		System.out.printf("A área do Circulo será: %.4f", area);

		sc.close();
	}

}
