import java.io.*;

public class dthread3{
	public static void main(String args[]){
		Thread t1 = new Thread();
		System.out.println("The thread is running from Thread");
		t1.start();
		
		String str = t1.getName();
		System.out.println(str);
	}
}
