import java.util.*;
class binary
{
   
   public static void main(String args[])
      {  
         int n,i,a,mid;
         System.out.println("Enter the size of the array");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         System.out.println("Enter the elements of the array in a sorted manner\n");
         int ar[]=new int[n];
         for(i=0;i<n;i++){
         ar[i]=sc.nextInt(); 
         }
         System.out.println("Enter the element to be searched");
         a=sc.nextInt();
         int l=0,h=n-1;
         while(l<=h)
         {
           mid=(l+h)/2;
           
              
                if(ar[mid]==a)
                 {
                   System.out.println("The index is " +mid);
                   break;
                 }
                else if(ar[mid]<a)
                 {
                    l=mid+1;
                 }
                else 
                { 
                    h=mid-1;
                }
                     
       }
       
    } 
}

