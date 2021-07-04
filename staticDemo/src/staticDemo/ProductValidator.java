package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Constructor is run");
	}
	
	static {
		System.out.println("Constructor is run");
	}
	
	
	static {
		System.out.println("Constructor is run");
	}
	
	
	public ProductValidator() {
		System.out.println("Costructor is run");
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void something() {
		
	}
}

