//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//decimais.

package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);


		int numFun, numHoras;
		double valHoras, salario;
		
		numFun = sc.nextInt();
		numHoras = sc.nextInt();
		valHoras = sc.nextDouble();
					
		System.out.print("Se o funcionário do número " + numFun);
		System.out.print(", trabalhou por  " + numHoras + " horas,");
		System.out.println(" e o valor por hora que ele recebe é de U$ "+ valHoras);
		System.out.println();
		
		salario = (int) numHoras * valHoras; 
				
		System.out.println("Temos então:");
		System.out.printf("NUMBER = %d%n", numFun);
		System.out.printf("SALARY = U$ %.2f ", salario);
		
	}

}
