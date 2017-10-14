package ex01E; 
 
import junit.framework.Test; 
import junit.framework.TestCase; 
import junit.framework.TestSuite;

import org.apache.log4j.*;

/** 
* Unit test for simple App. 
*/ 
public class FilsTest extends TestCase { 
	protected static Logger log =  Logger.getLogger(FilsTest.class);
	
	/** 
	* Create the test case 
	* 
	* @param testName name of the test case 
	*/ 
	public FilsTest( String testName ){
		super( testName ); 
	}
	
	/** 
	* @return the suite of tests being tested 
	*/ 
	public static Test suite(){ 
		System.out.println("FilsTest"); 
		return new TestSuite( FilsTest.class );
	} 
	/** 
	* Rigourous Test :-) 
	*/ 
	public void testApp(){
		log.debug("We test the call of m()");
		Fils instance = new Fils();
		instance.test();
		/**
		* We should check the String written on the terminal to see if they are the ones we expected
		*/
	}
}