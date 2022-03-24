package myexp;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exptest1 {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the x number:");
			int a = s.nextInt();
			System.out.print("Enter the y number:");
			int b = s.nextInt();
			int z = a-b;
			exptest0 obj = new exptest0();
			System.out.println("Sum is:"+z);
			obj.Division(a, b);
			
			
			
			
			s.close();
			
			
			
		}
		catch(InputMismatchException im) {
			System.out.println("please enter the numbers only");
			
			
		}
		catch(ArithmeticException ae){
			System.out.println("dont enter zero ");
		}
		finally
		{
			System.out.println("Thank You");
		}
		System.out.println("Rest of the code executes");
		
	}

}
