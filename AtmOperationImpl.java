package AtmMachineProject;

public class AtmOperationImpl implements AtmOperationInterf 
{

	ATM atm=new ATM();
	
	@Override
	public void veiwBalance() {
		System.out.println("Available BAlance is:"+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) 
	{
		if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance()) 
		{
		System.out.println("Collect the Cash"+withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		veiwBalance();
		}
		else {
		System.out.println("Insufficient Balance!!!!");
		}
		} 
		else {
			System.out.println("Please Enter the Amount in Multiple of 500");
		}
	}

	@Override
	public void depositAmount(double depositAmount)
	{
		System.out.println(depositAmount+"Deposited Successfully!!!!");
		atm.setBalance(atm.getBalance()+depositAmount);
		veiwBalance();		
	}

	

	
	}


