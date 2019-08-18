import java.util.Scanner;
 class Account
{
	long Accno;           
	String Type;            
	String Ownername;       
	String Branch;           
	double Balance;         
	static String Bankname  = "ICICI";
	double amount=0;

	Scanner sc =new Scanner(System.in);

	public void openAccount()
	{
		System.out.println(" Enter Account no : ");
		Accno = sc.nextLong();
		System.out.println("Enter Type of Account : ");
		Type = sc.next();
		System.out.println("Enter Ownername : ");
		Ownername = sc.next();
		System.out.println(" Enter Branch Name :" );
		Branch = sc.next();
		System.out.println("Enter Balance : ");
		Balance = sc.nextDouble();
	}	

	public void Accountdetails()
	{
		System.out.println("Account No = "+ Accno );
		System.out.println("Type = " + Type);
		System.out.println("Owner Name = "+ Ownername);
		System.out.println("Branch Name = "+ Bankname);
	}

	public void deposit()
	{
		System.out.println("Enter the amount you want to deposit : ");
		this.amount = sc.nextDouble();
		this.Balance = Balance + amount;
	}

	public static void showbankname()
	{
		System.out.println("Bank Name = "+Bankname );
	}

	public void withdraw()
	{
		System.out.println("Enter the amount you want to withdraw : ");
		this.amount = sc.nextDouble();
		if (this.Balance>=amount)
		{
		this.Balance = Balance - amount;
	    }
	    else
	    {
		System.out.println("Less Balance....Transaction Failed ");
	    }
	}

	public void Balance()
	{
		System.out.println("Balance in account is : "+Balance);
	}	
	
}

public class BankApplicationTest
{
	public static void main(String[] args)
	 {
		System.out.println("Program Starts...");

		Account ref  = new Account();
		

		// System.out.println("ref = "+ ref);
		

		ref.Balance();
		ref.deposit();
		ref.Balance();
		ref.withdraw();
		ref.Balance();
		ref.showbankname();
		
		

		System.out.println("Program Ends ...");
	 }
}





