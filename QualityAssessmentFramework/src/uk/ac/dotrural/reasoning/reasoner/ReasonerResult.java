package uk.ac.dotrural.reasoning.reasoner;

import com.hp.hpl.jena.rdf.model.Model;

public class ReasonerResult {
	
	public Model ntriples;
	public long duration;
	
	public ReasonerResult(Model n, long d)
	{
		ntriples = n;
		duration = d;
	}

}
