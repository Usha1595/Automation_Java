package Practice.Programs;

public class Constructor {

	// We create object 
	// 1. usha , 2. Jevvan..... , 1000. Lila
    // Constructor is used to initilize the Object
	// If We not create a Constructor then Compiler will Automatically create default constructor.
	// Constructor name is same as Classname
	// We can use default, public, protected, private
	// Constructor cannot be Final, Static.
	// Suppose we are using default constructor it will take the access Modifier same as class
	// Super keyword must be on the first line of the Constructor block
	int rollno;
	String name;
	
	
public Constructor(int rollno, String name)// pending
 {
	// this keyword is used for refrence varibale
	
	 System.out.println("HI");
	 this.name=name;
	 this.rollno=rollno;
	
	
	
}	
public static void main(String[] args) {
	
	// We have to create an object for constructor
	
	// Classname objename = new Classname()
	Constructor obj1 = new Constructor(1,"usha");
	Constructor obj2 = new Constructor(2,"Jeevan");
	
	System.out.println(obj1.rollno+" "+obj1.name);
	System.out.println(obj2.rollno+" "+obj2.name);
	  
}	
 
	}
	
	
	


