public class Area {
	//Polymorphism
	//method overloading
	
	//Area of Circle
	public void Area(float radius) {
		System.out.println("Area of Circle :" + Math.PI*radius*radius);
	}
	
	//Area of Rectangle
	public void Area(int l,int b) {
		System.out.println("Area of Rectangle :" + 2*(l+b));
	}
	
	//Area of Triangle
	public void Area(double base,double height) {
		System.out.println("Area of Triangle :" + base*height/2);
	}
	
	//Area of Square
	public void Area(double side) {
		System.out.println("Area of Square :" + side*side);
	}
	
	public static void main(String[] args) {
		Area p = new Area();
		p.Area(5.4f);
		p.Area(4,5);
		p.Area(5.5, 5.5);
		p.Area(2);

	}

}
