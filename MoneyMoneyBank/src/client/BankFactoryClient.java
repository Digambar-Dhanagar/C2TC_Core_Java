package client;

import application.MMBankFactory;
import application.MMCurrentAcc;
import application.MMSavingAcc;

public class BankFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MMBankFactory obj=new MMBankFactory();
		MMSavingAcc bharath=(MMSavingAcc) obj.getNewSavingAcc(345566, "Digambar", 10000f, true);
		bharath.withdraw(5000);
		MMCurrentAcc bharath1=(MMCurrentAcc) obj.getNewCurrentAcc(365244, "Digambar", 32324f, 50000f);
		bharath1.withdraw(9000);

	}

}
