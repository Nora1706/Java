import java.util.*;
class matrixadd
{
public static void main(String args[])
{

System.out.println("Enter the rows of the matrix");
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();
System.out.println("Enter the columns of the matrix");
int b= sc.nextInt();
int ar[][]=new int[a][b];
int br[][]=new int[a][b];
int sum[][]=new int[a][b];
System.out.println("Enter the first array");
int i,j;
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
 ar[i][j]=sc.nextInt();
}
}
System.out.println("Enter the secondarray");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
br[i][j]=sc.nextInt();
}
}
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
sum[i][j]=ar[i][j]+br[i][j];
}}
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.print("\t"+sum[i][j]);
}
System.out.print("\n");
}

}}


