package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] quartos = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Quarto (1-10):");
			int quarto = sc.nextInt();
			
			quartos[quarto-1]= new Aluguel(name,email,quarto);
			
		}
		
		System.out.println("Quartos ocupados:");
		for(int i = 0 ; i < quartos.length; i++) {
			if(quartos[i]!=null) {
				System.out.println(quartos[i].getQuarto() + ": " + quartos[i].getName() + ", " + quartos[i].getEmail());
			}
		}
		
		sc.close();
	}

}
