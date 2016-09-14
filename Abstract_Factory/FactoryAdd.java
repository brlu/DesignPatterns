package Abstract_Factory;

public class FactoryAdd implements IFactory{
	
	public Operation createOperation(){
		return new OperationAdd();
	}

}
