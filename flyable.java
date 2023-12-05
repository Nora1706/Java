import java.util.*;
interface fly{
public void fly_obj();
}
class spacecraft implements fly
{
        public void fly_obj()
           {
             System.out.println("It is a spacecraft");
           }
}
class airplane implements fly
{
        public void fly_obj()
           {
             System.out.println("It is a airplane");
           }
}
class helicopter implements fly
{
        public void fly_obj()
           {
             System.out.println("It is a helicopter");
           }
}
class flyable
{
    public static void main(String args[]) 
    {
      spacecraft obj1=new spacecraft();
      airplane obj2=new airplane();
      helicopter obj3=new helicopter();
      obj1.fly_obj();
      obj2.fly_obj();
      obj3.fly_obj();
      flyable fly=new flyable();
      /*fly.fly_obj();
      */

}}


