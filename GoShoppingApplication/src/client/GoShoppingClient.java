package client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GoShopFactory;

public class GoShoppingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoShopFactory obj=new GoShopFactory();
		//Prime Account creation
		GSPrimeAcc gayatri=(GSPrimeAcc) obj.getNewPrimeAcc(123, "Diggu", 500.0f, true);
		gayatri.bookProduct(gayatri.getCharges());
		
		//Normal Account creation
		
		GSNormalAcc geeta=(GSNormalAcc) obj.getNewNormalAcc(121, "Geeta", 600.0f,30.0f);
		geeta.bookProduct(geeta.getCharges());

	}

}
