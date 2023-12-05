import java.util.*;
class garbage{
public static void main(String args[]){
long mem1,mem2,mem3;
Runtime r =Runtime.getRuntime();
mem3=r.totalMemory();
mem1=r.freeMemory();
System.out.println("Totalmemory is"+mem3);
System.out.println("Freespace is"+mem1);
r.gc();
int a=2;
int b=3;
mem2=r.freeMemory();
System.out.println("Freespace is"+mem2);



}
}
