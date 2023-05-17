//package Shiva_Java;
//
//import java.util.Scanner;
//
//public class Switch {
//	int add(int fno,int sno)
//	{
//	 return fno+sno;
//	}
//	int sub(int fno,int sno)
//	{
//	 return fno-sno;
//	}
//	int mul(int fno,int sno)
//	{
//	return fno*sno;
//	}
//	 public static void main(String[] args) {
//	
// Switch demoImpl=new Switch();
//	 while(true)
//	 {
//	System.out.println("-----------------------------------");
//	System.out.println("      1)ADD                        ");
//	System.out.println("      2)SUB                        ");
//	System.out.println("      3)MUL                        ");
//	System.out.println("      4)EXIT                        ");
//	System.out.println("-----------------------------------");
//	System.out.println("Enter The Choice");
//	Scanner sc=new Scanner(System.in);
//	int choice=sc.nextInt();
//	int fno;
//	int sno;
//	int result;
//	switch(choice)
//	{
//	case 1:
//	 System.out.println("Enter First Number ");
//	 fno=sc.nextInt();
//	 System.out.println("Enter Second Number ");
//	 sno=sc.nextInt();
//	 result=demoImpl.add(fno, sno);
//	 System.out.println("Addtion of Two Numbers : "+result);
//	 break;
//	case 2:
//	 System.out.println("Enter First Number ");
//	 fno=sc.nextInt();
//	 System.out.println("Enter Second Number ");
//	 sno=sc.nextInt();
//	 result=demoImpl.sub(fno, sno);
//	 System.out.println("Subtraction of Two Numbers : "+result);
//	 break;
//	case 3:
//	 System.out.println("Enter First Number ");
//	 fno=sc.nextInt();
//	 System.out.println("Enter Second Number ");
//	 sno=sc.nextInt();
//	 result=demoImpl.mul(fno, sno);
//	 System.out.println("Multiplication of Two Numbers : "+result);
//	 break;
//	case 4:
//	 System.out.println(" Thx for using App! ");
//	 System.exit(0);
//	default:
//	System.out.println("Choose 1 to 4 Between");
//	} 
//	        }//end of while
//	    }
//}
