package bankinterface;

public class demo6 {
	public static void main(String[] args) {
		bank obj = new gram();
		System.out.println("gram interest is " + obj.rateofinterest());
		bank obj1 = new kvb();
		System.out.println("kvb interest is " + obj1.rateofinterest());
	}

}
