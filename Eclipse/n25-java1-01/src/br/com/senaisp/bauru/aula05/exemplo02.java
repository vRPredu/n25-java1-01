package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu primeiro nome: ");
		String nome = sc.next();
		System.out.println("Seu nome é " + nome);
		System.out.println("Digite seu nome completo");
		sc.nextLine();
		String nomeCompleto=sc.nextLine();
		System.out.println("Nome completo: " +nomeCompleto);
		sc.close();
	}

}
