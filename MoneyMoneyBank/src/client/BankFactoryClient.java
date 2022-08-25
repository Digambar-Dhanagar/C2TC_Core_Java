package client;

import com.ait.application.MMBankFactory;
import com.ait.application.MMCurrentAcc;
import com.ait.application.MMSavingAcc;

public class BankFactoryClient implements BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		SavingAcc savingAcc=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return savingAcc;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		CurrentAcc currentAcc=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return currentAcc;
	}

}
