//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
//mostre: 
//a) a área do triângulo retângulo que tem A por base e C por altura. 
//b) a área do círculo de raio C. (pi = 3.14159) 
//c) a área do trapézio que tem A e B por bases e C por altura. 
//d) a área do quadrado que tem lado B. 
//e) a área do retângulo que tem lados A e B.

package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A, B, C;
		double areaTri, areaCirc, areaTrape, areaQuadr, areaRetan; 
		double pi = 3.14159;
		
		System.out.println("Me informar 3 valores: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("Temos então %.1f, %.1f, %.1f%n", A, B, C);
		System.out.println("VAMOS CALCULAR!!\n");
		
		
		//ÁREA do TRIÂNGULO
		areaTri = (A * C) / 2;
		System.out.printf("a) ÁREA TRIÂNGULO: %.3f%n", areaTri);
		
		
		//ÁREA do CIRCULO
		areaCirc = pi * (C * C);
		System.out.printf("b) ÁREA CIRCULO: %.3f%n", areaCirc);
		
		
		//ÁREA do TRAPEZIO
		areaTrape = (A + B) * C /2;
		System.out.printf("c) ÁREA TRAPEZIO: %.3f%n", areaTrape);
		
		
		//ÁREA do QUADRADO
		areaQuadr = B * B;
		System.out.printf("d) ÁREA QUADRADO: %.3f%n", areaQuadr);
		
		
		//ÁREA do RETÂNGULO
		areaRetan = A * B;
		System.out.printf("e) ÁREA RETÂNGULO: %.3f%n", areaRetan);
		
		
		
		
		sc.close();
	}

}
