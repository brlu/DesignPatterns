package Strategy_Cash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cashier {

	public static void main(String[] args) {
		try{
			CashContext cc = null;
			System.out.println("1: normal");
			System.out.println("2: rebate $100 for every $500");
			System.out.println("3: 20% off");
			System.out.println("Please Select:");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int selection = Integer.parseInt(br.readLine());
			switch(selection){
			case 1:
				cc = new CashContext(new CashNormal());
				break;
			case 2:
				cc = new CashContext(new CashReturn("500","100"));
				break;
			case 3:
				cc = new CashContext(new CashRebate("0.8"));
				break;				
			}
			
			System.out.println("Total Amount?");
			BufferedReader br2 = new BufferedReader (new InputStreamReader(System.in));
			double total = Double.parseDouble(br2.readLine());
			
			double totalPrice = cc.GetResult(total);
			System.out.println("Total Price: "+totalPrice);
			
			
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		

	}

}
