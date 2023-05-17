package Assessment;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]=new int[5];
			System.out.println("enter the values");
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<a.length;++i) {
			     a[i] = sc.nextInt();
			     System.out.println(a[i]);
	}

}
}
