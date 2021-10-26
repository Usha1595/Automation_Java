package Practice.Programs;

public class TestBoolean2 {
	public static void main(String[] args) {
		
		
		// continue need to check
		// looping through the for loop for interger
		// By using strings we can get the char at perticulat number


		String str[] = {"a","b","c","d","e","f"};

		int a=str.length;
		System.out.println(a);
		boolean bol1=true;
		boolean bol2=false;

		for(int i=0;i<a;i++)
		{
			System.out.println(i);
			if(i==1)
			{

				System.out.println(bol1);
				break;
			}
			else
			{
				System.out.println(bol2);
				
			}

		}


	}

}
