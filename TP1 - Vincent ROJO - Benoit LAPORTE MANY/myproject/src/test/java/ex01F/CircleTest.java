package ex01F; 
 
import junit.framework.Test; 
import junit.framework.TestCase; 
import junit.framework.TestSuite;

import org.apache.log4j.*;

/** 
* Unit test for simple App. 
*/ 
public class CircleTest extends TestCase { 
	protected static Logger log =  Logger.getLogger(CircleTest.class);
	
	/** 
	* Create the test case 
	* 
	* @param testName name of the test case 
	*/ 
	public CircleTest( String testName ){
		super( testName ); 
	}
	
	/** 
	* @return the suite of tests being tested 
	*/ 
	public static Test suite(){ 
		System.out.println("CircleTest"); 
		return new TestSuite( CircleTest.class );
	} 
	/** 
	* Rigourous Test :-) 
	*/ 
	public void testApp(){
		log.debug("We check the values entered");
		Circle c1 = new Circle(0,0, 5);
		assertTrue(c1.getx() == 0);
		assertTrue(c1.gety() == 0);
		assertTrue(c1.getradius() == 5);
		
		Circle c2 = new Circle(0,0, 3);
		assertTrue(c2.getx() == 0);
		assertTrue(c2.gety() == 0);
		assertTrue(c2.getradius() == 3);
	}
}