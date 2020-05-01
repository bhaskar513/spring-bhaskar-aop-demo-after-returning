package com.bhaskar.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bhaskar.aop.Account;

@Component
public class AccountDAO {
  
	private String name;
	private String serviceCode;
	
	// add a method:findAccounts()
	
	public List<Account> findAccounts(){
		List<Account> myAccounts=new ArrayList<>();
		
		//create sample account
		Account temp1=new Account("John", "silver");
		Account temp2=new Account("virat", "gold");
		Account temp3=new Account("rohit", "hit man");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		return myAccounts;
	}
	
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + " doing my db work adding account");
	}
	
	public boolean doWork()
	{
		System.out.println(getClass() + " doing work()");
		return false;
	}

	public String getName() {
		System.out.println(getClass() + " in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + "in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " in getServiceCode ()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " in setServiceCode ()");
		this.serviceCode = serviceCode;
	}
	
	
}
