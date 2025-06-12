package br.com.senaisp.bauru.classes;

import java.util.Scanner;

public class ConversaoGal2Lit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o numero de galões para conversão: ");
		double galao = sc.nextDouble();
		double litros = galao * 3.785;
		sc.close();
		// fazendo a conversão e mostrando
		System.out.println(galao + " Galões é igual a: " + litros + " litros");

	}

}
