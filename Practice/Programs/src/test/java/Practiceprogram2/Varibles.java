package Practiceprogram2;

import Practice.Programs.Varibles_access;

public class Varibles {
	
	int a;
	public static float b;

	void A()
	{
		
		int c=20;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
	
		Varibles.b=10;
		Varibles obj = new Varibles();
		System.out.println(obj.a=20);
		obj.A();
		
		
		
	}

}
