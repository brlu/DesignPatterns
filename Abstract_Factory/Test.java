package Abstract_Factory;

public class Test {

	public static void main(String[] args) {
		IFactory f = new FactoryAdd();
		Operation op = f.createOperation();
		op.setA(40);
		op.setB(30);
		
		System.out.println(op.getResult());

	}

}
