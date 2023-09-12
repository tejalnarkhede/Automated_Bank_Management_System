package Saving_Account;
import java.util.*;
public class FixedDeposit extends SavingAccount {
	private double fixed_bal;
	private double ROI;
	private long interest;
	//SavingAccount s=new SavingAccount();
	Account acct=new Account();
	Scanner sc=new Scanner(System.in);
	public void accept() {
		int cnt2=0,cnt,cnt1=0,months,years,days;
		long amt1;
		String str;
		do
		{
		
		long accno=acct.generate_accno();
		System.out.println("-----------------------********************************-----------------------");
		System.out.println("\n\t\t\tYour Account number for Fixed deposit account is:"+accno);

		System.out.println("\n\n*********************** WELCOME TO FD ACCOUNT *******************************");
		do
		{
			cnt=0;
		System.out.println("Enter Account number of your FD Account:");
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
		do
		{
			cnt=0;
		System.out.println("\nHow many amount do you want to invest in Fd account:");
		amt1=sc.nextLong();
		if(amt1<1000)
		{
			System.out.println("\n You have to invest minimum 1000 Rupees in FD account...");
			cnt=1;
		}
		if(s.getBalance()-500<amt1)
		{
			System.out.println("Insufficient Balance..!!!");
			cnt=1;
		}
		}while(cnt==1);
			cnt1=0;
			System.out.println("--------------- Select Duration of Account -------------------");
			System.out.println("\n1.Years \n2.Months \n3.Days");
			System.out.println("\nEnter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:do
					{
				cnt1=0;
				System.out.println("\nEnter Years(1-10):");
				years=sc.nextInt();
				if((years<0)||(years>10))
				{
					System.out.println("\nYou can open FD account for Maximum 10 years..");
					cnt1=1;
				}
				}while(cnt1==1);
				if((years>=1)&&(years<=3))
				ROI=5.50;
				if((years>=4)&&(years<=5))
				ROI=5.80;
				if((years>5)&&(years<=10))
				ROI=6.10;
				break;
			
			case 2:do
					{
					cnt1=0;
					System.out.println("\nEnter Months(1-12):");
					months=sc.nextInt();
					if((months<0)||(months>48))
					{
						System.out.println("\nPlease enter valid number of months...");
						cnt1=1;
					}
					}while(cnt1==1);
					if((months>=1)&&(months<=12))
						ROI=5.10;
					break;
					
			case 3:do
					{
					cnt1=0;
					System.out.println("\nEnter Days(7-211):");
					days=sc.nextInt();
					if((days<7)||(days>211))
					{
						System.out.println("\nPlease enter valid number of days...");
						cnt1=1;
					}
					}while(cnt1==1);
				if((days>=7)&&(days<=45))
				 ROI=2.90;
				if((days>=46)&&(days<=179))
				 ROI=3.90;
				if((days>=180)&&(days<=211))
				 ROI=4.40;
		
					break;
			default:System.out.println("Please enter valid choice..");
			}
			System.out.println("-----------------------------------------------------------------------");
		
			if(s.getBalance()-500>=amt1)
			{
				s.withdraw(amt1);
				fixed_bal=fixed_bal+amt1;
				System.out.println("Now your Balance in saving Account is:"+s.getBalance()+" Rupees..");
				System.out.println("Now Amount in FD:"+fixed_bal);
			}
			
			else
			{
				System.out.println("Insufficient Balance..!!!");
			}
			
			//System.out.println("Saving Account Balance:"+s.acct.getBalance());
		
		System.out.println("********************************************************************************************\n");
		//System.out.println("Now your Balance in Recurring Account is:"+Recurr_bal+" Rupees");	
		
		
		interest=(long) (fixed_bal*(ROI/100));
		System.out.println("Interest:"+interest);
		
		if(interest>10000)
		{
		long inter1=interest-10000;
		inter1=(long)((long)inter1*0.10);
		System.out.println("Your tax is:"+inter1+" Rupees");
		//balance=balance-inter1;
		fixed_bal=fixed_bal-inter1;
		cnt2=1;
		}
			
		fixed_bal=fixed_bal+interest;
		s.deposit((long) fixed_bal);
		
		
		System.out.println("\n***********************************************************************************************");
		System.out.println("\nCongratulations!!"+fixed_bal+" Rupees Transferred succesfully in your saving account..!!!");
		if(cnt2==0)
		System.out.println("\nNow your current balance in Saving account is:"+s.getBalance()+" Rupees only..");
		if(cnt2==1)
		{
		System.out.println("\nNow your current balance in Saving account is:"+s.getBalance()+" Rupees only By Cutting Tax..");	
		System.out.println("\n*************************************************************************************************");
		}
		
		System.out.println("\n\nDo you want to open fixed Account:");
		 str=sc.next();
	}while(str.equals("yes"));
		System.out.println("\nThank You.!!!");
		
	}
	}



