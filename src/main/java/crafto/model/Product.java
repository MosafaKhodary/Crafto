package crafto.model;

public class Product {

	int ID;
	String name;
	String description;
	float price;
	String image;
	int seller_id;
	
	public Product(int iD, String name, String description, float price, String image, int seller_id) {
		ID = iD;
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
		this.seller_id = seller_id;
	}
	public Product(String name, String description, float price, String image, int seller_id) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
		this.seller_id = seller_id;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	
}
