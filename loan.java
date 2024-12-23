import java.util.Scanner;

public class loan{
	Scanner l = new Scanner(System.in);
	String name;
	int pri;
	public void personal(){
		int in = 10;
		double si;
		int du;
		double amount;
		System.out.println("Enter the name: ");
		name= l.nextLine();
		System.out.println("Enter the Principle amount: ");
		pri= l.nextInt();
		System.out.println("Enter the duration in month: ");
		du = l.nextInt();
		
		si = (pri * in * du )/100;
		amount = si + pri;
		System.out.println("You have repay amount:  "+amount);
	}
	public void vehicle(){
		int in = 8;
		double si;
		int du;
		double amount;
		System.out.println("Enter the name: ");
		name= l.nextLine();
		System.out.println("Enter the Principle amount: ");
		pri= l.nextInt();
		System.out.println("Enter the duration in month: ");
		du = l.nextInt();
		
		si = (pri * in * du )/100;
		amount = si + pri;
		System.out.println("You have repay amount:  "+amount);
	}
	public void home(){
		int in = 9;
		double si;
		int du;
		double amount;
		System.out.println("Enter the name: ");
		name= l.nextLine();
		System.out.println("Enter the Principle amount: ");
		pri= l.nextInt();
		System.out.println("Enter the duration in month: ");
		du = l.nextInt();
		
		si = (pri * in * du )/100;
		amount = si + pri;
		System.out.println("You have repay amount:  "+amount);
	}
	public static void main(String args[]){
		Scanner l = new Scanner(System.in);
		loan l1= new loan();
		int cho;
		int inp;
		do{
			System.out.println("*******************************************");
			System.out.println("***************HDFC Bank*****************");
			System.out.println("*******************************************");
			
			System.out.println("\nloan option");
			System.out.println("\nPress 1: personal loan.");
			System.out.println("Press 2: vehicle loan.");
			System.out.println("Press 3: home loan.");
			System.out.println("Press 4: exit.");
			
			System.out.println("\nEnter the input: ");
			inp = l.nextInt();
			
			switch(inp){
				case 1: 
					l1.personal();
					break;
				case 2: 
					l1.vehicle();
					break;
				case 3: 
					l1.home();
					break;
				case 4:
					System.out.println("\nExiting..........................");
					System.exit(0);
					break;
				default: 
					System.out.println("\nINVALID INPUT.");
					
			}
			System.out.println("Do you want to perform any other operation 1-yes/ 0-no: ");
			cho = l.nextInt();
			
		}while(cho == 1);
	}
}
