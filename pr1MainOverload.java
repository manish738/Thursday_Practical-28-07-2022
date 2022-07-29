class pr1MainOverload
	{

		public static void add(int a,int b)
	 {
		int c=a+b;
		System.out.println("addition of integer:"+c);
	 }
	public static void add(float a,float b)
	 {
		float v=a+b;
		System.out.println("addition of float:"+v);
	
	 }
	 public static void main(String Arg[])
	 {
		pr1MainOverload o1=new pr1MainOverload();
		pr1MainOverload.add(5,9);
		pr1MainOverload.add(1.5f,6.8f);


		}
	}