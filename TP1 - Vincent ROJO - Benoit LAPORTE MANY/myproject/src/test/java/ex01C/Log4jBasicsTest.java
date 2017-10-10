package ex01C;

import junit.framework.Test; 
import junit.framework.TestCase; 
import junit.framework.TestSuite;

public class Log4jBasicsTest extends TestCase { 
	/** 
	* Create the test case 
	* 
	* @param testName name of the test case 
	*/ 
	public Log4jBasicsTest( String testName ){
		super( testName ); 
	} 
	
	/** 
	* @return the suite of tests being tested 
	*/ 
	public static Test suite(){ 
		System.out.println("je suis la");
		return new TestSuite( Log4jBasicsTest.class );
	} 
	/** 
	* Rigourous Test :-) 
	*/ 
	public void testApp(){ 
		assertTrue( true ); 
	} 
}