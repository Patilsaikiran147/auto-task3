package Jpl;

public class EightProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
      if(n>0)
      {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
      }
      else if(n<=0)
      {
    	  System.out.println("error");
      }
      
	}

}
