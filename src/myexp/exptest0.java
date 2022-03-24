package myexp;
import java.util.*;
public class exptest0 {
	public void Division(int a,int b)throws ArithmeticException{
		System.out.println("Division is:"+(a/b));
		
		
	}
	public void checkProductWeight(int weight) {
		if(weight>100) {
			System.out.println("valid product");
		}
		else {
			try {
				throw new InvalidProductException();
				
			}
			catch(InvalidProductException ie) {
				System.out.println("product weight must be greater than 100kgs");
				
			}
		}
		
		}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the product weight:");
		int a = s.nextInt();
		exptest0 obj = new exptest0();
		obj.checkProductWeight(a);
		s.close();
	
		
		
	}
		
	}


