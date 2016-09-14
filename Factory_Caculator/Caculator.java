package Factory_Caculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			System.out.println("A:");
			BufferedReader brA = new BufferedReader(new InputStreamReader(System.in));
			String strNumA = brA.readLine();
			double NumberA = Double.parseDouble(strNumA);
			
			System.out.println("Oper:");
			BufferedReader brOper = new BufferedReader(new InputStreamReader(System.in));
			String strOper = brOper.readLine();

			System.out.println("B:");
			BufferedReader brB = new BufferedReader(new InputStreamReader(System.in));
			String strNumB = brB.readLine();
			double NumberB = Double.parseDouble(strNumB);
			
			Operation oper = OperationFactory.createOperation(strOper);	
			oper.set_numberA(NumberA);
			oper.set_numberB(NumberB);
			System.out.println(oper.GetResult());

			
		}catch(IOException ex)
		{
			System.out.println(ex.toString());
		}

	}

}
