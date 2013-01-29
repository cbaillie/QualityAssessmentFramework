/**
 * Enables the writing a SPARQL updates to fuseki
 * 
 * @author Chris (c.baillie@abdn.ac.uk)
 */

package uk.ac.dotrural.reasoning.sparql;

import com.hp.hpl.jena.sparql.modify.UpdateProcessRemote;
import com.hp.hpl.jena.update.UpdateFactory;
import com.hp.hpl.jena.update.UpdateRequest;

public class SPARQLUpdate extends SPARQLUtility {
	
	/**
	 * Constructor
	 * 
	 * @param e The URL of the endpoint
	 */
	public SPARQLUpdate(String e)
	{
		super(e);
	}
	
	/**
	 * Perform a SPARQL update
	 * 
	 * @param updateQuery The SPARQL query to be executed
	 * @return boolean indicating success
	 */
	public boolean doSPARQLUpdate(String updateQuery)
	{
		log("doSPARQLUpdate",updateQuery);
		log("doSPARQLUpdate",endpoint);
		
		try
		{
			UpdateRequest ur = UpdateFactory.create();
			ur.add(updateQuery);
			UpdateProcessRemote r = new UpdateProcessRemote(ur,endpoint);
			r.execute();
			log("doSPARQLUpdate","SPARQL update sent");
			return true;
		}
		catch(Exception ex)
		{
			log("doSPARQLUpdate","Error sending SPARQL update...");
			ex.printStackTrace();
		}
		return false;
	}

}
