package Programs;

public class palindrome {
public static void main(String[] args) {
	String str = "madam",reverse= "";
	char ch[]=str.toCharArray();
	for(int i=str.length()-1;i>=0;i--) {
		reverse = reverse + ch[i];
	}
		System.out.println(reverse);
	if(str.equals(reverse)) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("it not palindrome");
	}
}
}
