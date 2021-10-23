package Practice.Programs;

public class Patter3 {
	public static void main(String[] args) {
		
		int i,rows=6;
		
		for(i=0;i<=rows-1;i++)
		{
		//i=1	
			for(int j=0;j<=i;j++)
				
			{
				//j=0==""
				System.out.print(" ");
			  
			}
			
			for(int k=0;k<=rows-i-1;k++)
			{
				
				// i=0 rows=6 k=0 j=0
				// 0<=6-0-2=4
				// 
				
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
			
		
	}
	

}
