package BasicPractice;

import java.util.ArrayList;
import java.util.List;

public class MethodCreation {
	
	public static ProductDetails objectCreation(int id, String product, String desc, int price ) {
		ProductDetails details = new ProductDetails(id, product, desc, price);
		System.out.println(details);
		return details;
		
	}
	
	public static int calculate(int a, int b) {
		return a*b;
	}
	
	
	public static List<ProductDetails> filteringByPrice(int price, List<ProductDetails> details) {
		
		List<ProductDetails> result = new ArrayList<>();
		
		for(ProductDetails product: details) {
			
			if(product.getPrice() <= price) {
				result.add(product);
			}
		}
		
		return result;	
	}
	
	public static void main(String[] args) {
//		objectCreation(1, "asdsadad", "fafasdas", 1111);
		ProductDetails result =  objectCreation(1, "sredasda", "wrerferwererwe", 8000);
		ProductDetails result1 =  objectCreation(2, "mobile", "wrerferwererwe", 10000);
		ProductDetails result2 =  objectCreation(3, "mobile", "wrerferwererwe", 50000);
		
		List<ProductDetails> input = new ArrayList<>();
		input.add(result);
		input.add(result1);
		input.add(result2);
		
		
		if(result.id == 2) {
			System.out.println("object created successfully");
		}
		
		List<ProductDetails> filterResult = filteringByPrice(10000, input);
		System.out.println(filterResult);
		
	}

}
