package framework;

public class BankAcc {
	public int accNo;
	public String accName;
	public float accBal;

	public BankAcc(int accNo, String accName, float accBal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}

	public void withdraw() {

	}

	public void deposit() {

	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}

}
