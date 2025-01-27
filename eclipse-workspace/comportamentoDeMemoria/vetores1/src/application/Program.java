package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe valor n:");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n ; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for(int i = 0; i < n ; i++) {
			soma += vect[i];
		}
		
		System.out.print("Avarage height: " + (soma/3));
		
		sc.close();
	}

}
