package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Demo {
	
	@WebMethod
	public String HelloWorld();
	
	@WebMethod
	public String HelloYourName(final String fullName);
	
	

}
