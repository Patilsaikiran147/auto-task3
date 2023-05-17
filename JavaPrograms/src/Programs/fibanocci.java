package Programs;

public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n=10,firsttm=0,secondtm=1;
				for(int i=1;i<=n;i++) {
					System.out.print(firsttm+",");
					int nexttm = firsttm + secondtm;
					firsttm=secondtm;
					secondtm=nexttm;
					
				}
				System.out.println();
	}

}
