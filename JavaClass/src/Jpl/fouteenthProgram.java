package Jpl;

public class fouteenthProgram {
	
	public  static void ispolindrome(int num)
	{
		//int num=Integer.parseInt(num[0]);
		try
		{
		int rev=0;
		while(num!=0)
		{
		int	rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println(rev);
		if(num==rev)
		{
			System.out.println("true");
		}
	
		else 
		{
			System.out.println("false");
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("error");
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=Integer.parseInt(args[0]);
		ispolindrome(num);
		
		
	}

}
