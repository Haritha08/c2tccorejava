package applicationpart;

import framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{
	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
	}
	public void withdraw(float accBal)
	{
		System.out.println("Dear Current user your Account Balance is " +accBal+ " with credit limit " +creditLimit);
		
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accName=" + accName + ", accBal="
				+ accBal + "]";
	}
	
}



