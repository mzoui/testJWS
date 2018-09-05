package main;

import java.util.List;

import ws.Demo;
import ws.DemoImpService;
import ws.DemoImpServiceLocator;
import ws.produc.wsServer.PrductWsImpService;
import ws.produc.wsServer.PrductWsImpServiceLocator;
import ws.produc.wsServer.Product;
import ws.produc.wsServer.ProductWs;

public class Main {

	public static void main(String[] args) {
		try {
			DemoImpService demoInpService = new DemoImpServiceLocator();
			Demo demo = demoInpService.getDemoImpPort();
			System.out.println(demo.helloWorld());
			System.out.println(demo.helloYourName(" Mahmoud"));
			
			PrductWsImpService  productWsImp = new PrductWsImpServiceLocator();
			ProductWs productWs = productWsImp.getPrductWsImpPort();
			Product product = productWs.findProduct(); 
			System.out.println(" id: "+product.getId() + " Name :" +product.getName() +" Prodci: "+product.getPrice());
			
			Product [] poridyList = productWs.findAllProduct();
			System.out.println("-----------------------------------");
			for(Product p : poridyList) {
				System.out.println(" id: "+p.getId() + " Name :" +p.getName() +" Product: "+p.getPrice());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
