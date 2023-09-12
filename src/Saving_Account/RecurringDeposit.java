package Saving_Account;
import java.util.Scanner;
public class RecurringDeposit extends SavingAccount {
	private double Recurr_bal;
	private double ROI;
	private long interest;
	//RecurringDeposit recurr=new RecurringDeposit();
	 Account acct=new Account();
	Scanner sc=new Scanner(System.in);
	public void accept() {
		String str;
		do
		{
		
		int cnt,cnt1=0,months;
		long amt1;
		long accno=acct.generate_accno();
		//System.out.println("Your Saving balance is:"+s.getBalance());
		do {
		System.out.println("-----------------------********************************-----------------------");
		System.out.println("\n\t\t\tYour Account number for Recurring account is:"+accno);
		do
		{
		cnt=0;
		System.out.println("\n\n*********************** WELCOME TO RD ACCOUNT *******************************");
		System.out.println("Enter Account number of your RD Account:");
		long n=sc.nextLong();
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
			cnt=1;
		}
			
		}while(cnt==1);
		System.out.println("\nHow many amount do you want to deposit in RD Account per month:");
		amt1=sc.nextLong();
		if(amt1<100)
		{
			System.out.println("\nMinimum 100 Rupees you have to Deposit in RD account...");
			cnt=1;
		}
		}while(cnt==1);
		do
		{
			cnt1=0;
		System.out.println("\nEnter for how many months you want this RD account:");
		 months=sc.nextInt();
		if((months<12)||( months>120)) {
			System.out.println("\nYou have to open RD account for minimum 12 to maximum 120 months...please enter valid number of months..");
			cnt1=1;
		}
		}while(cnt1==1);
		
		if(months>=12 && months<=60)
			ROI=5.40;
		if(months>=60 && months<=120)
			ROI=6.55;

		int cnt2=months;
		int c=0,c1=0;
		//System.out.println("Saving account balance:"+s.acct.getBalance());
		//System.out.println("amt1:"+amt1);
		//long amount;
		//System.out.println("Balance in Saving aCcount is:"+acct.getBalance());
		for(int i=1;i<=cnt2;i++) {
		
			if(s.getBalance()>500)
			{
				s.withdraw(amt1);
				Recurr_bal=Recurr_bal+amt1;
			 c=c+1;
			 System.out.println("===============================================================================");
			 System.out.println(c+" installment is deposited");
			}
			else
			{
				if(c1<6)
				{
				c=c+1;
				System.out.println("\n\n==================== INSUFFICIENT BALANCE !!!===============================");
				System.out.println("\nInsufficient balance!!Your "+c+"th installment is not deposited!!");
				c1=c1+1;
				}
			}
			
			//System.out.println("\nSaving Account Balance:"+s.getBalance());
		}
		System.out.println("********************************************************************************************\n");
		//System.out.println("Now your Balance in Recurring Account is:"+Recurr_bal+" Rupees");	
		
		
		interest=(long) (Recurr_bal*(ROI/100));
		System.out.println("Interest is:"+interest);
		Recurr_bal=Recurr_bal+interest;
		s.deposit((long) Recurr_bal);
		//long Rec_Balance=(long)Recurr_bal;
		System.out.println("\n***********************************************************************************************");
		System.out.println("\nCongratulations!!"+Recurr_bal+" Rupees Transferred succesfully in your saving account..!!!");
		System.out.println("\nNow your current balance in Saving account is:"+s.getBalance()+" Rupees only..");
		System.out.println("\n*************************************************************************************************");
 
		if(c1>=6) 
		{
			System.out.println("\n\n=========================== ACCOUNT IS CLOSED !!!==================================");
			System.out.println("\nYour Account is closed Because 6 installments are not deposited..!!!"); 
		} 
		
		System.out.println("\n\nDo you want to open Recurring Account:");
		 str=sc.next();
	}while(str.equals("yes"));
		System.out.println("\nThank You.!!!");
		
	}
}
