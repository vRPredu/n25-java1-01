package br.com.senaisp.bauru.aula04;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str01 = "Roberto da Silva Sauro";
		//Verificar se há dino no texto
		System.out.println(str01.contains("dino"));
		//Obter a posição no texto de um subtexto (aqui eu quis o 2 A)
		System.out.println(str01.indexOf("a",10));
		//Obter o caractere na posição desejada
		System.out.println(str01.charAt(3));
		// Obtendo substring de uma string sem limitar final
		System.out.println(str01.substring(6));
		// Obtendo substring de uma string limitando final
		System.out.println(str01.substring(06,15));
		// Usando o compareTo
		System.out.println(str01.compareTo("Roberta"));
	}

}
