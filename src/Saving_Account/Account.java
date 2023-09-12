package Saving_Account;
import java.util.Random;
import java.util.Scanner;

public class Account extends Exception{
	private long balance;
	private long interest;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(long amount) {
		balance=balance+amount;
	}
	public void withdraw(long amount) {
		balance=balance-amount;
		//return balance;
	}
	public void interest() {
		interest=(long)((long)balance*0.06);
		balance=balance+interest;
	}
	public void tax() {
		if(interest>10000)
		{
		long inter1=interest-10000;
		inter1=(long)((long)inter1*0.10);
		System.out.println("Your tax is:"+inter1+" Rupees");
		balance=balance-inter1;
		}
	}
	public int generate_accno() {
		//Scanner sc=new Scanner(System.in);
		int n=11111111;
		Random r=new Random();
		n=r.nextInt(99999999);
		return n;
		//System.out.println("\n====================================================");
		//
		//System.out.println("\n====================================================");
	}
	public String toString() {
		return "Invalid Account Number!!";
	}
	
}
