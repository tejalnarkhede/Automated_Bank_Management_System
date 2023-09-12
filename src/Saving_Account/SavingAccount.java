package Saving_Account;
import java.util.*;
public class SavingAccount extends Account {
		// TODO Auto-generated method stub
	private double Saving_bal;
	static SavingAccount s=new SavingAccount();
	static //Account acct=new Account();
	Scanner sc=new Scanner(System.in);
	
	public static void Saving() throws Account {
		int a1;
		String str1,str2,name;
		int cnt=0,cnt1=0,a=0,cnt3=0;
		long amt = 0;
		System.out.println("\n\t\t\t=========****** WELCOME TO SAVING ACCOUNT ******=========\n");
		 System.out.println("\nPlease enter your Name:");
		 name=sc.next();
		 Thread.currentThread().setName(name);
		do
		{
		 a1=0;
		System.out.println("===================================================");
		System.out.println("\nEnter amount to open your saving account:");
		 amt=sc.nextLong();
		
		 try
		 {
		 if(amt<0)
		 {
			 throw new IllegalArgumentException("Amount must be Positive");
		 }
		 }
		 catch(IllegalArgumentException e)
		 {
			 e.printStackTrace();
		 }
		if(amt>=500)
		{
		s.deposit(amt);
		System.out.println("\nYour Saving account is created successfully..!!!");
		}
		else
		{
		System.out.println("\nYou have to invest minimum 500 Rupees..!!!");
		a1=1;
		}
		}while(a1==1);
		int n=s.generate_accno();
		System.out.println("-----------------------********************************-----------------------");
		System.out.println("\n\t\t\tYour Account number for saving account is:"+n);
		System.out.println("\n\n*********************** WELCOME TO SAVING ACCOUNT *******************************");
		do
		{
		do
		{
			cnt3=0;
		System.out.println("\n\n-----------------**** SAVING ACCOUNT MENU ****---------------------");
		System.out.println("1.Saving account \n2.Recurring deposit of saving type \n3.Fixed deposit of saving type");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Enter the option of account which you want:");
		a=sc.nextInt();
		if((s.getBalance()<=500)&&(a!=1))
		{
			System.out.println("Insufficient Balance in your saving account!!You can't create another account of saving type");
			cnt3=1;
		}
		}while(cnt3==1);	
		
		switch(a)
		{
case 1:
		System.out.println("Enter your account number:");
			int accno=sc.nextInt();
			try
			{
			if(n!=accno)
			{
				throw new Account();
			}
			}
			catch(Account e) {
				e.printStackTrace();
				System.out.println("Transaction Failed..!!!");
			}
			
			
			if(n==accno)
			{
		//public static void SavingTransaction()
		//{	
		do
		{
		System.out.println("\n============================================================");
		System.out.println("\t\tSAVING ACCOUNT MENU");
		System.out.println("============================================================");
		System.out.println("1.Deposit \n2.Withdraw \n3.Check Balance");
		System.out.println("============================================================");
		System.out.println("Enter the Option:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter amount you want to deposit in your saving account:");
			long amount=sc.nextLong();
			cnt1=cnt1+1;
			 try
			 {
			 if(amt<0)
			 {
				 throw new IllegalArgumentException("Amount must be Positive");
			 }
			 }
			 catch(IllegalArgumentException e)
			 {
				 e.printStackTrace();
			 }
			if(cnt1<=5)
			{
			s.deposit(amount);
			System.out.println(Thread.currentThread().getName()+" is going to Deposit...");
			}
			else
				System.out.println("\n Sorry!You can't do transaction more than 5 times in saving account");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Deposited Successfully...Now Your Balance is:"+s.getBalance()+" Rupees");
			break;
			
		case 2:
		System.out.println("Enter amount to Withdraw:");
		long amount1=sc.nextLong();
		cnt=cnt+1;
		if(cnt<=5)
		{
		makeWithdraw(amount1);
		}
		else
		{
			System.out.println("\n Sorry!You can't do transaction more than 5 times in saving account");
		}
		if(s.getBalance()<0)
		{
			System.out.println("Account is overdrawn!!");
		}
		break;
		
		case 3:System.out.println("\nNow Your current balance is:"+s.getBalance()+" Rupees in your Saving account");
				break;
		}
	
		System.out.println("\nDo you want to continue?(yes/no):");
		 str1=sc.next();
		}while(str1.equals("yes"));	
		}
			
			break;
case 2:RecurringDeposit recurr=new RecurringDeposit();
		recurr.accept();
		break;

case 3:FixedDeposit fixed=new FixedDeposit();
		fixed.accept();
		break;
			}

			//System.out.println("Invalid Account number..!!");
		//}//main switch
	
		System.out.println("\nDo you want to go in main menu(yes/no):");
		str2=sc.next();
		}while(str2.equals("yes"));
		System.out.println("Thank You...!!!");
	}
	private synchronized static void makeWithdraw(long amt) {
		//double interest = 0;
		
		if((s.getBalance()>500)&&(s.getBalance()-500>=amt))
		{
			System.out.println(Thread.currentThread().getName()+" are going to withdraw...");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			Scanner sc=new Scanner(System.in);
			System.out.println("\nAre you withdrawing amount before one year?(yes/no):");
			String str=sc.next();
			if(str.equals("yes"))
			{
			s.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+" completes withdrawl...Now Your Balance is:"+s.getBalance()+" Rupees");
			}
			else
			{
				s.interest();
				//System.out.println("Interest Added in your saving account..");
				s.tax();
				s.withdraw(amt);
				System.out.println(Thread.currentThread().getName()+" completes withdrawl...Now Your Balance is:"+s.getBalance()+" Rupees by cutting tax ");
			}
			}
		else
		{
			System.out.println("\nNot enough in account for "+Thread.currentThread().getName()+" to withdraw.."+s.getBalance()+" Rupees");
			System.out.println("Minimum 500 Rupees is must in your Saving account...");
		}
	}
	
}
