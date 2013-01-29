/**
 * Basic skeleton class for describing Entities using RDF.
 * 
 * Implements a method for converting JSON entities to RDF.
 * 
 * @author Chris (c.baillie@abdn.ac.uk)
 */

package uk.ac.dotrural.reasoning.rdf;

import uk.ac.dotrural.reasoning.entity.JsonEntity;

public abstract class RdfEntity {
	
	public abstract void jsonEntityToRdfEntity(JsonEntity entity);

}
