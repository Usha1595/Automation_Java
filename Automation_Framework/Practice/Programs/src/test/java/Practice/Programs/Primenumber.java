package Practice.Programs;

public class Primenumber {
	
	public static void main(String[] args) {
		
		int num = 28, count=0;
		
		// Prime is divide by one and itself.
		
//		boolean flag =false;
//		
//		for(int i =2; i<=num/2;i++)
//			
//			if(num%i==0)
//			{
//				
//				flag = true;
//				break;
//			}
//			
//			if(!flag)
//			{
//				
//				System.out.println("Number is prime");
//			}
//			else
//				System.out.println("Not Prime");
			
//		for(int i =2; i<=num/2;i++)
//		
//			if(num%i==0)
//			{
//				System.out.println("Not prime");
//				break;
//			}
//			else
//			{
//				System.out.println("Prime");
//				break;
//			}
	
		 int i=2;
		  while(i<=num/2)
		  {
		
		  if(num%i==0)
			{
				count=1;
				break;
				
			}
		  	i++;
		  }
		  
		  if(count==0)
		  {
			  System.out.println("Prime");
			  
		  }
		  else
		  {
			  System.out.println("Not Prime");
		  }	
		
	}
	

}
