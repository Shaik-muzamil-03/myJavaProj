package package1;

public class packtest1 {
	private int a = 100;
	protected int c = 300;
	int b = 200;
	public int d = 400;
	public void sum(int x,int y) {
		System.out.println("Sum is:"+(x+y));
	}
	public static void main(String[] args) {
		packtest1 obj = new packtest1();
		obj.sum(10,obj.a);
		obj.sum(10, obj.c);
	}

}
