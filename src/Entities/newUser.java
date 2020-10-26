package Entities;

public class newUser {
	
	private int number;
	private String name;
	private double balance;
	
	public newUser() {
	}

	public newUser(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public newUser(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	
	public void deposit(double amount) {
		this.balance+= amount;
	}
	
	public void withdraw(double amount) {
		this.balance-= amount+5;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account "
				+number
				+", Holder: "
				+name
				+", Balance: $"
				+String.format("%.2f", balance);
	}
}