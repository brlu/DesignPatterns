package Decorate_Person;

public class Person {

	private String name;
	public Person(){		
	}
	
	public Person(String name){
		this.name = name;
	}
	public void Show(){
		System.out.println("Decorted: "+ name);
	}
}
