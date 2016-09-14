package Proxy_Gift;

public class Tets {

	public static void main(String[] args) {
		PrettyGirl PG = new PrettyGirl();
		PG.setName("Olivia");
		
		ProxyMan proxy = new ProxyMan(PG);
		proxy.GiveDolls();
		proxy.GiveFlowers();
		proxy.GiveChocolate();

	}

}
