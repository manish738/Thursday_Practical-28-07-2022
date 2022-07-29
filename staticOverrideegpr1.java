class pr1staticOverriding
	{

		static void show()
	 	{
		
		System.out.println("king of England");
		} 
	}
class Overeg extends pr1staticOverriding
	{ 
	/*@override*/
		static void show()
	 	{
		System.out.println("king of Norway");
		}
 	}
class staticOverrideegpr1	
	{ 
		public static void main(String Arg[])
	 		{
				pr1staticOverriding o1=new Overeg();
				o1.show();
			}
	}