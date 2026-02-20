package BasicPractice;

public class MethodCreation {
	
	public static void objectCreation(int id, String product, String desc, int price ) {
		ProductDetails details = new ProductDetails(id, product, desc, price);
		System.out.println(details);
		
	}
	
	public static void main(String[] args) {
		objectCreation(1, "asdsadad", "fafasdas", 1111);
		objectCreation(2, "sredasda", "wrerferwererwe", 23343243);
		
	}

}
