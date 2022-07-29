class pr1OverloadFinal
	{

		final void add(int a,int b)
	 {
		int c=a+b;
		System.out.println("addition of integer:"+c);
	 }
	 final void add(float a,float b)
	 {
		float v=a+b;
		System.out.println("addition of float:"+v);
	
	 }
	 public static void main(String Arg[])
	 {
		pr1OverloadFinal o1=new pr1OverloadFinal();
		o1.add(5,9);
		o1.add(1.5f,6.8f);


		}
	}