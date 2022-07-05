package framework;


public class CurrentAcc extends BankAcc
{
	public float creditLimit;


	public CurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit = creditLimit;
	}
	
	public void withdraw(float accBal)
	{
		
	}


	@Override
	public String toString() {
		return "CurrentAcc [creditLmit=" + creditLimit + ", accNo=" + accNo + ", accName=" + accName
				+ ", accBal=" + accBal + "]";
	}
}

