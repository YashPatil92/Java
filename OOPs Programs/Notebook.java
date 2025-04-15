
public class Notebook {
	int pages;
	float price;
	String brand;
	String size;
	

	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}
	//parametrise constructor
	public Notebook(int pages, float price, String brand, String size) {
		super();
		this.pages = pages;
		this.price = price;
		this.brand = brand;
		this.size = size;
	}	
		//default constructor or zero argument constructor
		public Notebook() {
		
	}
		
		//tostring method
		public String toString() {
			return " Notebook Company : " + this.brand
					+ " Price : " + this.price
					+ " Pages : " + this.pages
					+ " Size : " + this.size; 
		}

}
