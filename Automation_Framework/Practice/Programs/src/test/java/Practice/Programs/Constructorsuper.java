package Practice.Programs;

public class Constructorsuper {
	
	int a=10;
	Constructorsuper()
	{
		// To get the values from immediate parent class
		// Super is used in Default constructor
		// Default constructor will not have any modifiers it will take same as Class
		super();
		
		System.out.println("Super class");
	}
	
	
	public static void main(String[] args) {
		
		
		Constructorsuper obj = new Constructorsuper();
		
		System.out.println(obj.a);
		
		
	}

}
