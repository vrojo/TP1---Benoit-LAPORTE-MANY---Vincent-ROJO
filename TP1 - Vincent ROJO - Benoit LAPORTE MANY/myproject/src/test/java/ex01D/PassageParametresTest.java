package ex01D; 

import junit.framework.Test; 
import junit.framework.TestCase; 
import junit.framework.TestSuite; 

import org.apache.log4j.*;

/** 
* Unit test for simple App. 
*/ 
public class PassageParametresTest extends TestCase { 
  protected static Logger log =  Logger.getLogger(PassageParametresTest.class);
	
	/** 
	* Create the test case 
	* 
	* @param testName name of the test case 
	*/ 
	public PassageParametresTest( String testName ){
		super( testName ); 
	}
	
	/** 
	* @return the suite of tests being tested 
	*/ 
	public static Test suite(){ 
		System.out.println("PassageParametresTest"); 
		return new TestSuite( PassageParametresTest.class );
	} 
	/** 
	* Rigourous Test :-) 
	*/ 
	public void testApp(){
		log.debug("COUCOU 22");
		int i = 0;
		StringBuffer s = new StringBuffer("abc");
		PassageParametres C = new PassageParametres();
		C.method1(i, s);
		System.out.println("i=" + i + ", s=" + s);
		// i=0, s=abcd   
		
		assertTrue( i == 0 );
		assertTrue( s.toString().equals("abcd"));
		assertFalse( s.toString().equals("abc"));
	} 
}