package Proxy_Gift;

public class Pursuit implements IGift{
	
	PrettyGirl PG;
	
	public Pursuit(PrettyGirl PG){
		this.PG = PG;
	}
	
	public void GiveDolls(){
		System.out.println(PG.getName()+" Dolls");
	}
	
	public void GiveFlowers(){
		System.out.println(PG.getName()+" Flowers");
	}
	
	public void GiveChocolate(){
		System.out.println(PG.getName()+" Chocolate");
	}

}
