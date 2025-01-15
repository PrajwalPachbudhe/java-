import java.util.Scanner;

public class bike{

	Scanner b = new Scanner(System.in);
	String Name;
	String company;
	String Price;
	int power;
	int strokes;
	float milage;
	
	public void getdata(){
		System.out.println("Enter the name of bike: ");
		Name = b.nextLine();
		System.out.println("Enter the name of company: ");
		company = b.nextLine();
		System.out.println("Enter the price: ");
		Price = b.nextLine();
		System.out.println("Enter the engine Power: ");
		power = b.nextInt();
		System.out.println("Enter the strokes: ");
		strokes= b.nextInt();
		System.out.println("Enter the milage of bike: ");
		milage = b.nextFloat();
		
	}	
	public void display(){
		System.out.println("\t\tPrinting the details of Bikes\t\t");
		System.out.println("Name of Bike: " +Name);
		System.out.println("Company name: " +company);
		System.out.println("Price: " +Price);
		System.out.println("Engine Power: " +power);
		System.out.println("Strokes: " +strokes);
		System.out.println("Mileage: " +milage);
		
	}
	public static void main(String args[]){
		bike b1= new bike();
		b1.getdata();
		b1.display();
		
	}
}
