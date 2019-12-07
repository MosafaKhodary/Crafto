package crafto.model;

public class Customer {
	int ID;
	String name;
	String email;
	String password;
	String phone;
	String shipping_address;
	public Customer(int iD, String name, String email, String password, String phone, String shipping_address) {
		ID = iD;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.shipping_address = shipping_address;
	}
	public Customer(String name, String email, String password, String phone, String shipping_address) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.shipping_address = shipping_address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}
	
}
