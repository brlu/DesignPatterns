package Decorate_Person;

public class MainUI {

	public static void main(String[] args) {
		Person person = new Person("OWL");
		System.out.println("Combination");
		
		TShirts ts 	= new TShirts();
		BigPants bp = new BigPants();
		Shoes so 	= new Shoes();
		
		ts.Decorate(person);
		bp.Decorate(ts);
		so.Decorate(bp);
		
		so.Show();

	}

}
