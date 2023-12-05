import java.util.*;
class names{
String name;
names(){
name="unknown";
}
names(String x){
name=x;
}

public static void main(String args[]){
names s1=new names();
names s2=new names("tiuhg");
System.out.println(s1.name);
System.out.println(s2.name);
}
}
