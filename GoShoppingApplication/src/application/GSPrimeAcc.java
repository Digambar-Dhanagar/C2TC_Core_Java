package application;

import com.ait.framework.PrimeAcc;

public class GSPrimeAcc {
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime User, Your Product Charges are: "+getCharges());
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + "]";
	}

}
