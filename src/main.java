import java.util.Scanner;
import Account_details.AccHolder;
import Account_details.Acc_details;
import CurrentAccount.FundTransfer_current;
import CurrentAccount.TestCurrent;
//import FundTransfer.TestFundTransfer;
import Loan.TestLoan;
import Saving_Account.Account;
import Saving_Account.RecurringDeposit;
import Saving_Account.SavingAccount;
import Saving_Account.TestFundTransfer;

public class main {

	static AccHolder h=new AccHolder();
	static Acc_details acc=new Acc_details();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str;
		int cnt=0,cnt1=0,cnt2=0;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\t***************************************************************");
		System.out.println("\n\t\t\t\t\t WELCOME TO BANK");
		System.out.println("\n\t\t***************************************************************");
		System.out.println("\n\t\t\t\t\t 1.REGISTER");
		System.out.println("\n\t\t\t\t\t 2.CREATE ACCOUNT");
		System.out.println("\n\t\t\t\t\t 3.FUND TRANSFER");
		System.out.println("\n\t\t\t\t\t 4.LOAN TRANSACTIONS");
		System.out.println("\n\t\t\t\t\t 5.SEE YOUR PROFILE");
		System.out.println("\n\t\t\t\t\t 6.EXIT");
		System.out.println("\n\t\t***************************************************************");
		System.out.println("\n\t\t\t\t\t Enter your choice:\t");
		int ch=sc.nextInt();
		switch(ch) 
		{
			case 1:if(cnt==1)
					System.out.println("\n\t\t You Registered already..!!!");
					try
					{
					if(cnt==0)
					{
					accept();
					accept1();
					 cnt=1;
					 System.out.println("\n\t\t Dear "+h.getFull_name()+",You Registered Successfully..!!!");
					}
					}
					catch(AccHolder e)
					{
						cnt2=1;
						e.printStackTrace();
					}
					
					 break;
			
			case 2:if(cnt1==1)
					{
						System.out.println("\n\t\t You created your account...");
						break;
					}
						if(acc.getAcc_type().equals("saving"))
					{
						SavingAccount.Saving();
					}
					else
					{
						TestCurrent.main(args);
					}
					cnt1=1;
					break;
			
			case 3:if((cnt==1)&&(cnt1==1))
					{	
					if(acc.getAcc_type().equals("saving"))
					TestFundTransfer.main(args);
					if(acc.getAcc_type().equals("current"))
						FundTransfer_current.main(args);
					}
					else
						System.out.println("\n\t\tYou have to register and create your Account First!!");
					break;
					
			case 4:
					TestLoan.main(args);
					break;
				
			case 5:if((cnt==1)&&(cnt1==1))
					display();
					else
						System.out.println("\n\t\tYou have to register and create your Account First!!");
					break;
			default:System.out.println("\n\tPlease Enter Correct Option..!!!");
		}
		if(cnt2==0)
		System.out.println("\n\n\tDo you want to continue(yes/no):");
		str=sc.next();
		}while(str.equals("yes"));
		System.out.println("\n\t\tThank You Visit Again..!!!");
		
	}

	public static void accept() throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n\n\n\t\t***************************************************************");
		System.out.println("\n\t\t:::::::::::::::::::::: REGISTRATION :::::::::::::::::::::::::: ");
		System.out.println("\nEnter your Name:");
		h.setFull_name(sc.next());
		System.out.println("\nEnter your city:");
		h.setCity(sc.next());
		System.out.println("\nEnter your District:");
		h.setDist(sc.next());
		System.out.println("\nEnter your Age:");
		h.setAge(sc.nextInt());
		try
		{
			if(h.getAge()<18)
				throw new AccHolder();
		}
		catch(Exception e)
		{
			System.out.println(e);
			throw e;
		}
		
		System.out.println("\nEnter your Mobile_no:");
		h.setMob_no(sc.nextLong());
		System.out.println("\nEnter your gender:");
		h.setGender(sc.next());
		System.out.println("\nEnter Customer Type(individual/society/Senior Citizen/Ex.Army/Handicraft):");
		h.setCustomer_type(sc.next());
		//Acc_details acc=accept1();
		//AccHolder a1=new AccHolder();
		
	}

	public static Acc_details accept1() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\t:::::::::::::::::::::: ENTER ACCOUNT DETAILS :::::::::::::::::::::::::: ");
			
			System.out.println("\nEnter Account Type(saving/current):");
			acc.setAcc_type(sc.next());
			System.out.println("\nEnter Your Nominee Name:");
			acc.setNominee_name(sc.next());
			System.out.println("\nEnter Your Nominee Age:");
			acc.setNominee_age(sc.nextInt());
			//arr[i]=p1;
			System.out.println("\n\t\t::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			return acc;
			}
	
	public static void display() {
		System.out.println("\n\t\t:::::::::::::::::::::: YOUR CURRENT PROFILE :::::::::::::::::::::::::: ");
		System.out.println("\n Your Full Name:"+h.getFull_name());
		
		System.out.println("\n Your city:"+h.getCity());

		System.out.println("\n Your District:"+h.getDist());
		
		System.out.println("\n Your Age:"+h.getAge());
		
		System.out.println("\n Your Mobile_no:"+h.getMob_no());
		
		System.out.println("\n Your Gender:"+h.getGender());
		
		System.out.println("\n Your Customer Type(individual/society/Senior Citizen/Ex.Army/Handicraft):"+h.getCustomer_type());
	
		System.out.println("\nYour Account Type(saving/current):"+acc.getAcc_type());
		
		System.out.println("\n Your Nominee Name:"+acc.getNominee_name());
		
		System.out.println("\n Your Nominee Age:"+acc.getNominee_age());
		
	}
		
	}



