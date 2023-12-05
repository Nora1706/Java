import java.util.*;
class nemploye
{
  String name;
  int age;
  int phone;
  String address;
  int salary;
  int printsalary(int salary){
  System.out.println("Salary:"+salary);
  return 1;
}
}

class officer extends nemploye{
String specialization;


}
class manager extends nemploye{

String department;
}


class employe{
public static void main(String args[]){
        Scanner sc=new Scanner();
        officer abc=new officer();
        manager gc=new manager();
        int officer1(String name1,int age1,int phone1,String address1){
        abc.name=name1;
        System.out.println(" "+abc.name);
        abc.age=age1;
        System.out.println(""+abc.age);
        abc.phone=phone1;
        System.out.println(""+abc.phone);
        abc.address=address1;
        System.out.println(""+abc.address);
        abc.salary=y;

         return 1;

}

int manager1(String name2,int age2,int phone2,String address2){
       gc.name=name2;
       System.out.println(" "+gc.name);
       gc.age=age2;
       System.out.println(""+gc.age);
       gc.phone=phone2;
       System.out.println(""+gc.phone);
       gc.address=address2;
       System.out.println(""+gc.address);
       gc.salary=j;


return 1;
}
System.out.println("Printing employee details:/n");
System.out.println("Printing officer details/n");
System.out.println("Enter the name:");
name=sc.nextLine();
System.out.println(" "+name);
System.out.println("Enter the age:");
age=sc.nextInt();
System.out.println(""+age);
System.out.println("Enter the phone number");
phone=sc.nextInt();
System.out.println(""+phone);
System.out.println("Enter the address");
address=sc.nextLine();
System.out.println(""+address);
System.out.println("Enter the salary");
int y=sc.nextInt();
officer1(name,age,phone,address);

System.out.println("Printing employee details:/n");
System.out.println("Printing manager deatils/n");
System.out.println("Enter the name:");
name=sc.nextLine();
System.out.println(" "+name);
System.out.println("Enter the age:");
age=sc.nextInt();
System.out.println(""+age);
System.out.println("Enter the phone number");
phone=sc.nextInt();
System.out.println(""+phone);
System.out.println("Enter the address");
address=sc.nextLine();
System.out.println(""+address);
System.out.println("Enter the salary");
int j=sc.nextInt();
manager1(name,age,phone,address);





}
}

