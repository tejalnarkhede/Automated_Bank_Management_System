package Saving_Account;
import java.time.LocalTime;
import java.util.Scanner;
public class RTGS extends SavingAccount{
void printRTGS() {
	Scanner sc=new Scanner(System.in);
	System.out.println("\n\t\t\t=========****** WELCOME TO FUND TRANSFER BY NEFT ******=========\n");
	 LocalTime just= LocalTime.now();
		LocalTime current_timeRTGS = LocalTime.parse( "09:30" );
		LocalTime current_time1RTGS = LocalTime.parse( "16:00" );

		Boolean LateRTGS = just.isAfter( current_timeRTGS );
		Boolean beforeRTGS = just.isBefore( current_time1RTGS );
		if(LateRTGS== true &&  beforeRTGS==true) {
			System.out.println("\n\t\t Your balance in saving account is:"+s.getBalance());
			 System.out.println("\nenter your benficiary_name");
			   String benficiary_name=sc.next();
			   
			   System.out.println("\nenter your benficiary IFSC_code");
			   String IFSC_code=sc.next();
			   
			   System.out.println("\nenter your benficiary account_NO");
			   int account_no=sc.nextInt();
			   
			   
			   System.out.println("\nenter your transfer_amount");
			   int transfer_amount=sc.nextInt();
			   try {
			   if(transfer_amount>=200000 && transfer_amount<=1000000) 
			   {
				   System.out.println("\n\t\t You Transferred "+transfer_amount+" Rupees Successfully..!!!");
				   int amt;
					int tax=2;
					int total_tax=2;
					int charges;
					int final_amount = 0;
					//System.out.println("Please confirm your amount");
					//amt=sc.nextInt();
					//total_tax=amt*tax/100;
					//System.out.println("total tax is: "+total_tax+" Rupees");
					
					if(transfer_amount>=200000 && transfer_amount<=500000)
					{
						charges=30+total_tax;
						final_amount=transfer_amount+charges;
						System.out.println("total charges is: "+charges);
						//System.out.println("final amount is: "+final_amount);
					}
					else if(transfer_amount>=500000 && transfer_amount<=100000){
						charges=55+total_tax;
						final_amount=transfer_amount+charges;
						System.out.println("total charges is: "+charges);
						//System.out.println("final amount is: "+final_amount);

					}
			      else {
				   System.out.println("sorry!!you cannot transfer");
			   } 
					s.withdraw(final_amount);
					System.out.println("\n\t\tYou transferred "+transfer_amount+" Successfully..!!!");
					System.out.println("\n\t\tSaving account balance after withdraw:"+s.getBalance());
	}
			 }catch(Exception e) {
				   System.out.println(e);
			   }	  
		}//time
		
		else {
			System.out.println("RTGS can only transfer between 9:30AM To 4PM");
		}
	  

}//method
}//class
