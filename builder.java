import java.util.Scanner;
public class builder{
	public static void main(String args[]){
		Scanner o = new Scanner(System.in);
		StringBuilder comp = new StringBuilder("LAMBORGINI");
		StringBuilder model = new StringBuilder("SUV");
		StringBuilder price = new StringBuilder("10 million");
		
		System.out.println("Name of company: " +comp +"Model: " +model +"Price: "+price);
		System.out.println("Enter the name of company: ");
		String cn = o.nextLine();
		StringBuilder nm = new StringBuilder(cn);
		nm.append(", Supra mk4");
		nm.append("', 90,52,000/-");
		
		System.out.println(nm);
		
		nm.append(", 2 seater");
		System.out.println(nm);
		
		nm.append(", V8 engine");
		System.out.println(nm);
		
		nm.append(", 13.2 kmpl");
		System.out.println(nm);
		
		nm.append(", 320 hp");
		System.out.println(nm);
		
		nm.append(", black-white");
		System.out.println(nm);
		
		
		System.out.println("input the index to delete: ");
		int h = o.nextInt();
		int i = o.nextInt();
		
		nm.delete(h , i);
		System.out.println(nm);
	}
}



