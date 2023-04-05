package com.vitorcamara.projetos;

import java.util.Scanner;

public class DivisoresAteONumeroInformado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição " + i + ":");
			vetorA[i] = scan.nextInt();

		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("\nNúmero " + vetorA[i] + " é divisível por:");

			for (int j = 1; j <= vetorA[i]; j++) { // segundo For com o contador 'j' como número divisor, indo até o
												  // número fornecido pelo usuário

				if (vetorA[i] % j == 0) {
					System.out.println(j); // números divisores
				}
			}
		}

	}

}
