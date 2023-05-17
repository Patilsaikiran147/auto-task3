package Assessment;

import java.util.Scanner;

public class multi_Dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];
		int sum=0;
		int sum1=0;
		int sum2=0;
		System.out.println("Enter the values: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
				System.out.print(a[i][j] + " ");
				sum+= a[0][j];
				sum1=a[0][0]+a[1][1]+a[2][2];
				sum2=a[0][2]+a[1][1]+a[2][0];
			
			}
			System.out.print("="+sum);
			System.out.println();
		}
		System.out.println("1st Diagonal="+sum1);
		System.out.println("2nd Diagonal="+sum2);
		
	}
}
