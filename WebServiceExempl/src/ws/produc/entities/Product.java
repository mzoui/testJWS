package ws.produc.entities;

public class Product {

	private String id;
	private String name;
	private Long price;
	public Product(String id, String name, Long d) {
		 this.id = id;
		 this.name = name;
		 this.price = d;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Long getPrice() {
		return price;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
}
