package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		
		System.out.print("Number:");
		int number = sc.nextInt();
		System.out.print("Holder name:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n) ?");
		char resp = sc.next().charAt(0);
		
		double value;
		
		if(resp == 'y') {
			System.out.print("Enter initial deposit value:");
			value = sc.nextDouble();		
		}else {
			value = 0;
		}
	
		account holder = new account(number,name,value);
		
		System.out.println("Account data:\n" + holder);
		
		System.out.print("Enter the deposit value:");
		value = sc.nextDouble();
		holder.deposit(value);
		System.out.println("Updated account data:\n" + holder);
		System.out.print("Enter a withdraw value:");
		value = sc.nextDouble();
		holder.withdraw(value);		
		System.out.println("Updated account data\n" + holder);
		
		sc.close();

	}

}
