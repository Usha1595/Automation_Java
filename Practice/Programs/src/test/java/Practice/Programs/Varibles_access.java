package Practice.Programs;

public class Varibles_access {
	
	// local variable
	//Static  variable
	// Instace variable 
	
	public static int usha = 20;
	int b =30;
	public void varible()
	{
		int a =10;
		System.out.println("local variable \t" + a);
		System.out.println("Static variable \t"+ usha);
		System.out.println("instance variable \t"+ b);
	}
	
	public static void main(String[] args) {
		Varibles_access str = new Varibles_access();
		str.varible();
		
		System.out.println(usha);
		
		
	}
			
}
	
	

