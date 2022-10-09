package icecream;

public class IceCream {

	private String ID;
	private String Name;
	private String Size;
	private String Topping;
	private String Price;
	
	public IceCream(String ID, String Name, String Size, String Topping, String Price) {
		// TODO Auto-generated constructor stub
		this.ID = ID;
		this.Name = Name;
		this.Size = Size;
		this.Topping = Topping;
		this.Price = Price;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}

	public String getTopping() {
		return Topping;
	}
	public void setTopping(String topping) {
		Topping = topping;
	}

	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
