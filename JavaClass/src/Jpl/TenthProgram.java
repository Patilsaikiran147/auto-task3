package Jpl;

public class TenthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=Integer.parseInt(args[0]);
		int rev=0;
		while(no!=0)
		{
		int	rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		System.out.println(rev);
		if(no==rev)
		{
			System.out.println("true");
		}
	
		else 
		{
			System.out.println("false");
		}
	}

}
