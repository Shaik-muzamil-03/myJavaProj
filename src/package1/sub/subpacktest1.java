package package1.sub;
import package1.packtest1;


public class subpacktest1 {
	public void sub(int x, int y) {
		System.out.println("Sub is:" + (x-y));
	}
	public static void main(String[] args) {
		packtest1 obj = new packtest1();
		System.out.println("Public property value is:"+obj.d);
		
	}

}
