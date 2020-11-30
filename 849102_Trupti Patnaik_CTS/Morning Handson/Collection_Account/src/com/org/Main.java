package com.org;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int d=0;
		AccountService accountService = new AccountService();
		do {
			System.out.println("Menu:\n");
			System.out.println("1. Add an account");
			System.out.println("2. Remove account by account number");
			System.out.println("3. Display account by account number");
			System.out.println("4. Display all the accounts");
			System.out.println("5. Display all the accounts having balance less than 1000");
			System.out.println("6. Exit");
			Scanner sc = new Scanner(System.in);
			d= sc.nextInt();
			switch(d) {
			case 1:System.out.println("Enter the Account no");
					int accnno=sc.nextInt();
					System.out.println("Enter the account name:");
					String accname=sc.next();
					System.out.println("Enter the Account Balance");
					int accbalance= sc.nextInt();
				try 
				{
					accountService.addAccount(new Account(accnno,accname,accbalance));
				} catch (AccountAlreadyException e) 
				{
					System.out.println("Account already present");
				}
					break;
			
			
			
			
			case 2: System.out.println("Enter the account no:");
				try 
				{
					accountService.removeAccount(sc.nextInt());
				} catch (AccountNotFoundException e) 
				{
					System.out.println("account does not exist");
				}
					break;
			case 3: System.out.println("enter the account no. to get account");
				try 
				{
					accountService.getAccountByNum(sc.nextInt());
				} catch (AccountNotFoundException e) 
				{
					System.out.println("account does not exist");
				}
					break;
			case 4: accountService.getAllaccounts();
					break;
			case 5:accountService.getAccountswithLowBalance();
					break;
			
			}
		}while(d!=6);
	}
}