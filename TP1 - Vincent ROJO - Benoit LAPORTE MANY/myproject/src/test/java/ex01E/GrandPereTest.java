package ex01E; 
 
import junit.framework.Test; 
import junit.framework.TestCase; 
import junit.framework.TestSuite;

import org.apache.log4j.*;

/** 
* Unit test for simple App. 
*/ 
public class GrandPereTest extends TestCase { 
	protected static Logger log =  Logger.getLogger(GrandPereTest.class);
	
	/** 
	* Create the test case 
	* 
	* @param testName name of the test case 
	*/ 
	public GrandPereTest( String testName ){
		super( testName ); 
	}
	
	/** 
	* @return the suite of tests being tested 
	*/ 
	public static Test suite(){ 
		System.out.println("GrandPereTest"); 
		return new TestSuite( GrandPereTest.class );
	} 
	/** 
	* Rigourous Test :-) 
	*/ 
	public void testApp(){
		log.debug("We test the call of m()");
		GrandPere gpere = new GrandPere();
		gpere.m();
		/**
		* We should check the String written on the terminal to see if it is the one we expected
		*/
	}
}