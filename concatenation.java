import java.util.*;
class concatenation{
public static void main(String args[])
{
int len1,len2,i;
System.out.println("Enter the first string");
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
System.out.println("Enter the next string");
String str2=sc.nextLine();
len1= str1.length();
len2=str2.length();

String new0= str1+str2;
System.out.println("the string is:"+new0);

}
}

