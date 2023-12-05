import java.util.*;
class fibonocuii
{
 public static void main(String args[])
{
System.out.println("Enter the value for which fibonocuii is to be printed");
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int b=1,sum=0;
System.out.println("The fibonocuii series is:");
for(int i=0;i<n;i++)
{
if(i==0){
sum=0;
}
else{
int a;
a=b;
b=sum;
sum=a+b;}
System.out.print("  "+sum);

}
}
}

