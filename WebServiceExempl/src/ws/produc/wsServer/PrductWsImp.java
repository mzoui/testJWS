package ws.produc.wsServer;

import java.util.List;
import javax.jws.WebService;
import ws.produc.entities.Product;
import ws.product.dao.ProductDao;

@WebService(endpointInterface = ("ws.produc.wsServer.ProductWs"))
public class PrductWsImp  implements ProductWs{
	private ProductDao prodDao = new ProductDao();

	@Override
	public Product findProduct() {
		 
		return prodDao.find();
	}

	@Override
	public List<Product> findAllProduct() {
		List<Product> producList = prodDao.findAll();
		return producList;
	}
	

}
