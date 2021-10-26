package Practice.Programs;

public class Reversestring {
	public static void main(String[] args) {
		
	
	String s="Usha";
	
	System.out.println("length is:" +s.length());
	
	//u=0,s=1,h=2,a=3
	//a=-1,h=-2,s=-3,u=-4
	// String= lenght()
	//Array =length
	//ahsU

	for(int i=s.length()-1;i>=3;i--)
	{
		
		
		//s.length()-1
		//4-1=3=a
		//3-1=2=h
		//2-1=1=a
		//1-1=0=U
		
		System.out.println(s.charAt(i));
		
	}
	
	}	

}
