/**
 * Abstract class that can provide access to JSON representations of
 * entities, i.e. `things' that can be reasoned about.
 * 
 * @author Chris (c.baillie@abdn.ac.uk)
 */

package uk.ac.dotrural.reasoning.entity;

public abstract class JsonEntity {

	public abstract void setJsonDescription(String uri);

	public abstract String getJsonDescription();

}
