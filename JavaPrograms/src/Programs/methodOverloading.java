package Programs;

public class methodOverloading {
	 public static int Multiply (int a, int b)
	 {
	   return a*b;
	 }
	  public  static double Multiply (double d, double a)
	 {
	   return a*d;
	 }
	 public static void main(String [] args){
	 System.out.println(Multiply(2,4));
	 
	 System.out.println(Multiply(5.5,6.3));
	 }

}
