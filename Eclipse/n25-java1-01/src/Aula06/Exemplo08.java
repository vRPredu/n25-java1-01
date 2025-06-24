package Aula06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		do {
		try {
			System.out.println("Digite sua idade!: ");
			idade = sc.nextInt();
			System.out.println("Você nasceu em: " + ( 2025 - idade));
		} catch (InputMismatchException e) {
		idade=0;
		System.out.println("Você digitou uma idade inválida!");
		sc.nextLine();
		
		}
		} while (idade<=0);
		sc.close();
	}

}
