package package2;
import package1.packtest1;
import package1.sub.*;

public class packtest2 extends packtest1 {
	public static void main(String[] args) {
		
	packtest1 obj = new packtest1();
	obj.sum(10,20);
	
	subpacktest1 obj1 = new subpacktest1();
	obj1.sub(20,10);
	
	packtest2 obj2 = new packtest2();
	System.out.println("protected property value is:"+obj2.c);
	
	
	
}
	

}
