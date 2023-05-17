package Programs;

import java.util.HashMap;

public class ReverseString_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<Integer, Character> hs = new HashMap<Integer, Character>();
			String str ="ojas";
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				int key =i;
				hs.put(key,ch);
			}
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(hs.get(i)+"");
			}
			
	}

}
