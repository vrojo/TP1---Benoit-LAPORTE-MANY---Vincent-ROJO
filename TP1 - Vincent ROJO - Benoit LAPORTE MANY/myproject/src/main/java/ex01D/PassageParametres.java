package ex01D; 

import org.apache.log4j.*;

public class PassageParametres {
	protected static Logger log =  Logger.getLogger(PassageParametres.class);
	
	/**
	* Method to see the difference between the modification of a variable and an object
	*/
	public static void method1(int i, StringBuffer s)    {
		i++; s.append("d");   
	} 
 
	public static void main(String [] args)    {
		int i = 0;
		StringBuffer s = new StringBuffer("abc");
		method1(i, s);
		System.out.println("i=" + i + ", s=" + s);
		log.debug("We should have:  i=0, s=abcd");
		// i=0, s=abcd   
	}
}