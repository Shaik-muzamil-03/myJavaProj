





public class test4 {
	int x,y;
	
	public test4(int x, int y)
	{
		    this.x = 100;
	        this.y = 200;
	}
	public void addition()
	{
		int z = this.x+this.y;
		System.out.println("sum is:"+z);
		
	}
	public void display()
	{
		System.out.println("x value is:"+this.x);
		System.out.println("y value is:"+this.y);
		
	}
	public static void main(String[] args)
	{
		test4 obj = new test4(100,200);
		obj.display();
		obj.addition();
	}

}
