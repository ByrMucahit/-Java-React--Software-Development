package oopIntro;

public class Main {
	public static void main(String[] args) {
		
		
		
		Product product1 = new Product();
	
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product product3 = new Product();
		
		
		
		Product[] products = {product1,product2,product3};
		System.out.println(products.length);
		
		
		System.out.println("---------------------------------------");
		Category category1 = new Category();

		category1.setId(1); ;
		category1.setName( "Food");
		System.out.println(category1.getId());
		System.out.println(category1.getName());
		
		Category cateogry2 = new Category();
		cateogry2.setId(2);
		cateogry2.setName("Drinking");
		System.out.println(cateogry2.getId());
		System.out.println(cateogry2.getName());
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		}
	
	

}
