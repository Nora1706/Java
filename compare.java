// printing the greatest number
import java.util.*;
class compare
{
   public static void main(String arg[])
     {
        System.out.println("Enter the first no.");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        if(a>b)
        {
         System.out.println("A is greatest");
         }
         else if(a==b)
         {
          System.out.println("A is equal to B");
          }
        else{
         System.out.println("B is greatest");
            }
     }
}
