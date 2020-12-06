package com.org;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Service service=new Service();
		int x=1,n;
		do {
			System.out.println("1. Add an employee");
			System.out.println("2. Find the employee by Id");
			System.out.println("3. Display the Employee List");
			System.out.println("4. Sort the Employee List by Id");
			System.out.println("5. Sort the Employee List by Name");
			System.out.println("6. Sort the Employee List by Salary");
			System.out.println("7. Sort the Employee List by D.O.B");
			System.out.println("8. Exit");

			n=sc.nextInt();

			switch(n) {
			case 1:
			{
				System.out.println("Enter the id of the employee");
				int a=sc.nextInt();
				System.out.println("Enter the name of the employee");
				String b=sc.next();
				System.out.println("Enter the salary of the employee");
				int c=sc.nextInt();
				System.out.println("Enter the Date of Birth of the employee// Format: yyyy-MM-dd");
				String e=sc.next();
				LocalDate d= LocalDate.parse(e);
				service.add(new Employee(a,b,c,d));
				break;
			}
			case 2:
			{
				System.out.println("Enter the employee id to be searched");
				int k=sc.nextInt();
				System.out.println(service.find(k));
				break;
			}
			case 3:
			{
				System.out.println("The list of employees");
				service.display().forEach(item -> System.out.println(item));
				break;
			}

			case 4:
			{
				System.out.println("The list sorted by ID in Ascending order");
				service.sortID();
				service.display().forEach(item ->System.out.println(item));
				break;
			}

			case 5:
			{
				System.out.println("The list sorted by Name in Ascending order");
				service.sortName();
				service.display().forEach(item -> System.out.println(item));
				break;
			}

			case 6:
			{
				System.out.println("The list sorted by Salary in Ascending order");
				service.sortSalary();
				service.display().forEach(item->System.out.println(item));
				break;
			}

			case 7:
			{
				System.out.println("The list sorted by DOB in Ascending order");
				service.sortDOB();
				service.display().forEach(item->System.out.println(item));
				break;
			}

			case 8:
			{
				x=0;
				break;
			}

			}
		}while(x==1);
		System.out.println("Thank You");
	}

}