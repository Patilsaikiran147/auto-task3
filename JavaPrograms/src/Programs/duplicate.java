package Programs;

public class duplicate {

	public static void main(String[] args) {
		String str= "nagatulasideviguduri";
		char ch[]=str.toCharArray();
		for(int i=1;i<=ch.length-1;i++) {
			for(int j=i+1;j<=ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[j]+" ");
					break;
				}
			}
		}
	}

}
 