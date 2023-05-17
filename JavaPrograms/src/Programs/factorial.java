package Programs;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact =1;
		int num  =4;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("factorial of "+num+" is "+fact);
	}

}
