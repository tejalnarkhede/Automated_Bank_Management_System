package CurrentAccount;
import java.util.Scanner;
public class FundTransfer_current {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\t***************************************************************");
		System.out.println("\n\t\t\t\t\t WELCOME TO FUND TRANSFER");
		System.out.println("\n\t\t***************************************************************");
		System.out.println("\n\n\t\t::::::::::::::::::::::: Login :::::::::::::::::::::::::::::::");
			   System.out.println("\nenter your user_ID:");
			   String user_ID=sc.next();
		   
			  System.out.println("\nenter your password:");
			  String password=sc.next();
			  if(user_ID.equals("1234")&&(password.equals("admin"))){
				  System.out.println("\n\t\tYou Login Successfully..!!");
				  int ch;
				  do {
					  System.out.println("\n\t\t ********************************MENU ********************************");
					System.out.println("\n\t\t\t\t\t1-NEFT \n\t\t\t\t\t2-RTGS \n\t\t\t\t\t3-IMPS");
					System.out.println("\n\t\t\t\t\tenter your choice");
					ch=sc.nextInt();
					switch(ch) {
					case 1:
						NEFT_current n=new NEFT_current();
						n.printNEFT();
						break;
					case 2:
						RTGS_current r=new RTGS_current();
						r.printRTGS();
						break;
					case 3:
						IMPS_current i=new IMPS_current();
						i.printIMPS();
						break;
					default:System.out.println("\n\t\tinvalid range...");
					}
					System.out.println("\n\t\tdo you want to continue to press 1");
					ch=sc.nextInt();
				  }while(ch==1);
			  }else {
				 System.out.println("\n\t\tinvalid username or password!!"); 
			  }
	}

}
