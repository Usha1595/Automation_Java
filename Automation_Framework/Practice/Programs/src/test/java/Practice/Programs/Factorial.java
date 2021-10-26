package Practice.Programs;

public class Factorial {
	
	public static void main(String[] args) {
		
		int number=4, fact=1;
		
		//4(3)(2)(1)
//		int factorial = number;
//		
//		
//		for( int i=(number-1);i>1;i--)
//		{
//			
//			// i= 4=3
//			//4*3=12= Factorial value
//			//i=2
//			
//			factorial= factorial*i;
//			System.out.println(factorial);
//		}
//		
		
//		for(int i=1;i<=number;i++)
//		{
//			//1<=4==true
//			
//			
//			fact =fact*i;
//			
//			//fact= 1*1;=1
//			//fact= 1*2;=2
//			//fact= 2*3=6
//			//fact=6*4=24
//			System.out.println("Factorial value is" +fact);
//			
//		}
		
		int i=1;
		
		while(i<=number)
		{
			fact =fact*i;
			System.out.println(fact);
			
			i++;
			
		}
		
		
		
		
	}

}
