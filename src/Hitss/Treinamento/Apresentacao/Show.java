package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("          Hitss Treinamento");
		System.out.println("");
		System.out.println("Digite o Sal�rio do Funcion�rio:");
		try {
			Scanner teclado = new Scanner(System.in);
			
			double salario = teclado.nextDouble();
			
			System.out.println("");
			
			if (salario < 5000.00) {
				salario = salario * 1.3;
				System.out.println("O novo sal�rio do funcion�rio � de: R$ " + salario);
			} else {
				System.out.println("O sal�rio do funcion�rio � alto demais, n�o vai ter aumento.");
			}
			
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
