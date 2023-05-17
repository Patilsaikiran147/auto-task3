package Programs;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ojas",Reverse =" ";
		char ch[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			Reverse = Reverse + ch[i];
		}
		System.out.println(Reverse);
	}

}
