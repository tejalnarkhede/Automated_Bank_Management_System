package CurrentAccount;
import java.util.Random;
import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class Current_Account 
{
	private String Name;
	private long account_number;
	private double balance;
	private int amount;
	Scanner sc= new Scanner(System.in);
	static long n=0;
	public long generate_accno()
	{
		int n=11111111;
		Random r= new Random();
		n=r.nextInt(99999999);
		return n;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	/*public long getAccount_number() {
		return Account_number;
	}
	public void setAccount_number(long account_number) {
		Account_number = account_number;
	}*/
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		balance = balance;
	}
	public void create_account ()
	{
		System.out.println("\n\n\t\t\t---------------- CREATE ACCOUNT ----------------\n");
		/*System.out.print("\n\t\t\t\tEnter Your Name:-");
		setName(sc.next());
	//	System.out.print("\t\t\t\tEnter Your Account Number:-");
		//a.setAccount_number(sc.nextLong());*/
		System.out.print("\n\t\t\t\tEnter Your Initial Balance:-");
		balance=sc.nextDouble();
		 n=generate_accno();
		 System.out.println("\n\t\t\t\tYour Account Created Successfully..!!!");
		 System.out.println("\n\n\t\t\t\t*********************************************************************");
		System.out.println("\n\t\t\t\tYour Account Number For Current Account is:"+n);
		System.out.println("\n\t\t\t\t************************************************************************");
		
	}

	public void deposit(long amount)
	{
				balance=balance+amount;
				//getBalance();
				System.out.println("\t\t\t\t"+amount+" Rupees Deposited Successfully!");
				System.out.println("\t\t\t\tNow Your Current Account Balance is:"+balance+" Rupees");
	}
			
	public void withdraw(long amount)
	{
		
			balance=balance-amount;
			//balance=balance;
			System.out.println("\n\t\t\t\t"+amount+" Rupees Withdraw Successfully!");
			System.out.println("\n\t\t\t\tNow Your Current Account Balance is:"+balance+" Rupees");
		
		}
		//if(n!=account_number)
		//{
			//System.out.println("\t\t\t\tPlease Enter Correct Account Number");
		//}
	
	public void display_account()
	{
		System.out.print("\n\t\t\t\tEnter Account Number:");
		account_number=sc.nextLong();
			if(n==account_number)
			{
				System.out.println("\n\t\t\t----------------Displaying Account Details-----------------------\n");
				
				System.out.println("\n\t\t\t\tYour Account Number:"+n);
				System.out.println("\n\t\t\t\tYour Account Balance:"+balance);
			}
			if(n!=account_number)
			{
				System.out.println("\n\t\t\t\tPlease Enter Correct Account Number");
			}
	}			

}
