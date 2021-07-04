package nLayeredDemo.business.concretes;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		this.productDao.add(product);
		this.loggerService.logToSystem("Product is added : "+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
