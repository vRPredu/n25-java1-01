package br.com.senaisp.bauru.aula05;
import java.util.Scanner;
public class exemplo07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite S ou N");
		String res = sc.nextLine();
		// Usando operador ternário
		//testeLógico ? valor_se_verdade : valor_se_falso
		System.out.println("Voce digitou: "+(res.charAt(0)=='S' ? "Sim": "Não"));
	}

}
