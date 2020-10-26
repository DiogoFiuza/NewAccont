package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.newUser;


public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		newUser account;
		
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new newUser(number,name,initialDeposit);
		}else {
			account = new newUser(number,name);
		}
		
		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.print("Updated account data: ");
		System.out.println(account);
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		double withValue = sc.nextDouble();
		account.withdraw(withValue);
		System.out.print("Updated account data: ");
		System.out.print(account);
		
		sc.close();
	}	
}
