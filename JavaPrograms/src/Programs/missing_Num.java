package Programs;

public class missing_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] ={1,2,4,5};
		int total =5;
		int exp = total * ((total+1)/2);
		int sum = 0;
		for(int i : num){
		        sum+= i;
			}
		System.out.println(exp - sum);
		}
	}


