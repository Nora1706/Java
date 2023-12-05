import java.util.*;
class replacestring{
public static void main(String args[])
{
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println("enter the character for replacement");
char c= sc.next().charAt(0);
System.out.println("enter the character to be replaced");
char g=sc.next().charAt(0);
int strln=str.length();
for(int i=0;i<strln;i++){
if(str.charAt(i)==c){
str=str+g;
}
else{
str=str+str.charAt(i);
}
}
System.out.println("The replaced string is:"+str);
}
}
