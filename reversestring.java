import java.util.*;
class reversestring{
public static void main(String args[])
{
int i,start=0;
String rev="";
System.out.println("Enter a string");
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
int len1=str1.length();
int end=len1-1;
for(i=len1-1;i<=0;i--){
{
String ch=str1.charAt(i);
rev=rev+ch;}
Sytsem.out.println("The reversed string is :"+rev);
}
}
}


