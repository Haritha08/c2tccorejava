package framework;

public class SavingAcc extends BankAcc
{
	public boolean isSalaried;
	
	public SavingAcc(int accNo, String accName, float accBal, boolean isSalaried) 
	{
		super(accNo, accName, accBal);
		this.isSalaried=isSalaried;
	}
	
	
	public void withdraw(float accBal)
	{
		
	}
	
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	

}


