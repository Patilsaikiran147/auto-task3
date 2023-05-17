package Assessment;

public class jagged2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [4][];
		a[0]= new int[]{1};
		a[1]= new int[]{1,2};
		a[2]= new int[]{1,2,3};
		a[3]= new int[]{1,2,3,4};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		
			
		}
	}

}
