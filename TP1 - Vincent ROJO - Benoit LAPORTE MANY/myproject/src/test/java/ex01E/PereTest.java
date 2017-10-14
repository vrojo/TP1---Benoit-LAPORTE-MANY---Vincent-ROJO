package ex01E; 
 
import junit.framework.Test; 
import junit.framework.TestCase; 
import junit.framework.TestSuite;

import org.apache.log4j.*;

/** 
* Unit test for simple App. 
*/ 
public class PereTest extends TestCase { 
	protected static Logger log =  Logger.getLogger(PereTest.class);
	
	/** 
	* Create the test case 
	* 
	* @param testName name of the test case 
	*/ 
	public PereTest( String testName ){
		super( testName ); 
	}
	
	/** 
	* @return the suite of tests being tested 
	*/ 
	public static Test suite(){ 
		System.out.println("PereTest"); 
		return new TestSuite( PereTest.class );
	} 
	/** 
	* Rigourous Test :-) 
	*/ 
	public void testApp(){
		log.debug("We test the call of m()");
		Pere pere = new Pere();
		pere.m();
		/**
		* We should check the String written on the terminal to see if it is the one we expected
		*/
	}
}