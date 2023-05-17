package Programs;

import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean bill= false;
        int sum=0;
        int Biryani=250,IceCream=70,Drinks=100,tiffin=60;
        String order="";
        
        do{
            System.out.println("ITEM"+"\t\tPrice");
            System.out.println("1.Biryani"+"\t"+"250");
            System.out.println("2.IceCream"+"\t"+"70");
            System.out.println("3.Drinks"+"\t"+"100");
            System.out.println("4.tiffin"+"\t"+"60");
            System.out.println("5.bill"+"\n");
            
            System.out.println("select any item:");
            int choice=input.nextInt();
        
            
            switch(choice){
                case 1:System.out.println("Biryani"+"\n");
                        sum=sum+Biryani;
                        order=order.concat("Biryani"+"\n");
                        
                    break;
                case 2:
                    System.out.println("IceCream");
                    sum=sum+IceCream;
                    order=order.concat("IceCream"+"\n");
                    
                       break;
                case 3:
                    System.out.println("Drinks");
                    sum=sum+Drinks;
                    order=order.concat("Drinks"+"\n");
                      break;
                case 4:
                    System.out.println("tiffin");
                    sum=sum+tiffin;
                    order=order.concat("tiffin"+"\n");
                    break;
                case 5:
                     bill=true;
                     
                    break;
                default:
                    System.out.println("Wrong input");
            }
        
        }while(!bill);
       
        System.out.println("Your Orders are:\n"+order);
        System.out.println("Your total bill="+sum);
        
         System.out.println("Thank you");
    
        
        
        
    
    }
}
