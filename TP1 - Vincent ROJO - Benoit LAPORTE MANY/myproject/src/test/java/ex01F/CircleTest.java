package ex01F; 
 
import org.apache.log4j.Logger; 
 
 
public class CircleTest {
	protected static Logger log =  Logger.getLogger(Circle.class);
	int x;
	int y;
	int radius;

	public CircleTest(int x, int y, int radius)   {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString()   {
		return(String.format("Circle with center (%d,%d) and radius %d (Perimter is %,.2f)",this.x,this.y,this.radius,(2 * java.lang.Math.PI * this.radius)));
	}
	
	/**
	* On tente en changeant le nom de la methode, on obtient comme resultat : ex01F.Circle@527adabd *
	*/
	public String toStringNewName()   {
		return(String.format("Circle with center (%d,%d) and radius %d (Perimter is %,.2f)",this.x,this.y,this.radius,(2 * java.lang.Math.PI * this.radius)));
	}
}