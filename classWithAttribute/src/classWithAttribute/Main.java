package classWithAttribute;

public class Main {
	public static void main(String[] args) {
		
		Product product = new Product(1, "Laptop","Asus",3000,2,"Black");
		product.setName("LAptop");
		product.setId(1);
		product.setDescription("Asus Leptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getCode());
		
	}

}
