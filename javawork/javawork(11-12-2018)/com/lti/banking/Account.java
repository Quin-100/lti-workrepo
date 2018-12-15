package com.lti.banking;

import java.util.Scanner;

public class Account {
	
	private int accId;
	private String accType;
	private double accBal;
	
	public Account(int accId, String accType, double accBal) {
		super();
		this.accId = accId;
		this.accType = accType;
		this.accBal = accBal;
	}
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	@Override
	public String toString() {
		return "Account [accType=" + accType + ", accBal=" + accBal + "]";
	}
	
	public void applyCharges() {		
		//Local class inside the method 
		class Audit
		{
			float charges = 0.0f;
			void calcCharges(int days) {
				if(days > 7 && days <= 10) {
					charges = 1000.00f;					
				}
				else if(days > 10) {
					charges = 2000.00f;
				}
				System.out.println("Balance before charges :"+accBal);
				accBal = accBal - charges;
				System.out.println("Charges applied : "+charges);				
				System.out.println("Balance after charges : "+accBal);
				
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of days : ");
		int noDays = sc.nextInt();
		Audit au = new Audit();
		au.calcCharges(noDays);		
	}
	
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Account acc = new Account(121, "Current", 250000);
		acc.applyCharges();
		System.out.println(acc);
	}
}
