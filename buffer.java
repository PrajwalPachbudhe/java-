public class buffer{
	public static void main(String args[]){
		StringBuffer title = new StringBuffer("Five points Something");
		StringBuffer author = new StringBuffer("mr. chetan bhagat");
		StringBuffer publi = new StringBuffer("New indian Publication Pvt. " );
		
		System.out.println("Books details");
		System.out.println("title: "+title +" "+author +" "+publi);
		
		StringBuffer book = new StringBuffer("400 days");
		
		book.append(", NEW INDIAN PUBLICATION Pvt.");
		System.out.println("Books details");
		System.out.println("Title: "+book);
	}
}
