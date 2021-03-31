package application;

import entities.BusinessAccount;

public class Program {

	/*Suppose a bank business that has a common account and a business account, and the business account has all members of the common account,
     *plus a loan limit and a loan operation.*/
	
	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 100.0, 500.0);

		System.out.println(account.getBalance());

	}
}