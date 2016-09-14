package Factory_Caculator;

public class OperationMul extends Operation{

	public double GetResult(){
		double result = 0;
		result = this.get_numberA() * this.get_numberB();
		
		return result;
	}
}
