 import java.util.*;
 class Pronic_number
 {
     public static void main (String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter any number");
         int n=sc.nextInt();
         int i=1,a=0;
         while(a<=n)
         {
           
           if (a==n)
           {
               System.out.println(n+" is a Pronic number");
           }
           
           a=i*(i+1);
           i++;  
         }
     }
 }
            