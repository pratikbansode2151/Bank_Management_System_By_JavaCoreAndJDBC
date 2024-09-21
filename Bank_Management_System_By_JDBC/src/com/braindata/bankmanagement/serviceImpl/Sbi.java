package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Sbi implements Rbi{
	
	
	Scanner sc= new Scanner(System.in);
	

	@Override
	public void createAccount() 
	{
	Account a = new Account();
	
	System.out.println("Enter the Account No of the");
	int accNo = sc.nextInt(); 
	
	System.out.println("Enter the Name of the user");
	String name = sc.next();
	
	System.out.println("Enter the Mobile number of the user");
	String mobNo = sc.next();
	
	System.out.println("Enter the adhar no the user");
	String adharNo = sc.next();
	
	System.out.println("Enter the gender of the user");
	String gender = sc.next();
	
	System.out.println("Enter the age of the user");
	int age = sc.nextInt();
	
	System.out.println("Enter the balance of the user");
	Double balance = sc.nextDouble();

	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		
		String sql = "insert into banki values("+accNo+", '"+name+"','"+mobNo+"', '"+adharNo+"', '"+gender+"', "+age+", '"+balance+"'  )";
		
		Statement smt = con.createStatement();
		
		smt.execute(sql);
		smt.close();
		con.close();

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	@Override
	public void displayAllDetails() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			
			String sql = "select * from banki";
			
			Statement smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getInt(6));
				System.out.println(rs.getString(7));
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void depositeMoney() {
		Account a = new Account();
		
		try {
			
			System.out.println("Enter the money to be dopostied");
			double dopositeMoney = sc.nextDouble();
			
		     
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			
			String sql = "update from banki balance";
			
			Statement smt = con.createStatement();

			smt.executeUpdate(sql);
			smt.close();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}

	
}
