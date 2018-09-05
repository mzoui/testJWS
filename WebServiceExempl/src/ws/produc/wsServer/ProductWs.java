package ws.produc.wsServer;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ws.produc.entities.Product;

@WebService
public interface ProductWs {
	
	@WebMethod
	public Product findProduct();
	
	@WebMethod
	public List<Product> findAllProduct();
}
