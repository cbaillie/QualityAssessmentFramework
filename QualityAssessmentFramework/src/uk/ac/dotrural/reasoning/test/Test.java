package uk.ac.dotrural.reasoning.test;

import uk.ac.dotrural.reasoning.sparql.SPARQLQuery;

public class Test {

	public static void main(String[] args)
	{
		new Test();
	}
	
	public Test()
	{
		String query = "SELECT * WHERE {?s ?p ?o . }";
		SPARQLQuery spQuery = new SPARQLQuery("http://localhost:3030/QualityScores/query?query=");
		String results = spQuery.queryEndpoint(query, "json");
		System.out.println("Results: " + results);
	}
	
}
