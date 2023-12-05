import java.util.*;
class pallindromestring{
public static void main(String args[])
{
String str;
String rev="";
char ch;
int len,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string for pallindrome checking");
str=sc.nextLine();
len=str.length();
for(i=len-1;i>=0;i--){
ch=str.charAt(i);
rev=rev+ch;
System.out.println("The reversed string id:"+rev);

if(str.equals(rev)){
System.out.println(rev+" is a pallindrome");
}
else{
System.out.println(rev+" is not a pallindrome");
}
}
}
}
