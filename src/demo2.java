
public class demo2 extends demo1{
	public void sum(int x,int y) {
		System.out.println("Substraction is:"+(x-y));
		super.sum("runtime ", "polymorphism");
		
	}
	public static void main(String[] args) {
		demo1 obj,obj1;
		obj = new demo2();
		obj1 = new demo1();
		obj.sum(3, 2);
		obj1.sum(5, 5);
		
	}

}
