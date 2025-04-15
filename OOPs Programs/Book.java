
public class Book {
	int Bookid;
	String Title;
	String Author;
	int Price;
	
	public void setBookid(int b) {
		Bookid=b;
	}
	public int getBookid() {
		return Bookid;
	}
	
	public void setTitle(String t) {
		Title=t;
	}
	public String getTitle() {
		return Title;
	}
	
	public void setAuthor(String a) {
		Author=a;
	}
	public String getAuthor() {
		return Author;
	}
	
	public void setPrice(int p) {
		Price=p;
	}
	public int getPrice() {
		return Price;
	}
	
public static void main(String[] args) {
	Book b1 = new Book();
	b1.setBookid(101);
	b1.setTitle("Shyamchi aai");
	b1.setAuthor("Sane Guruji");
	b1.setPrice(1500);
	
	Book b2 = new Book();
	b2.setBookid(102);
	b2.setTitle("Mrityunjaya");
	b2.setAuthor("Shivaji Sawant");
	b2.setPrice(2000);
	
	System.out.println(b1.getBookid());
	System.out.println(b1.getTitle());
	System.out.println(b1.getAuthor());
	System.out.println(b1.getPrice());

	System.out.println(b2.getBookid());
	System.out.println(b2.getTitle());
	System.out.println(b2.getAuthor());
	System.out.println(b2.getPrice());
	
}
}
