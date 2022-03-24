
public class demo4 extends demo3{
	public void sum(int x,int z) {
		System.out.println("Sum is :"+(x+z));
	}
	public static void main(String[] args) {
	demo3 obj,obj1;
	obj = new demo4();
	obj1 = new demo4();
	obj.setX(50);
	obj.setY("Half century");
	obj.setZ(5);
	System.out.println(obj.getX());
	System.out.println(obj.getY());	
	System.out.println(obj.getZ());
	obj1.sum(obj.getX(),obj.getZ());
	}
	

}
