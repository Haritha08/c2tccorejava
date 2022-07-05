package com.tnsif.applicationpart;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime) {
		PrimeAcc gsprime=new PrimeAcc(accNo,accName,charges,isPrime);
		return gsprime;
	}

	@Override
	public NormalAcc getNormalAccount(int accNo, String accName, float charges, float deliveryCharges) 
	{
		
		NormalAcc gsnormal=new NormalAcc(accNo,accName,charges,deliveryCharges);
		return gsnormal;
	}

	

}
