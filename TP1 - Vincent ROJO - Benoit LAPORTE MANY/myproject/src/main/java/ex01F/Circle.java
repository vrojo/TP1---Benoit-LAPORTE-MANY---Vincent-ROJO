package ex01F; 
 
import org.apache.log4j.Logger; 
 
 
public class Circle {
	protected static Logger log =  Logger.getLogger(Circle.class);
	int x;
	int y;
	int radius;

	public Circle(int x, int y, int radius)   {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	/**
	* Getter methods to access the attributes of a Circle instance
	*/
	public int getx(){
		return this.x;
	}
	
	public int gety(){
		return this.y;
	}
	
	public int getradius(){
		return this.radius;
	}

	/**
	* Overloading of the toString method to change its default value to a customized one
	*/
	public String toString()   {
		return(String.format("Circle with center (%d,%d) and radius %d (Perimeter is %,.2f)",this.x,this.y,this.radius,(2 * java.lang.Math.PI * this.radius)));
	}
	
	/**
	* Lorsqu'on tente en changeant le nom de la methode, on obtient comme resultat : ex01F.Circle@527adabd *
	*/

	public String toStringNewName()   {
		return(String.format("Circle with center (%d,%d) and radius %d (Perimeter is %,.2f)",this.x,this.y,this.radius,(2 * java.lang.Math.PI * this.radius)));
	}
}