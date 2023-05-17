package Jpl;

public class SeventhProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int n=Integer.parseInt(args[0]);
			if(n==0)
			{
				System.out.println("whole number");
			}
			else if(n>0)
			{
				System.out.println("positive number");
			}
			else
			{
				System.out.println("negative number");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("error");
		}
	}

}
