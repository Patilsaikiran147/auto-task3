package Programs;

public class separateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "sa@ik!1ran%01";
			StringBuffer sb = new StringBuffer();
			StringBuffer sb1 = new StringBuffer();
			StringBuffer sb2 = new StringBuffer();
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(Character.isAlphabetic(ch)) {
					sb.append(ch);
				}
				else if(Character.isDigit(ch)) {
					sb1.append(ch);
				}
				else {
					sb2.append(ch);
				}
			}
			System.out.println(sb+" "+sb1+" "+sb2);
	}

}
