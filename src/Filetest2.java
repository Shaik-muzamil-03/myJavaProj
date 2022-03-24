import java.io.*;
import java.util.*;
public class Filetest2 {
	public void fileRead()throws IOException {
		FileReader fr = new FileReader("muz.txt");
		int i = fr.read();
		while(i!=-1) {
			System.out.println((char)i);
			i = fr.read();
			
		}
		fr.close();
		
	}
	public void bufferRead()throws IOException {
		FileReader fr = new FileReader("muz.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while(s!=null) {
			System.out.println(s);
			s = br.readLine();
		}
		fr.close();
		br.close();
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter choice either 1 or 2");
		int a = s.nextInt();
		Filetest2 obj = new Filetest2();
		switch(a) {
		case 1:
			try {
				obj.fileRead();
			}
			catch(IOException ioe) {
				System.out.println("Read operation undone");
			}
			break;
		case 2:
			try {
				obj.bufferRead();
			}
			catch(IOException ioe) {
				System.out.println("Read operation undone");
				
			}
			break;
		default:
			System.out.println("Enter only either 1 or 2");
		
		}
		s.close();
		
	}

}
