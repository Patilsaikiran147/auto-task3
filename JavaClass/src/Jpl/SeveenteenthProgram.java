package Jpl;

public class SeveenteenthProgram {

	public static void adder(String[] ar)
	{
		try
		{
		int n1=Integer.parseInt(ar[0]);
		int n2=Integer.parseInt(ar[1]);
		if(n1>0&&n2>0)
		{
			System.out.println("input is positive");
			int result=n1+n2;
			System.out.println(result);
		}
		else
		{
			System.out.println("error");
		}
		
		}
		catch(NumberFormatException e)
		{
			System.out.println(" error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeveenteenthProgram.adder(args);
		
	}

}
