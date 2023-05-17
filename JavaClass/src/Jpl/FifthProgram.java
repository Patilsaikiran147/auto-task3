package Jpl;

public class FifthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=Integer.parseInt(args[0]);
		try
		{
		
	String s=no%2==0?"true":"false";
		
	System.out.println(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("error");
		}
	
	}

}
