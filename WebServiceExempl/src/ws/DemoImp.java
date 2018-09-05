package ws;

import javax.jws.WebService;

@WebService (endpointInterface = "ws.Demo")
public class DemoImp  implements Demo{

	@Override
	public String HelloWorld() {
		 
		return "Hello Wolld";
	}

	@Override
	public String HelloYourName(String fullName) {
		
		 return "Hello" + fullName; 
	}

}
