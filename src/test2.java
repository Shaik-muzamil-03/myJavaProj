
public class test2 {
	int x,y;
	
	public test2()
	{
		    x = 100;
	        y = 200;
	}
	public void addition()
	{
		int z = x+y;
		System.out.println("sum is:"+z);
		
	}
	public void display()
	{
		System.out.println("x value is:"+x);
		System.out.println("y value is:"+y);
		
	}
	public static void main(String[] args)
	{
		test2 obj = new test2();
		obj.display();
		obj.addition();
	}

}
