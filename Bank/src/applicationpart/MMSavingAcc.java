package applicationpart;

import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	public final float MINBAL = 0;

	public MMSavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal, isSalaried);
	}

	public void withdraw(float accBal) {
		System.out.println("Dear Savings Account user your withdraw Balance is " + accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accBal=" + accBal + ", isSalary=" + isSalaried + ", accNo=" + accNo + ", accName=" + accName
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}


