package Programs;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][] = new int[5][5]; 
		ar[1][2] = ar[2][3]= ar[2][2] =(char) 42; 
		for(int i=0;i<ar.length;i++) { 
			for(int j=0;j<ar.length;j++) { 
				if(ar[i][j]==ar[1][2] || ar[i][j]==ar[2][3] || ar[i][j]==ar[2][2])  {
					System.out.print("*"); 
					}
                   System.out.print("\t");
					} System.out.println();
					}
	}

}
