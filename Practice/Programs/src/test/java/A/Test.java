package A;
import Practice.Programs.Testaccess;

// We are writing a program for default access modifier.
// We can access default modifer with in the package
//Now we are defing our class to public
 

public class Test extends Testaccess{
	
public static void main(String[] args) {
	

		System.out.println("hello");
		Test b = new Test();
		
		b.A();
		System.out.println(b.X);
		
	}
	
}
	


