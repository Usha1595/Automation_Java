package Practiceprogram2;



public class Accessmodi {
	
	 int X=10;
	
	 //return type method name
	    protected void A()
	{
		System.out.println("hi");
	}
	

}
	
	class Testaccess1{
		
		public static void main(String[] args) {
			
			Accessmodi obj = new Accessmodi();
			obj.A();
			System.out.println(obj.X);
			
		
			
		}
	}
	
	
	
