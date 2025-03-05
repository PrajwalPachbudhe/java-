import java.io.*;

public class sleepmeth extends Thread{
	public void run(){
		for(int i=0; i<5; i++){
			try{
				sleep(5000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
		
	}
	
	public static void main(String args[]){
		sleepmeth t1 = new sleepmeth();
		sleepmeth t2 = new sleepmeth();
		
		t1.start();
		t2.start();
	}
}
