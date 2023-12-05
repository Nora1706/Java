import java.util.*;
class cses{
public static void main(String args[])
{
int i;
System.out.println("Enter a uppercase string");
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
System.out.println("Enter a lowercase string");
String str2=sc.nextLine();
int len1=str1.length();
int len2=str2.length();
for( i=0;i<len1;i++){
str1=str1.toLowerCase();
}
for(i=0;i<len2;i++){
str2=str2.toUpperCase();
}
for(i=0;i<len1;i++){
System.out.println(" string1 is :"+str1.charAt(i));
}
for(i=0;i<len2;i++){
System.out.println(" string2 is :"+str2.charAt(i));
}
}}
