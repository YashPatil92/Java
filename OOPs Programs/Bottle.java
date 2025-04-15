
public class Bottle {
	String size;
	String color;
	float price;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	//default constructor
	Bottle(){
		System.out.println("Yash");
		size="small";
		color="red";
		price=20;
	}
	//parameteries constructor
	Bottle(String s,String c ,float p){
		size=s;
		color=c;
		price=p;
	}

	public static void main(String[] args) {
		Bottle b1 = new Bottle();
		Bottle b2 = new Bottle("Large","Black",60);
		
		System.out.println(b1.getColor());
		System.out.println(b2.getColor());
	}

}
