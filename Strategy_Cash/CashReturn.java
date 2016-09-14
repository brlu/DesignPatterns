package Strategy_Cash;

public class CashReturn extends CashSuper{
	
	private double condition = 0.0d;
	private double moneyReturn = 0.0d;
	
	public CashReturn(String condition, String moneyReturn){
		this.condition = Double.parseDouble(condition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}
	
	public double acceptCash(double money){
		double result = money;
		if (money >=condition)
			result = money - Math.floor(money/condition)*moneyReturn;
		return result;
	}

}
