
public class test1 {
	int x = 100;
	int y = 200;
	void sum() {
		System.out.println("sum is:"+(x+y));
	}
	public static void main (String[] args) {
		test1 obj = new test1();
		System.out.println("x value:"+obj.x);
		System.out.println("y value:"+obj.y);
		obj.sum();
			
		
	}

}
