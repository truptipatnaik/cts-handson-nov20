package com.org;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

	List<Account> acc = new ArrayList<>();
	public void addAccount(Account acn) throws AccountAlreadyException
	{
		for (Account account : acc) 
		{
			if(account.getAccountNo()==acn.getAccountNo())
				throw new AccountAlreadyException();
		} 
		acc.add(acn);	
	}
	public void removeAccount(int num) throws AccountNotFoundException 
	{
		Account resaccount = null;
		for (Account account : acc)
		{
			if(account.getAccountNo()==num)
				resaccount=account;
		}
		if(resaccount==null)
			throw new AccountNotFoundException();
		else {
			for (Account account : acc) {
				if(account.getAccountNo()==num)
					acc.remove(account);
			}}
		
	}
	public void getAccountByNum(int num) throws AccountNotFoundException 
	{
		Account resaccount = null;
		for (Account account : acc) 
		{
			if(account.getAccountNo()==num)
				resaccount=account;
		}if(resaccount==null)
			throw new AccountNotFoundException();
		else
			System.out.println(resaccount);
	}
	public void getAllaccounts() 
	{
		acc.stream().forEach(item->System.out.println(item));
	}
	public void getAccountswithLowBalance() 
	{
		acc.stream().forEach(item->{if(item.getAccountBalance()<1000) System.out.println(item);});
	}
	
}