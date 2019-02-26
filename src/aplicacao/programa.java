package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Product;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 10;
		Product[] vetor = new Product[n];
		
		System.out.println("Quantos quarto vc quer alugar? " );
		int qtd = sc.nextInt();
		
		for (int i=0; i<qtd; i++) {
			sc.nextLine();
			System.out.println("Quarto " + i);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vetor[quarto] = new Product(nome, email);
		}
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i].getNome() + ", " + vetor[i].getEmail());
			}
		}
		
		sc.close();

	}

}
