package Proxy_Gift;

public class ProxyMan implements IGift{
	
	Pursuit pursuit;
	
	public ProxyMan(PrettyGirl PG){
		this.pursuit = new Pursuit(PG);
	}
	
	public void GiveDolls(){
		pursuit.GiveDolls();
	}
	
	public void GiveFlowers(){
		pursuit.GiveFlowers();		
	}
	
	public void GiveChocolate(){
		pursuit.GiveChocolate();
	}

}
