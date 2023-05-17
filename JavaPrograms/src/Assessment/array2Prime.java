package Assessment;

import java.util.Scanner;

public class array2Prime {

	public static void main(String[] args) {
		
		int a[] = new int[100];
     	int count;
//		System.out.println("enter the values: ");
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<a.length;i++) {
//			a[i] = sc.nextInt();
//		}
		for(int i=2;i<a.length;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+"  ");
			}
		}
		  
	}

}
