package muzinterface;

public class demo5 implements inter2 {

	@Override
	public void sum(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("sum is:" +(x+y));

	}

	@Override
	public void sub(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("sub is:" +(x-y));

	}

	@Override
	public void mul(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("mul is:" +(x*y));
		

	}

	@Override
	public void div(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("div is:" +(x/y));
		

	}
	public static void main(String[] args) {
		inter2 obj;
		obj = new demo5();
		obj.sum(1,2);
		obj.mul(2, 3);
		obj.div(4,2);
		obj.sub(4, 3);
	}

}
