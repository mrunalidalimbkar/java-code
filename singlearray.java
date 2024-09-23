import java.io.*;
import java.util.*;
class demo
{
    public static void main(String s[])
    {
      int a[]={10,20,40,5};
      System.out.println("list of even number from array");
    
      for(int i=0;i<=a.length;i++)
       {
          if(a[i]%2==0)
          {
             System.out.println("even no's"+a[i]);
           }
           else
           {
             System.out.println("odd no's"+a[i]);
           }
        }   
     }
}
