import java.io.*;

public class dthread4 extends Thread{
	public static int n = 0;
	public void run(){
		n++;
	}
	public static void main(String args[]){
		dthread4 t1= new dthread4();
		t1.start();
		while(t1.isAlive()){
			System.out.println("waiting.....................................");
		}
		
		System.out.println("current value of num is: "+n);
		n++;
		System.out.println("current value of num is: "+n);
	}
}
