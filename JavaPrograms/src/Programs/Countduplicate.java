package Programs;

public class Countduplicate {

	public static void main(String[] args) {
			String s = "kiran mam, kiran anthe";
			for(char ch='a';ch<='z';ch++) {
				int count=0;
				for(int i=0;i<=s.length()-1;i++) {
					 if(ch==s.charAt(i)) {
						 count++;
					 }
				}
				if(count>1) {
					System.out.println(ch+" is repeated "+ count+" times");
				}
				
			}
	}}