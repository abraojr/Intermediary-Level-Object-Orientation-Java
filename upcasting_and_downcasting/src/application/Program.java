package application;

import java.util.Locale;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Account acc = new Account(1001, "Alex", 100.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 300.0, 500.0);

		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount)acc3; error!!
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		System.out.println("Balance of acc: " + String.format("%.2f", acc.getBalance()));
		System.out.println("Balance of acc1: " + String.format("%.2f", acc1.getBalance()));
		System.out.println("Balance of acc4: " + String.format("%.2f", acc4.getBalance()));
	}
}