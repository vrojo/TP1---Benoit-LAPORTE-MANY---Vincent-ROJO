package ex01E; 

import ex01E.*;
 
public class Exercice01ETest extends B  {
	public int x;
	public int a;   
	
	public Exercice01ETest(){}
	
	public static void m() {
		System.out.println("Je suis dans la méthode m d'une instance de A");
	} 
 
	public void test() {
		a = super.x;
		//a = super.super.x;
		a = ((B)this).x;
        a = ((A)this).x;
		this.m();
        super.m();
		//super.super.m();
        ((B)this).m();     // (1)
		/*Comment:
		We can not call super.super.attribute or super.super.method
		but we can ask the object to act as if it was an A class object
		because the object extends B which extends A.*/
		
	}
	
	public static void main( String[] args ){
		Exercice01ETest instance = new Exercice01ETest();
		instance.test();
	}
}