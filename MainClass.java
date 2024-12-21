package AtmMachineProject;
import java.util.*;

public class MainClass 
{

	public static void main(String[] args) 
	{
		AtmOperationInterf op=new AtmOperationImpl();
		int atmNumber=4321;
		int atmpin=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine!!!!");
		System.out.println("Enter the ATM Number");
		int num=sc.nextInt();
        System.out.print("Enter ATM pin number");
        int pin=sc.nextInt();
        if(atmNumber==num&&atmpin==pin) {
        	while(true) 
        	{
        		System.out.println("1.View Available Balance");
        		System.out.println("2.Withdraw Amount");
        		System.out.println("3.Deposit Amount");
        		System.out.println("4. View Ministatement");
        		System.out.println("5.Exit");
        		System.out.println("Enter your choice");
        		int ch=sc.nextInt();
        		if(ch==1)
        		{
        			op.veiwBalance();
        		}
        		else if(ch==2)
        		{
        			System.out.println("Enter Withdraw Amount");
        			double withdrawAmount=sc.nextDouble();
        			op.withdrawAmount(withdrawAmount);	
        		}
        		else if(ch==3)
        		{
        			System.out.println("Enter Amount Deposit:");
        			double depositAmount=sc.nextDouble();//10000
        			op.depositAmount(depositAmount);
        			
        		}
        		
        		else if(ch==5)
        		{
        			System.out.println("Collect Your ATM Card");
        			System.out.println("Thank You For Using ATM Machine");
        		}
        		else
        		{
        			System.out.println("Please Enter correct choice");
        			System.exit(0);
        		}
        		}
        	}
        		
	
        else {
        	System.out.println("Incorrect ATM pin");
        	System.exit(0);
        
        } 
        sc.close();
	}
}
