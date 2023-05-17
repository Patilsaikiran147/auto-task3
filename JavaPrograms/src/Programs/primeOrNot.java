package Programs;

import java.util.Scanner;

public class primeOrNot {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the value:");
				int n = sc.nextInt();
				int i, count=0;
				for(i=1;i<=n;i++) {
					if(n%i==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println("Given number "+n+" is prime");
				}
				else {
					System.out.println("given numbern "+n +" is not a prime");
				}
			}
}
