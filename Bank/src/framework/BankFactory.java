package framework;


public interface BankFactory {
	public abstract SavingAcc getNewSavingAccount(int accNo,String accName,float accBal,boolean isSalary);
	CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit);

}
