import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialtest1 {
	public void serial() throws Exception{
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student st = new Student();
		st.setStid(100);
		st.setStname("muzamil");
		oos.writeObject(st);
		System.out.println("serialization process done");
		oos.close();
		
	}
	public void deserial() throws Exception{
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stu = (Student)ois.readObject();
		System.out.println("student id is:"+stu.getStid());
		System.out.println("student name is:"+stu.getStname());
		ois.close();
		
	}
	public static void main(String[] args) {
		Serialtest1 obj = new Serialtest1();
		Serialtest1 obj1 = new Serialtest1();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Choose option 1 or 2:");
		int a = s.nextInt();
		switch(a) {
		case 1:
			try {
			obj.serial();
			
			
		}
			catch(Exception e) {
			System.out.println("serialization undone");
		}
			break;
		case 2:
			try {
				obj1.deserial();
			}
			catch(Exception e) {
				System.out.println("Deserialization undone");
				
			}
			break;
		default:
			System.out.println("Choose only between 1 and 2");
		
		}
		s.close();
		
		
		
	}
	

}
