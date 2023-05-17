package Patterns;

public class Pattern7 {
	//out put
//	2 4 6 8 10
//	12 14 16 18 20--- upto 100

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(k);
				k=k+2;
			}
			System.out.println();
		}
		

	}

}
