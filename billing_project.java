
import java.util.Scanner;
class billing_project
{
     public static void main(String[] args) 
     {
     	System.out.println("--------------------------------------------------------------------------------");
     	System.out.println();
     	System.out.println("Simple Billing Project ");
     	System.out.println("--------------------------------------------------------------------------------");

     	System.out.println("Choose the items from the Menu :");
     	System.out.println("Press 1 : Parle-G Biscuits");
     	System.out.println("Press 2 : Amul Milk (1L)");
     	System.out.println("Press 3 : Dettol Soap");
     	System.out.println("Press 4 : Rice (1kg)");
     	System.out.println("Press 5 : Maggi Noodles");

     	System.out.println("Press 6 : Exit");

     	System.out.println("--------------------------------------------------------------------------------");
          	chooseOption();


     }

     public static void chooseOption()
     {
            Scanner sc =new Scanner(System.in);

            int totalBill=0;

            while(true)
            {
               System.out.print("Press the Option : ");
               int option=sc.nextInt();

               if(option==6)
               {
                    System.out.println("------------------------------------------------------");
                    System.out.println("Total Bill Amount :"+ totalBill );
                    System.out.println("Thank You For Using Billing System...");
                    System.out.println("------------------------------------------------------");
                    break;
               }

               System.out.print("Enter a Quantity : ");
               int quantity = sc.nextInt();
               int amount =0;

               switch(option)

              {
               case 1:
                    amount=10*quantity;
                    System.out.println("Selected:Parle-G Biscuits");
                    break;

               case 2:
                    amount=28*quantity;
                    System.out.println("Selected : Amul Milk (1L)");
                    break;

               case 3:
                    amount=45*quantity;
                    System.out.println("Selected:Dettol Soap");
                    break;

               case 4:
                    amount=60*quantity;
                    System.out.println("Selected:Rice (1kg)");
                    break;

               case 5:
                    amount=14*quantity;
                    System.out.println("Selected:Maggi Noodles");
                    break;

               default :
                    System.out.println("Invalid Option");
                    continue;// skip this iteration ;

               }

               System.out.println("Entered Quantity : " + quantity);
               System.out.println("Amount " + amount);
                System.out.println();


                totalBill+=amount;

            }

            sc.close();

     }

     
}

