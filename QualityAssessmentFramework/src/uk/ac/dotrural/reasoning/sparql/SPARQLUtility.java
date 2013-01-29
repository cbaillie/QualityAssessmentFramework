package uk.ac.dotrural.reasoning.sparql;

public class SPARQLUtility {
	
	public String endpoint;
	
	public SPARQLUtility (String e)
	{
		endpoint = e;
		log("Constructor","Initialised with endpoint " + endpoint);
	}
	
	/**
	 * Send messages to the user
	 * 
	 * @param method The method from which the message originated
	 * @param msg The message to be displayed
	 */
	public void log(String method, String msg)
	{
		System.out.println("[SPARQLUpdate] " + method + " : " + msg);
	}

}
