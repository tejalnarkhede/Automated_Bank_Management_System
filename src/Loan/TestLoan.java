package Loan;
import java.util.Random;
import java.util.Scanner;

//import Saving_Account.Account;

public class TestLoan {
		
		private static long generate_accno() {
			int n=11111111;
			Random r= new Random();
			n=r.nextInt(99999999);
			return n;
		}
		public static void main(String[] args)
		{
			
			try {
				accept();
			} catch (Loan e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void accept() throws Loan	
		{ 
			Scanner sc=new Scanner(System.in);
		//	Loan l=new Loan();
			String str;
			int cnt1=0;
			System.out.println("\n\t\t\t=========****** WELCOME TO LOAN ACCOUNT ******=========\n");
			long n=generate_accno();
			System.out.println("\n\n\t\t\t\t*********************************************************************");
			System.out.println("\n\t\t\t\tYour Account Number For Loan Account is:"+n);
			System.out.println("\n\t\t\t\t************************************************************************");
		//	do
		//	{
			System.out.println("\n\n*************************************************************************************");
			System.out.println("\t\t\t\tLOAN MENU");
			System.out.println("*************************************************************************************");
			// System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n\t\t\t\t1-Gold loan \n\t\t\t\t2-Home loan \n\t\t\t\t3-Education loan");
				//System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
			
				System.out.println("*************************************************************************************");
				System.out.println("\t\t\t\tWhich loan do u want :");
				cnt1=1;
				int ch=sc.nextInt();
				
				System.out.println("\n\t\tEnter Your Loan account number:");
				long accno=sc.nextLong(); 
				try
				{
				if(n!=accno)
				{
					throw new Loan();
				}
				}
				catch(Loan e) {
					e.printStackTrace();
					System.out.println("Transaction Failed..!!!");
				}
				
					
					if(n==accno)
					{
						int cnt=0,grams,purity,ROI,tenure;
					switch(ch)
					{
					case 1:
						System.out.println("\n\n--------------------------- WELCOME TO GOLD LOAN -----------------------------");
						GoldLoan a=new GoldLoan();
						System.out.println("\n\n---------------------****** Enter your details ******-------------------------");
						/*System.out.println("Enter your Account number ");
						a.setAcco_no(sc.nextLong());*/
						System.out.println("Enter your Apartment Name/Landmark:");					
						a.setLandmark(sc.next());
						System.out.println("Enter Your company name");
						a.setComp_name(sc.next());
						System.out.println("Enter your Co_Applicant account number ");
						a.setCo_applicant_accno(sc.nextLong());
						System.out.println("Enter your co_Applicant name");
						a.setCo_applicant_name(sc.next());
						System.out.println("\n\t\t\t\t\t--------****** Enter GOLD Loan details ******-----------");
						do
						{
						cnt=0;
						System.out.println("\nEnter Gold in grams do u want to put for mortgage: ");
						 grams=sc.nextInt();
						if(grams<=50)
						{
							a.setGrams(grams);
						}
						else
						{
							System.out.println("\n\t\tYou cannot put more than 50 grams gold for mortgage...!!! ");
							cnt=1;
						}
						}while(cnt==1);
						do
						{
						cnt=0;
						System.out.println("\nEnter the purity of gold:");
						 purity=sc.nextInt();
						if((purity==18)||(purity==22)||(purity==24))
						a.setPurity(purity);
						else
						{
							System.out.println("\n\t\tPlease enter the valid Purity...");
							cnt=1;
						}
						}while(cnt==1);
						do
						{
						cnt=0;
						System.out.println("\nEnter the Rate of interest:");
						 ROI=sc.nextInt();
						if((ROI>=11)&&(ROI<=19))
						a.setRate_intrest(ROI);
						else
						{
							System.out.println("\n\t\tRate if interest is minimum 11% and maximum 19%");
							cnt=1;
						}
						}while(cnt==1);
						do
						{
							cnt=0;
						System.out.println("\nEnter the Tenure in months:");
						tenure=sc.nextInt();
						if((tenure>=3)&&(tenure<=12))
						a.setTenure(tenure);
						else
						{
							System.out.println("\n\t\tTenure should be minimum for 3 months and maximum for 12 months...");
							cnt=1;
						}
						}while(cnt==1);
						System.out.println("-------------------------------------------------------------------------------------------------------------------");

						
						if((grams>=15)&&(grams<=19))
							a.setBalance(41425);
						if((grams>=20)&&(grams<=25))
							a.setBalance(55900);	
						if((grams>=26)&&(grams<=30))
							a.setBalance(68710);
						if((grams>=31)&&(grams<=40))
							a.setBalance(77100);
						if((grams>=41)&&(grams<=50))
							a.setBalance(85410);
						System.out.println("\n\t\tCongratulations!! Your "+a.getBalance()+" Rupees loan is sanctioned..!!!");
							
						break;
						
					case 2:
						System.out.println("\n\n--------------------------- WELCOME TO HOME LOAN -----------------------------");
						HomeLoan h=new HomeLoan();
						System.out.println("\n\n---------------------****** Enter your details ******-------------------------");
						//System.out.println("\n\t\t\t\t\t--------****** Enter your details ******-----------");
						System.out.println("Enter Your age:");
						int age=sc.nextInt();
						if((age>=24)&&(age<=65))
						{
						h.setAge(age);
						System.out.println("Enter your Apartment Name/Landmark:");
						h.setLandmark(sc.next());
						System.out.println("Enter Your company name");
						h.setComp_name(sc.next());
						System.out.println("Enter your CO_Applicant account number ");
						h.setCo_applicant_accno(sc.nextLong());
						System.out.println("Enter your co_Applicant name");
						h.setCo_applicant_name(sc.next());
						System.out.println("Enter Your Resident Type:");
						String resident=sc.next();
						if(resident.equals("indian"))
						{
							h.setResident_type(resident);
						System.out.println("\n\t\t\t\t\t--------****** Enter HOME Loan details ******-----------");
						System.out.println("Enter the Loan amount: ");
						long loan_amount=sc.nextLong();
						if((loan_amount>=100000)&&(loan_amount<=350000000))
						{
						h.setLoan_amount(loan_amount);
						}
						else
						{
							System.out.println("Eligible minimum loan amount should 100000 and maximum 200000000 ");
							break;
						}
						System.out.println("Enter the City of your Property:");
						h.setProper_city(sc.next());
						System.out.println("Enter the location of your Property");
						h.setProper_Loc(sc.next());
						System.out.println("Enter the Landmark of your Property:");
						h.setLandmark(sc.next());
						System.out.println("Enter the Plot Area Of Your Property:");
						h.setPlot_Area(sc.next());
						System.out.println("Enter the Carpet area of your Property:");
						h.setCarpet_Area(sc.next());
						System.out.println("Enter the age of your Property:");
						h.setProper_age(sc.nextInt());
						System.out.println("-------------------------------------------------------------------------------------------------------------------");
						System.out.println("\n\t\tCongratulations!! Your loan is sanctioned..!!!");
						}
						}
						else
							System.out.println("You can't do home loan transactions....");
						break;
					
					case 3:
					System.out.println("\n\n--------------------------- WELCOME TO EDUCATION LOAN -----------------------------");
					EducationLoan e=new EducationLoan();
					//System.out.println("\n\t\t\t\t\t--------****** Enter your details ******-----------");
					System.out.println("\n\n----------------------****** Enter your details ******------------------------------");
					System.out.println("Enter Your age:");
					int age1=sc.nextInt();
					if((age1>=16)&&(age1<=35))
					{
						e.setAge(age1);
						
					System.out.println("Enter your Apartment Name/Landmark:");
					e.setLandmark(sc.next());
					System.out.println("Enter Your company name");
					e.setComp_name(sc.next());
					System.out.println("Enter your CO_Applicant account number ");
					e.setCo_applicant_accno(sc.nextLong());
					System.out.println("Enter your co_Applicant name");
					e.setCo_applicant_name(sc.next());
					System.out.println("\n\t\t\t\t\t--------****** Enter EDUCATION Loan details ******-----------");
					do
					{
						cnt=0;
					System.out.println("Enter the Course Period in years:");
					int course_period=sc.nextInt();
					if(course_period<=10)
					e.setCourse_period(course_period);
					else
					{
						System.out.println("\nplease enter valid course period...  ");
						cnt=1;
					}
					}while(cnt==1);
					System.out.println("Enter Loan amount:");
					e.setLoan_amount(sc.nextLong());
					System.out.println("Enter the Tenure:");
					e.setTenure(sc.next());
					System.out.println("Enter the course type:");
					e.setTream(sc.next());
					System.out.println("Enter the marks of your Previous test:");
					e.setMerit(sc.nextInt());
					System.out.println("-------------------------------------------------------------------------------------------------------------------");
					System.out.println("\n\t\tCongratulations!! Your loan is sanctioned..!!!");
					}
					else
						System.out.println("You can't do EDUCATION loan transactions...");
					break;
					}
					}
					//System.out.println("\n\nDo u want to continue YES/NO ?:");
					//str=sc.next();
				//}while(str.equals("yes"));
				//return l;

		}

}


