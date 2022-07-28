
import java.util.StringTokenizer;
  
class StringTokenizerPr3
{  
	public static void main(String args[])
	{  
   		StringTokenizer st = new StringTokenizer("I am BIG GUY"," ");  
     		while (st.hasMoreTokens()) 
		{  
         			System.out.println(st.nextToken());  
     		}
		
		StringTokenizer st1 = new StringTokenizer("I am BIG GUY"," ");  
     		while (st1.hasMoreTokens()) 
		{  
         			System.out.println(st1.nextToken());  
     		}
		
		StringTokenizer st2 = new StringTokenizer("I,am,BIG,GUY");    
		System.out.println("Next token is : " + st2.nextToken(","));
	
		StringTokenizer st3 = new StringTokenizer("I am BIG GUY"," ");    
         		System.out.println("Total number of Tokens: "+st3.countTokens());

		StringTokenizer st4 = new StringTokenizer("I am BIG GUY"," ");    
     		while (st4.hasMoreElements())   
    		 {    
        			 System.out.println(st4.nextToken());    
    		 } 

	}  	

}  