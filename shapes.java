import java.util.*;
abstract class shape{
abstract void sides();
}

class rectangle extends shape{
 void sides(){
System.out.println("The no. of sides is 4");
}
}
class triangle extends shape{
void sides(){
System.out.println("The no. of sides is 3");
}
}
class hexagon extends shape{
void sides(){
System.out.println("The no. of sides is 6");
}}
class shapes{
public static void main(String args[])
{


rectangle rec1=new rectangle();
rec1.sides();

triangle rec2=new triangle();
rec2.sides();
hexagon rec3=new hexagon();
rec3.sides();
}
}
