package CurrentAccount;
import java.util.Scanner;

public class TestCurrent extends Current_Account
{
	static TestCurrent t=new TestCurrent();
	public static void main(String[] args) 
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		//Current_Acc ca= new Current_Acc();
		long account_number,amount;
		
		//Account a=new Account();
		String str;
			System.out.println("\n\t\t\t=========****** WELCOME TO CURRENT ACCOUNT ******=========\n");
		//System.out.println("\n\t\t\t\tPlease Create your account\n");
		t.create_account();
		
			do
			{
			System.out.println("\n\t\t\t================= CURRENT ACCOUNT MENU ================\n");
			
			System.out.println("\n\t\t\t\t\t1.Deposit amount \n\t\t\t\t\t2.Withdraw amount \n\t\t\t\t\t3.Display");
			System.out.println("\n\t\t\t-------------------------------------------------------\n");
			
			System.out.print("\n\t\t\t\tPlease Choose One Opration(press the number):-");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("\n\n\t\t\t----------------You are in Deposit Section----------------\n");
				//System.out.println("\t\t\t\t"+n);
				System.out.print("\n\t\t\t\tPlease Enter Your Account Number:-");
				account_number = sc.nextLong();
				
			
				try
				{
					if(n!=account_number)
					{
						throw new NumberFormatException("\nPlease Enter Correct Account Number");
					}
				}
				catch (NumberFormatException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
					if(n==account_number)
					{
						System.out.print("\n\t\t\t\tPlease Enter The Amount You Want To Deposit:-");
						 amount = sc.nextInt();
						try
						{
							if(amount<=0)
							{
								throw new IllegalArgumentException("Amount must be greater than 0");
							}
							
						}
						catch(IllegalArgumentException e)
						{
							e.printStackTrace();
								 //int cnt = 1;
						}
						t.deposit(amount);
					}
						break;
								
			case 2:
				System.out.println("\n\n\t\t\t----------------You are in Withdraw Section----------------\n");
				System.out.println(n);
				System.out.print("\n\t\t\t\tPlease Enter Your Account Number:-");
				account_number=sc.nextLong();
				try
				{
					if(n!=account_number)
					{
						throw new NumberFormatException("Please Enter Correct Account Number");
					}
				}
				catch (NumberFormatException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if(n==account_number)
				{
					System.out.print("\n\t\t\t\tPlease Enter The Amount You Want To Withdraw:-");
					amount=sc.nextInt();
					try
					{
						if(amount>t.getBalance())
						{
							throw new IllegalArgumentException("Transaction not Possibal amount is greater than balance");
						}
					}
					catch (IllegalArgumentException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				t.withdraw(amount);
				}
				break;
			case 3:
				t.display_account();
				break;
				
				
			default:
				System.out.println("\n\t\t\t\tInvalid Option!!Please Enter Correct Option..");
				
			}
			System.out.println("\t\t\t-------------------------------------------------------\n");
			System.out.print("\n\t\t\t\tDo You Want to do Opration Again!!:-");
			str=sc.next();
		}while(str.equals("yes"));
		System.out.println("\t\t\t\tThank You Visit Again!!");
	
	}

}
