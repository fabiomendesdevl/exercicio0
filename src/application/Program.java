package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Pessoa;
import entites.PessoaFisica;
import entites.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Pessoa> list = new ArrayList<>();
		System.out.print("Numero de contribuintes: ");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println(i + "° Contribuinte");
			System.out.print("Pessoa fisica ou juridica: f/j: ");
			char p = sc.next().charAt(0);
			System.out.print("Insira o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Insira a renda anual: ");
			double renda = sc.nextDouble();

			if (p == 'f') {
				System.out.print("Insira o gasto com a saude: ");
				double gastoSaude = sc.nextDouble();

				Pessoa pessoaF = new PessoaFisica(nome, renda, gastoSaude);
				list.add(pessoaF);
			} else if (p == 'j') {
				System.out.print("Insira o numero de funcionarios: ");
				int funcionarios = sc.nextInt();
				Pessoa pessoaJ = new PessoaJuridica(nome, renda, funcionarios);
				list.add(pessoaJ);
			}
		}
		System.out.println();
		for (Pessoa p : list) {
			System.out.println(p);
			sc.close();
		}
		double soma = 0.0;
		for(Pessoa p : list) {
			soma = soma + p.totalValor();
			System.out.print("Valor total: "+ soma);
		}

	}
}
