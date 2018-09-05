package main;
import javax.xml.ws.Endpoint;
import ws.DemoImp;
import ws.produc.wsServer.PrductWsImp;
 

public class Main {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:300/ws/demo" , new DemoImp());
			System.out.println("Done");
			
			Endpoint.publish("http://localhost:300/ws/produc/wsServer/productWsImp" , new PrductWsImp());
			System.out.println("Done2");


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
