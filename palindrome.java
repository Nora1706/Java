import java.util.*;
class palindrome
{
public static void main(String args[])
{
System.out.println("Enter the number to check:");
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int x=n;
int j=0,sum=0;
while(x!=0){
x=x/10;
j++;
}
System.out.println("The numberof digits is :"+j);
int a;
x=n;
while(x!=0)
{
a=x%10;
sum=sum*10+a;
x=x/10;
}
System.out.println(" "+sum);
if(sum==n){
System.out.println("The number is pallindrome");
}
else{
System.out.println("The number is not pallindrome");
}
}
}


