package Jpl;

public class SixthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try 
		{ 
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			 if(a<b) 
			  {
				  System.out.println(a);
			  }
			  else if(b<a)
			  {
				  System.out.println(b);
			  }
		}  
		catch (NumberFormatException e)  
		{ 
			System.out.println( " error"); 
		} 

	}

}
