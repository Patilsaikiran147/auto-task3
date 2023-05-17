package Programs;

public class ssss {
	public static void main(String[] args) {

		String str = "madama", Reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			Reverse = Reverse + ch;
		}
		System.out.println(Reverse);
		if (Reverse.equals(str)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
