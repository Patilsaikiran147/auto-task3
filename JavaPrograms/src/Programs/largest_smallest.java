package Programs;

public class largest_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1,2,3,4,5};
		int large = a[0];
		int small = a[0];
		for(int i=0; i<a.length ;i++){
		       if(a[i]>large){
		                  large = a[i];
		               //   large =a[i-1];
				}
		              else if(a[i]<small){
		                    small = a[i];
				}
	}
		System.out.println(large);
		System.out.println(small);

}}
