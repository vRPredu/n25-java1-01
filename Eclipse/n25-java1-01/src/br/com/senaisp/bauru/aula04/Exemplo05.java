package br.com.senaisp.bauru.aula04;
import java.util.Scanner;

public class Exemplo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um valor entre 1 e 5" );
		int vlr = sc.nextInt();
		switch (vlr) {
		case 1: System.out.println("Você ganhou uma caneta!" );
		break;
		case 2: System.out.println("Você ganhou um lápis!" );
		break;
		case 3: System.out.println("Você ganhou uma borracha!" );
		break;
		case 4: System.out.println("Você ganhou um bombom!" );
		break;
		case 5: System.out.println("Você ganhou uma bala!" );
		break;
		default: System.out.println("Opção inválida!" );
		}
		sc.close();
		
	}
	

}
