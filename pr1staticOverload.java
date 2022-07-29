class pr1staticOverload
	{

		static void add(int a,int b)
	 {
		int c=a+b;
		System.out.println("addition of integer:"+c);
	 }
	 static void add(float a,float b)
	 {
		float v=a+b;
		System.out.println("addition of float:"+v);
	
	 }
	 public static void main(String Arg[])
	 {
		pr1staticOverload o1=new pr1staticOverload();
		pr1staticOverload.add(5,9);
		pr1staticOverload.add(1.5f,6.8f);


		}
	}