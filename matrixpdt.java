import java.util.*;
class matrixpdt
{
public static void main(String args[])
{

System.out.println("Enter the rows of the 1stmatrix");
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();
System.out.println("Enter the columns of the 1stmatrix");
int b= sc.nextInt();
System.out.println("Enter the rows of the 2ndmatrix");

int c= sc.nextInt();
System.out.println("Enter the columns of the 2ndmatrix");
int d= sc.nextInt();
int ar[][]=new int[a][b];
int br[][]=new int[c][d];
int pdt[][]=new int[b][d];
if(b==c){
System.out.println("Matrix multiplication possible");
System.out.println("Enter the first array");
int i,j,k;
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
 ar[i][j]=sc.nextInt();
}
}
System.out.println("Enter the second array");
for(i=0;i<c;i++)
{
for(j=0;j<d;j++)
{
br[i][j]=sc.nextInt();
}
}
for(i=0;i<b;i++)
{
for(j=0;j<d;j++)
{
for(k=0;k<a;k++)
{
pdt[i][j]=ar[i][j]*br[i][j];
}}}
for(i=0;i<b;i++)
{
for(j=0;j<d;j++)
{
System.out.print(""+pdt[i][j]);
}
System.out.print("\n");
}
}



else{
System.out.println("Matrix multiplication is not possible");
}
}
}


