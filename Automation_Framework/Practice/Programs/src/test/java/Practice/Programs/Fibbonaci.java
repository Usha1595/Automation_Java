package Practice.Programs;

public class Fibbonaci {
	
	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13
		
		// Prime number
		
		// * * * * *
		//  * * * *
		//   * * *
		//    * *
		//     *
		
		int f1=0;
		int f2=1;
		int f3;
		int n=8;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=0; i<n;i++)
		{
			
			f3=f1+f2;
			f1=f2;
			f2=f3;
			
			System.out.println(f3);
			
		}
		
		
			}

}
