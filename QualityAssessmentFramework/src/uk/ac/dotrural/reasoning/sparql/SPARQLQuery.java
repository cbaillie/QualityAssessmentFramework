package uk.ac.dotrural.reasoning.sparql;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

public class SPARQLQuery extends SPARQLUtility {

	public SPARQLQuery(String e)
	{
		super(e);
	}
	
	public void queryWebService(String query)
	{		   
		log("queryWebService","not implemented...");
	}
	
	public String queryEndpoint(String query, String outputType)
	{
		log("doSPARQLQuery",query);	
		StringBuilder in = new StringBuilder();
		String tmp = "";
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(new URL(endpoint + URLEncoder.encode(query, "UTF-8") + "&output=" + outputType).openStream()));
			while((tmp = br.readLine()) != null)
			{
				in.append(tmp);
			}	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return in.toString();
	}
	
}
