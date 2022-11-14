package WS;

import javax.xml.ws.Endpoint;

import demo_WSSOAP.ScolariteWS;


public class ServeurWS {
	public static void main(String[] args) {

	// TODO Auto-generated method stub
	ScolariteWS serviceWebSOAP= new ScolariteWS();
	String url="http://localhost:8787/";
	Endpoint.publish(url,serviceWebSOAP);
	System.out.println("Service Web déployé via un serveur END POINT : http://localhost:8787/");
		}
}
