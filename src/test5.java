
public class test5 {
	int x,y;
	
	public test5()
	{
		this(100,200);
		x = 100;
		y = 200;
		System.out.println("x value is:"+x);
		System.out.println("y value is:"+y);
		
		
	}
	
	public test5(int x, int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("sum is:"+(this.x+this.y));
		    
	}


	public static void main(String[] args)
	{
		test5 obj = new test5();
		
	}

}
