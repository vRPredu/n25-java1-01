package br.com.senaisp.bauru.aula04;
import java.util.Scanner;
public class Exemplo2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.next(); //Utiliza o demilitador padrão
		System.out.println("Seu nome é: " + nome);
		//Agora pegando o nome completo
		System.out.println("Digite seu nome completo: ");
		sc.nextLine(); // Captura o enter do comando anterior
		String nomeCompleto = sc.nextLine();//Utiilza o delimitador \n
		System.out.println("Nome completo:" + nomeCompleto);
		sc.close();

	}

}
