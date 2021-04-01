package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	/* A company has its own employees and outsourced. For each employee, it is desired to register name, hours worked and value per hour. 
     *Outsourced employees also have an additional expense.
     * The employees' pay corresponds to the value of the hour multiplied by the hours worked, and the outsourced employees still receive a bonus
     *corresponding to 110% of their additional expense.
     * Make a program to read the data of N employees (N provided by the user) and store them in a list. After reading all the data, show name and 
     *payment of each employee in the same order they were typed.*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char answer = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (answer == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} 
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println("\nPAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		sc.close();
	}
}