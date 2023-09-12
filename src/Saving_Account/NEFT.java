package Saving_Account;
import Saving_Account.Account;
import Saving_Account.SavingAccount;
import java.time.LocalTime;
import java.util.Scanner;

import CurrentAccount.TestCurrent;
public class NEFT extends SavingAccount {
	String benficiary_name;
	String IFSC_code;
	int account_no;
	int transfer_amount;
	String reason;
	void printNEFT() {
		//Account acct=new Account();
		//SavingAccount s=new SavingAccount();
		NEFT n=new NEFT();
		
		Scanner sc=new Scanner(System.in);//decalre Scanner class
		//System.out.println("\n\t\t***************************************************************");
			System.out.println("\n\t\t\t=========****** WELCOME TO FUND TRANSFER BY NEFT ******=========\n");
			//System.out.println("\n\t\t***************************************************************");
		   LocalTime now = LocalTime.now();
			LocalTime current_timeNEFT = LocalTime.parse( "07:00" );
			LocalTime current_time1NEFT = LocalTime.parse( "19:00" );

			Boolean LateNEFT = now.isAfter( current_timeNEFT );
			Boolean beforeNEFT = now.isBefore(current_time1NEFT );
			if( LateNEFT== true && beforeNEFT==true) {
				 
			    System.out.println("\n\t\tNow Balance in Saving account is:"+s.getBalance());
			    //System.out.println();
		System.out.println("\nenter your benficiary_name");
		  benficiary_name=sc.next();
		   
		   System.out.println("\nenter your benficiary IFSC_code");
		  IFSC_code=sc.next();
		   
		   System.out.println("\nenter your benficiary account_NO");
		  account_no=sc.nextInt();
	
		   System.out.println("\nenter your transfer_amount");
		    transfer_amount=sc.nextInt();
		   
		    	/* try {
					SavingAccount.;
				} catch (Account e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}*/
		   
		    if(transfer_amount>=1 && transfer_amount<=2500000) {
		    //	e.withdraw(transfer_amount);
				  //System.out.println("\n\t\t Yess!!You can Transfer..");
				//  System.out.println("\nNow Balance in Saving account is:"+e.getBalance()); 
		    } 
		    			   
		    	   int amt=0;
					int tax; 
					int total_tax;
					int charges;
					int final_amount = 0;
					/*System.out.println("\n\t\tPlease confirm your amount:");
					amt=sc.nextInt();*/
					amt=transfer_amount;
					total_tax=2;
					//System.out.println("\n\t\ttotal tax is: "+total_tax+" Rupees");
				try {
					
					if(amt>=1 && amt<=10000)
					{
						charges=2+total_tax;
						final_amount=transfer_amount+charges;
						System.out.println("\n\t\ttotal charges is: "+charges+" Rupees");
						//System.out.println("\n\t\tfinal amount is: "+final_amount+" Rupees");
						
						throw new IllegalArgumentException("argument must be positive");
					}
					else if(amt>=10000 && amt<=100000){
						charges=5+total_tax;
						final_amount=transfer_amount+charges;
						System.out.println("\n\t\ttotal charges is: "+charges+" Rupees");
						//System.out.println("\n\t\tfinal amount is: "+final_amount+" Rupees");

					}
					else if(amt>=100000 && amt<=200000)
					{
							charges=15+total_tax;
							final_amount=transfer_amount+charges;
							System.out.println("\n\t\ttotal charges is: "+charges+" Rupees");
							//System.out.println("\n\t\tfinal amount is: "+final_amount+" Rupees");
							

					}
					else if(amt>=200000 && amt<=2500000) 
					{
							charges=25+total_tax;
							final_amount=transfer_amount+charges;
							System.out.println("\n\t\ttotal charges is: "+charges+" Rupees");
							//System.out.println("\n\t\tfinal amount is: "+final_amount+" Rupees");
							//System.out.println("");
					}	
					
					else {
				   System.out.println("\n\t\tSorry!!you cannot transfer");
					}
					//SavingAccount s=new SavingAccount();
					//s.getBalance();
					s.withdraw(final_amount);
					System.out.println("\n\t\tYou transferred "+transfer_amount+" Successfully..!!!");
					
					System.out.println("\n\t\tNow Saving account balance is after withdraw:"+s.getBalance());
				}
					catch(IllegalArgumentException e1){
						e1.printStackTrace();
					}
				catch(Exception e1) {
					System.out.println("exception is" +e1);
				}
	}//time

	  else {
        	 
			System.out.println("\n\t\tNEFT can only transfer between 7AM To 7PM");
			}
	
		}//method
}//class

