import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class Filetest1 {
	public void fileWrite() throws Exception {
		FileWriter fw = new FileWriter("muz.txt");
		fw.write("abc");
		fw.write("xyz");
		fw.write(100);
		System.out.println("FileWrite operation is done");
		fw.close();
	}
	public void bufferWrite() throws Exception{
		FileWriter fw = new FileWriter("muz.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("abc");
		bw.newLine();
		bw.write("xyz");
		bw.newLine();
		bw.write(100);
		bw.close();
		System.out.println("BufferWrite operation is done");
		
		
	}
	public void printWrite() throws Exception{
		PrintWriter pw = new PrintWriter("muz.txt");
		pw.println("abc");
		pw.println("xyz");
		pw.println(100);
		pw.println(true);
		pw.close();
		System.out.println("PrintWrite operation is done");
		
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the choice between 1 to 3:");
		int a = s.nextInt();
		Filetest1 obj = new Filetest1();
		switch(a) {
		case 1:
			try {
			obj.fileWrite();
			}
			catch(Exception ioe){
				System.out.println("FileWrite operation is undone");
			}
			break;
		case 2:
			try {
				obj.bufferWrite();
			}
			catch(Exception ioe) {
				System.out.println("BufferWrite operation is undone");
				
			}
			break;
		case 3:
			try {
				obj.printWrite();
				
			}
			catch(Exception ioe) {
				System.out.println("PrintWrite operation is undone");
				
			}
			break;
		default:
			System.out.println("Enter only between 1 and 3");
			
			
		}
		s.close();
	}

}
