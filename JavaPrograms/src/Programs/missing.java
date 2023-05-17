package Programs;

public class missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,3,2,4,6,7};
		int num1=0;
		for(int i=0; i<a.length;i++){
		       num1 = num1 + a[i];
			}
		int num2=0;
		for(int i=0;i<=7;i++){
			num2 = num2 + i;
			}
		int missing = num2 - num1;
		System.out.println(missing); 
	}

}
