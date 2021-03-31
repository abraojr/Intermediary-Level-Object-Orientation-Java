package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	/*Suppose a bank business that has a common account and a business account, and the business account has all members of the common account,
    *plus a loan limit and a loan operation.
     Suppose the following rules for withdraw:
     - Common account: is charged a fee of 5.00.
     - Business account: make the withdrawal normally from the superclass (Account), and then discount another 2.0.
     - Savings account: withdraws without fee.*/

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance()); // OUTPUT: 795.0

		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance()); // OUTPUT: 800.0

		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance()); // OUTPUT: 793.0
	}
}
