class pr1finalOverriding
	{

		final void show()
	 	{
		
		System.out.println("king of England");
		} 
	}
class Overeg extends pr1staticOverriding
	{ 
	/*@override*/
		final void show()
	 	{
		System.out.println("king of Norway");
		}
 	}
class staticOverrideegpr1	
	{ 
		public static void main(String Arg[])
	 		{
				pr1finalOverriding o1=new Overeg();
				o1.show();
			}
	}