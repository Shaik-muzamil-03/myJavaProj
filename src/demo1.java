public class demo1 {
	public void sum(int x,int y) {
		System.out.println("sum is:"+(x+y));
		}
	public void sum( String x, String y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		demo1 obj = new demo1();
		obj.sum("method ","overloading");
		obj.sum(6,10);
		
	}

}
