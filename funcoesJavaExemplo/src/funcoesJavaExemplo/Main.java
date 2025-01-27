package funcoesJavaExemplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		showResult(max(a,b,c));
		
		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		}else if (b > c) {
			return b;
		}else {
			return c;
		}
	}
	
	public static void showResult(int x) {
		System.out.println("Higher:" + x);
		return;
	}

}
