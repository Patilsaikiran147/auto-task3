package Programs;

import java.util.Scanner;

public class static_V {
	static Scanner input = new Scanner(System.in);
    static int reply;   

	    public static void startGame(){
	        System.out.println("How many players? 1 - 3.");
	        reply = input.nextInt();
	     //   int userinput = input.nextInt();
	    }
	    
	    public static void main(String[] args) {
	    	startGame();    
		    }
	}


