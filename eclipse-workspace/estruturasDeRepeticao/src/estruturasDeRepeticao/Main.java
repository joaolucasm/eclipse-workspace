package estruturasDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//int x = 0;
		//int N = sc.nextInt();
		//int soma = 0;
		
		//while(x !=0 ) {
		//	soma += x;
		//	x = sc.nextInt();
		//}
			
		//for(int i = 0; i<N; i++){
		//	x = sc.nextInt();
		//    soma += x;	
		//}
		
		//System.out.printf("O valor da soma: %d", soma);
		
		//PROGRAMA PRA CALCULAR TEMPERATURA EM FAHRENHEIT:
		
		char resp;
		
		do {
			
		System.out.print("Digite a temparatura em Celsius:");
		double C = sc.nextDouble();
		double F = (9.0 * C) / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit:%.1f\n",F);
		
		System.out.print("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		
		}while(resp != 'n');
	
		sc.close();
	}

}
