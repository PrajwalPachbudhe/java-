class employee{
	String name;
	String desg;
	int ID;
	employee(String nm, String des, int id){
		this.name = nm;
		this.desg = des;
		this.ID = id;
		
	}
	public String toString(){
		return name+" " +desg +" " +ID;
	}
}

public class to{
	public static void main(String args[]){
		employee e1 = new employee("Prajwal" , "CEO", 23004 );
		employee e2 = new employee("ujwal" , "Manager", 23011 );
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
