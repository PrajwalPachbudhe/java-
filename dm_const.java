public class dm_const{
	String name;
	int rollno;
	dm_const(){
		System.out.println("Object is created by default contructor.");
	}
	dm_const(String n, int rn){
		this.name=n;
		this.rollno=rn;
		System.out.println("Object is created by parametrize contructor.");
	}
	public static void main(String args[]){
		dm_const c1 = new dm_const();
		System.out.println("Details of object1 are asd follows: ");
		System.out.println("Name: "+c1.name);
		System.out.println("Roll no.: "+c1.rollno);
		dm_const c2 = new dm_const("prajwal", 04);
		System.out.println("Details of object2 are asd follows: ");
		System.out.println("Name: "+c2.name);
		System.out.println("Roll no.: "+c2.rollno);
		
	}
}
