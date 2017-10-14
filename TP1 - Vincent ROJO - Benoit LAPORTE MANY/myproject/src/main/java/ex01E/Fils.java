package ex01E; 

import ex01E.*;
 
public class Fils extends Pere  {
	public int x;
	public int a;   
	
	public Fils(){}
	
	public static void m() {
		System.out.println("Je suis dans la methode m d'une instance de GrandPere");
	} 
 
	public void test() {
		a = super.x;
		//a = super.super.x;
		a = ((Pere)this).x;
        a = ((GrandPere)this).x;
		this.m();
        super.m();
		//super.super.m();
        ((Pere)this).m();     // (1)
		/**
		* We can not call super.super.attribute or super.super.method
		* but we can ask the object to act as if it was a GrandPere class object
		* because the object extends Pere which extends GrandPere.
		*/
		
	}
	
	public static void main( String[] args ){
		Fils instance = new Fils();
		instance.test();
	}
}