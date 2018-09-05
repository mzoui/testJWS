package ws.product.dao;

import java.util.ArrayList;
import java.util.List;

import ws.produc.entities.Product;

public class ProductDao {
	
	public Product find() {
		return new Product("p1","NonName", (long) 11.2);
	}
	
	public List<Product> findAll(){
		
		List<Product>	productList = new ArrayList<Product>();
		productList.add(new Product("p1","NonName", (long) 11.2));
		productList.add(new Product("p2","NonName2", (long) 11.5));
		productList.add(new Product("p3","NonName3", (long) 11.66));
		
		return productList;
		
	}
	
}
