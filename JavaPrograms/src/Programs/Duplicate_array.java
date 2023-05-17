package Programs;

public class Duplicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char a[] = {'a','b','a','c','e','c','d'};
			for(char ch='a';ch<='z';ch++) {
				int count=0;
				for(int i=0;i<=a.length-1;i++) {
				if(ch==a[i]) {
					count++;
				}
				}
				if(count>1) {
					System.out.println(ch+" is repeated "+count);
				}
			}
	}

}

