package com.bank.app;

import java.util.Scanner;

public class BankApp 
{

	public static void main(String[] args)
	{
		BankAccount obj=new BankAccount ("GYANA DASH","DA9861");
		obj.showMenu();
    }

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String coustomerName;
	String coustomerId;
	
	BankAccount (String cname,String cid)
	{
		coustomerName=cname;
		coustomerId=cid;
	}
	
	void deposit(int amount)
	{
		if (amount != 0)
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	void withdrawl (int amount)
	{
		if (amount != 0)
		{
			balance=balance-amount;
			previousTransaction= -amount;
		}
	}
	void getPreviousTransaction()
	{
		if (previousTransaction>0)
		{
			System.out.println("AMOUNT DEPOSITED="+ previousTransaction);
		}
		else if (previousTransaction<0)
		{
			System.out.println("AMOUNT WITHDRAWL="+Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("NO TRANSACTION IS HAPPEN");
		}
	}
	void showMenu()
	{
		char option='\0';
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("WELCOME:--"+coustomerName);
		System.out.println("YOUR ID IS:--"+coustomerId);
		System.out.println("\n");
		System.out.println("A:--CHECK BALANCE");
		System.out.println("B:--FOR DEPOSIT MONEY");
		System.out.println("C:--FOR WITHDRAWL MONEY");
		System.out.println("D:--PREVIOUS TRANSACTION");
		System.out.println("E:--EXIT");
		
		do
		{
			System.out.println("=================================");
			Scanner sg=new Scanner (System.in);
			System.out.println("PLEASE ENTER AN OPTION");
			System.out.println("=================================");
			
			option=sg.next().charAt(0);
			System.out.println("\n");
			
			switch (option)
			{
			case 'A':
				System.out.println("-----------------------------");
				System.out.println("YOUR BALANC IS = "+balance);
				System.out.println("-----------------------------");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("-----------------------------");
				Scanner st=new Scanner (System.in);
				System.out.println("ENTER AN AMOUNT TO DEPOSIT :");
				System.out.println("-----------------------------");
				int amount =sc.nextInt();
				deposit(amount);
				System.out.println("AMOUNT DEPOSITED SUCCESFULLY..!!");
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("----------------------------");
				Scanner su=new Scanner (System.in);
				System.out.println("ENTER AN AMOUNT TO WITHDRAWL :");
				System.out.println("----------------------------");
				int amount2 =sc.nextInt();
				withdrawl(amount2);
				System.out.println("YOUR TRANSACTION IS SUCCESFULL..!!");
				System.out.println("\n");
				break;
			case 'D':
				System.out.println("----------------------------");
				System.out.println("YOUR PREVIOUS TRANSACTION WAS :");
				getPreviousTransaction();
				System.out.println("----------------------------");
				System.out.println("\n");
				break;
			case 'E':
				System.out.println("******************************");
				break;
			default:
				System.out.println("INVALID OPTION....\n"+"PLEASE ENTER AGAIN :");
				break;
									
			}
		}
		while (option != 'E');
	       
		System.out.println("THANK YOU FOR USING OUR SERVICE...!!!\n"+"HAVE A NICE DAY..");
	}
	
}
