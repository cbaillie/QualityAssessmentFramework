QualityAssessmentFramework
==========================

QualityAssessmentFramework is a framework designed to be extended for domain-specific quality assessment.

uk.ac.dotrural.reasoning.entity
JsonEntity : Class to represent the "subject" of quality assessment, i.e. the Entity whose quality is to be assessed.
             Extend this to better represent the Entity you wish to evaluate, e.g. a sensor observation.

uk.ac.dotrural.reasoning.rdf
RdfEntity : Class that converts a JSON Entity to an RDF Entity for creating RDF models used in reasoning.

uk.ac.dotrural.reasoning
Reasoner : Class that performs reasoning using a SPIN Reasoner (http://www.spinrdf.org).
           Requires a String URL describing the location of your ontology containing your quality assessment SPIN rules,
           a String describing the notation of your ontology file, e.g. "N3", and a boolean stating whether the file is
           local or accessed via the Web.

           performReasoning method should be passed an RDF Model describing the Entity to be assessed.

uk.ac.dotrural.reasoning.sparql
         : Collection of classes for sending SPARQL queries and updates


Licence

Licensed under the Lesser General Public Licence (LGPL) Version 2.1 (http://www.gnu.org/licenses/lgpl-2.1.html)
