package Practice.Programs;

public class  Testaccess {
	
	// private is notthing but visisbility is Only with in the class
	// Protected is within the package and outside the package but only through inheritence.
	// level of execution
	
	
	protected int X=10;
	
	protected void A()
	{
		System.out.println("hi");
	}
	

}
class Testaccess1{
	
	public static void main(String[] args) {
		
		
		Testaccess b = new Testaccess();
		
		b.A();
		System.out.println(b.X);
		
	}
}