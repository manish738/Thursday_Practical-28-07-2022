class pr1MainOverriding
	{

		public static void main(int a)
	 	{
		
		System.out.println(a);
		} 
	}
class Overeg extends pr1MainOverriding
	{ 
	/*@override*/
		public static void main(int a)
	 	{
		System.out.println("king of Norway" +a);
		}
 	}
class MainOverrideegpr1	
	{ 
		public static void main(String Arg[])
	 		{
				Overeg o1=new Overeg();
				Overeg.main(1);
			}
	}