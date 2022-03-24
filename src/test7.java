
public class test7 extends test6 {
	public test7() {
		super(6);
		System.out.println("Basha");
	}
	public test7(int b) {
		this();
		System.out.println("3rd Dec "+super.x);
		super.bye();
	}
	public static void main(String[] args) {
		test7 obj = new test7(3);
		
		
	}

}
