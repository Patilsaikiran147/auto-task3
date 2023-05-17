package Programs;

public class classss {
	public static void main(String[] args)
    {
        String str="ojas innovative technologies pvt ltd";
        String words[]=str.split(" ");
        String newstring="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String reverseword="";
            for(int j=word.length()-1;j>=0;j--)
            {
                reverseword=reverseword+word.charAt(j);
            }
            newstring=newstring+reverseword+" ";
        }
        System.out.println(newstring);

 

    }
}
