package Practice.Programs;

class Ploymorphismprogram {

		
		public void test()
		{
			
			System.out.println("Hello this is test method");
		}
		
	}

class Methodoverride extends Ploymorphismprogram
	{
		public void test()
		{
			super.test();
			System.out.println("Hello this is mark method");
		}	
	
	}
	

