import java.util.*;
class Demoninations_counter
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount:");
        int n =sc.nextInt();
        int a[]={2000,500,200,100,50,20,10,5,2,1};
        int r[]={0,0,0,0,0,0,0,0,0,0};
        for (int i=0; i<a.length; i++)
        {
            int k=0;
            while(a[i] <= n)
            {
                n=n-a[i];
                k++;
            }
            r[i]=k;
        }
        for (int i=0; i<a.length; i++)
        {
            if(r[i]==0)
            {
                continue;
            }
            System.out.println(a[i]+" Rupee note = "+r[i]);
        }
        
        
    }
}