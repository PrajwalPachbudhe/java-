import java.util.Scanner;

public class em{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the  name: ");
		String name = obj.nextLine();
		System.out.println("enter the Department: ");
		String dept = obj.nextLine();
		System.out.println("enter the DeSignation: ");
		String deSg = obj.nextLine();
		System.out.println("enter the contact No.: ");
		String cont = obj.nextLine();
		System.out.println("enter the Email id: ");
		String email = obj.nextLine();
		System.out.println("enter the employee id: ");
		int id = obj.nextInt();
		System.out.println("enter the GroSS Salary: ");
		int gS = obj.nextInt();
		System.out.println("\n employee detailS \n");	
		System.out.println("Name: "+name);
		System.out.println("employee id: "+id);
		System.out.println("department: "+dept);
		System.out.println("designation: "+deSg);
		System.out.println("GroSS Salary: "+gS);
		System.out.println("Contact no. : "+cont);
		System.out.println("Email id: "+email);
	}
}
