package Programs;

public class missng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[] = {1,2,4,5,6};
			int num = 0;
			for(int i=0;i<a.length;i++) {
				 num = num + a[i];
			}
			int num1= 0;
			 for(int i=0;i<=6;i++) {
				 num1 = num1 + i;
			 }
			 int missing = num1 - num;
			 System.out.println(missing);
	}

}
