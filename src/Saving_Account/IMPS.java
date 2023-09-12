package Saving_Account;
import java.util.Scanner;
public class IMPS extends SavingAccount{
void printIMPS() {
	System.out.println("*******************************************");
	   System.out.println(" transfer to bank IMPS");
	   System.out.println("*******************************************");
	   Scanner sc=new Scanner(System.in);
	   System.out.println("");
	   System.out.println("\nenter your benficiary_name");
	   String benficiary_name=sc.next();
	   
	   System.out.println("\nenter your benficiary IFSC_code");
	   String IFSC_code=sc.next();
	   
	   System.out.println("\nenter our benficiary account_NO");
	   int account_no=sc.nextInt();
	   
	   System.out.println("\nenter your transfer_amount");
	   int transfer_amount=sc.nextInt();
	   try {
	   if(transfer_amount>=1 && transfer_amount<=200000) {	
		   s.withdraw(transfer_amount);
		   System.out.println("\n\t\t You Transferred "+transfer_amount+" Rupees Successfully..!!!");
		   System.out.println("\n\t\tSaving account balance after withdraw:"+s.getBalance());
	   }
	   else {
		   System.out.println("\n\t\tsorry!!you can't transfer");
	   }
	   if(transfer_amount<0)
	   {
				throw new IllegalArgumentException("argument must be positive");
	   }
	   }catch(IllegalArgumentException e) {
		   System.out.println(e);
		   e.printStackTrace();
	   }
	   
	
}
}
