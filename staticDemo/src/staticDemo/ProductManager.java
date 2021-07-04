package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("To be added");
		}else {
			System.out.println("Information of product is invalid");
		}
		
		
	}
}
