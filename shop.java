import java.util.Scanner;

class item{
	int no;
	String nm;
	String p;
	item( int i, String n, String pp){
		this.no = i;
		this.nm = n;
		this.p = pp;
		
	} 
}
public class shop{
	  public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		shop d[]= new shop[10];
		System.out.println("Reading th shop items:- ");
		for(int i=0; i<5; i++){
			System.out.println("\n\nThe details of item "+(i+1));
			System.out.print("Enter the item number: ");
			int no = obj.nextInt();
			
			System.out.print("Enter the item name: ");
			String nm = obj.nextLine();
			
			
			System.out.print("Enter the item price: ");
			String p = obj.nextLine();
			
		
			
			d[i] = new item(no, nm, p);
		}
		System.out.print("Printing the shop item details");
		for(int i=0; i<5; i++){
			
			System.out.println("\nItem no: "+d[i].no + "\tName of item: "+d[i].nm + "\tItem price: "+d[i].dep);
			
		}
		
	}
}
