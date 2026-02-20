package BasicPractice;

public class ProductDetails {
	
	
	int id;
	String productName;
	String desc;
	int price;
	
	public ProductDetails() {
		super();
	}
	
	public ProductDetails(int id, String productName, int price) {
		this.id = id;
		this.productName = productName;
		this.desc = "zsdfsdfsd";
		this.price = price;
	}
	
	public ProductDetails(int id, String productName, String desc, int price) {
		this.id = id;
		this.productName = productName;
		this.desc = desc;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", productName=" + productName + ", desc=" + desc + ", price=" + price
				+ "]";
	}

}
