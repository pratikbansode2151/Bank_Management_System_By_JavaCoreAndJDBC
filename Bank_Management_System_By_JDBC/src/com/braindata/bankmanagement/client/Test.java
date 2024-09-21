package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sbi s = new Sbi();
		
		int choice;
		
		do {
		System.out.println("Enter the choice \n\n"+"1.Create Account \n"+"2.Display All Details of Account Holders \n"+"3. Deposite Money \n"+"4.Withdrawel Money\n"+"5.Check Balance\n");
		
		choice = sc.nextInt();
		switch(choice)
		{
		
		case 1 :
			s.createAccount();
		    break;
		    
		case 2 :
		
			s.displayAllDetails();
            break;
		     
		case 3 :
	
			s.depositeMoney();
			break;
		
		case 4 :
		
			s.withdrawal();
			break;

		
		case 5 :
		
			
			s.balance();
		    break;
		
		}
		}
		while(choice!=5);


	}

}
