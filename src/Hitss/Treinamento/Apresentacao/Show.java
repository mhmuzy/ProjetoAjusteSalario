package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("          Hitss Treinamento");
		System.out.println("");
		System.out.println("Digite o Salário do Funcionário:");
		try {
			Scanner teclado = new Scanner(System.in);
			
			double salario = teclado.nextDouble();
			
			System.out.println("");
			
			if (salario < 5000.00) {
				salario = salario * 1.3;
				System.out.println("O novo salário do funcionário é de: R$ " + salario);
			} else {
				System.out.println("O salário do funcionário é alto demais, não vai ter aumento.");
			}
			
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
