package Factory_Caculator;

public class OperationFactory {
	
	public static Operation createOperation(String operator){
		Operation oper = null;
		if ("+".equals(operator))
			oper = new OperationAdd();
		else if("-".equals(operator)) 
			oper = new OperationSub();
		else if ("*".equals(operator))
			oper = new OperationMul();
		else if ("/".equals(operator))
			oper = new OperationDiv();
		
		return oper;
	}

}
