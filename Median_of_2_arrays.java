import java.util.*;
class Median_of_2_arrays
{
    public static void main(String args[])
    {
        int a1[]={1,3};
        int a2[]={2};

        Arrays.sort(a1);
        Arrays.sort(a2);
        int a[]= new int[a1.length+a2.length];
        for(int i=0;i<a1.length;i++)   
        {
            a[i]=a1[i];            
        }
        for(int i=0,j=a1.length;i<a2.length;i++,j++)   
        {
            a[j]=a2[i];            
        }
        
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        if(a.length%2==0)
        {
            int n=a.length;
            double ans1=a[ (n / 2) -1 ];
            //System.out.println(ans1);
            double ans2=a[ (n / 2) ];
            //System.out.println(ans2);
            double ans=(ans1+ans2)/2;
            System.out.println("Median even: "+ans);
        }
        else
        {
            int n=a.length;
            double ans=a[((n+1)/2)-1];
            System.out.println("Median odd: "+ans);
        }
    }
}