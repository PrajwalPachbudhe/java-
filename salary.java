import java.util.Scanner;

public class salary{
	Scanner sal = new Scanner(System.in);
	String name;
	String id;
	String dept;
	String desg;
	int bs;
	double hra;
	double ta;
	double da;
	int incen = 5000;
	int pfde = 3000;
	int licde= 2500;
	double gs;
	double ns;
	
	
	
	public void getdata(){
		System.out.println("Enter the name of employee: ");
		name = sal.nextLine();
		
		System.out.println("Enter the employee ID: ");
		id = sal.nextLine();
		
		System.out.println("Enter the Department of employee: ");
		dept = sal.nextLine();
		
		System.out.println("Enter the Employee Designation: ");
		desg = sal.nextLine();
		
		System.out.println("Enter the basic salary of employee: ");
		bs = sal.nextInt();
	}
	
	public void cal(){
		hra = 0.40 * bs;
		ta = 0.30 * bs;
		da = 0.90 * bs;
		
		gs = bs + hra + ta + da + incen;
		ns = gs - (pfde + licde);
		
	}
	
	public void display(){
		System.out.println("\t******************************\t ");
		System.out.println("\t******Salary Certificate******\t ");
		System.out.println("\t******************************\t ");
		
		System.out.println("\nName:  "+name);
		System.out.println("Employee ID:  "+id);
		System.out.println("Department:  "+dept);
		System.out.println("Desgination:  "+desg);
		System.out.println("Basic Salary:  "+bs);
		System.out.println("TA:  "+ta);
		System.out.println("DA:  "+da);
		System.out.println("Incentives:  "+incen);
		System.out.println("PF Deduction:  "+pfde);
		System.out.println("LIC Deduction:  "+licde);
		System.out.println("GROSS SALARY:  "+gs);
		System.out.println("NET SALARY:  "+ns);
		
	}
	
	public static void main(String args[]){
		Scanner sal = new Scanner(System.in);
		salary sal1= new salary();
		int in;
		int ch; 
		
		do{
			System.out.println("\tList Of Opertion");
			System.out.println("\nPress 1: To store.");
			System.out.println("Press 2: To calculate.");
			System.out.println("Press 3: To display.");
			System.out.println("Press 4: To exit.");
			
			System.out.println("\nEnter the input: ");
			in = sal.nextInt();
			
			
			switch(in){
				case 1:
					sal1.getdata();
					break;
				case 2: 
					sal1.cal();
					break;
				case 3:
					sal1.display();
					break;
				case 4: 
					System.exit(0);
					break;
				default:
					System.out.println("INVALID INPUT!!!!!!");
			}
			
			System.out.println("\nDo you want to perform any other operation 1-yes/0-No: ");
			ch = sal.nextInt();
			
			
			
		}while(ch == 1);
		
	}
}




















