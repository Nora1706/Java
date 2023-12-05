//inputing a number from user
import java.util.*;
class abc
{
public static void main(String args[])
{
 System.out.println("Enter the number:");
 Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
  {
   sum=sum+i;
  }
System.out.println("Sum:"+sum);
}
}
