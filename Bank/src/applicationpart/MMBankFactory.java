package applicationpart;

import framework.CurrentAcc;
import framework.SavingAcc;
import framework.BankFactory;

public class MMBankFactory implements BankFactory
{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accName, float accBal, boolean isSalaried) {
		SavingAcc MMSaving=new SavingAcc(accNo,accName,accBal,isSalaried);
		return MMSaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accName, float accBal, float creditLimit) {	
		CurrentAcc MMCurrent=new CurrentAcc(accNo,accName,accBal,creditLimit);
		return MMCurrent;
	}

}
