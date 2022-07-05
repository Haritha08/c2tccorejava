package main;

import applicationpart.MMCurrentAcc;
import applicationpart.MMSavingAcc;
import applicationpart.MMBankFactory;

public class client {

	public static void main(String[] args)
	{
		//step a
				MMBankFactory mmbankfactory =new MMBankFactory();
				mmbankfactory.getNewSavingAccount(101, "xyz", 10000, true);
				mmbankfactory.getNewCurrentAccount(102, "abc", 879837, 50);
				
				//step b
				MMSavingAcc mmSaving=new MMSavingAcc(101, "xyz", 10000, true);
				
				
				//step c
				MMCurrentAcc mmCurrent=new MMCurrentAcc(102, "abc", 879837, 50);
				
				//step d
				mmSaving.withdraw(10000);
				mmCurrent.withdraw(879837);
				//step e
				mmSaving.toString();
				mmCurrent.toString();

	}

}
