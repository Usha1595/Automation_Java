package Practice.Programs;

import java.util.ArrayList;

public class StringProgram2 {
	
	//String is sequence of charecter.
	
	public static void main(String[] args) {
		
		String first= "Java";
		System.out.println("First string"+" "+first);
		String obj ="tesing class program";
		String test ="   testprogram    ";
		String second= "program";
		String third="@gmail.com";
		char[] ch;
		String b[]= {"hello","hi"};
		
		// string Length
		
		System.out.println("Lenghth of word" + first.length());
		// array length
		System.out.println(b.length);
		
		// Join == concat
		 String joinedstring =first.concat(second);
		System.out.println("Concate" +" "+ joinedstring);
		
		// compare
		
		System.out.println("Comapre value is"+first.equals(second));
		
		//escape charecter
		
	String	exm= "this is the \"String\" class";
	
	System.out.println(exm);
	
	// immutable.
	
	first = first.concat("world");
	System.out.println("Immubtable"+" "+first);
	
	//Object creations
	
	String name = new String("usha");
	System.out.println(name);
	
	// join method
    String joinedchar= String.join(first,second,third);
    System.out.println(joinedchar);
    
    // contains
    
    System.out.println(joinedstring.contains("Java"));     
    // indexOf()
    
    System.out.println(first.indexOf('v'));
   // Char charecter at index 
    System.out.println(first.charAt(1));
    
    // Substring
    System.out.println(joinedstring.substring(4));
    System.out.println(joinedstring.substring(4, 8));

    
   /// to charArray
     ch=joinedstring.toCharArray();
    System.out.println(ch);
    
 // to lowercase
    // to uppercase
    // split
    //trim
    
    System.out.println(first.toLowerCase());
    System.out.println(second.toUpperCase());
    
    String[] result=obj.split(" ");
    for(String str : result)
    {
    	
    	System.out.println(str+ ", ");
    	break;
    }
    
    // trim will remove trailing(end space) and leading(starting) spaces
    System.out.println(test);
    System.out.println(test.trim());
 		// "   testprogram    "
		
		
		
	}
	

}
