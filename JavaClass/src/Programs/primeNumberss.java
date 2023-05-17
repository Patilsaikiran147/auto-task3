package Programs;

public class primeNumberss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		for(i=1;i<=10;i++)
		{
			int count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" prime Numbers");
				
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
