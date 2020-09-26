import java.util.*;
class Tribonacci_series_switch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1 for Triboncci Series");
        System.out.println("Enter 2 for a/b Series");
        int sw=sc.nextInt();
        switch(sw)
        {
            case 1:
            System.out.println("Enter the num of terms you want in Tribonacci: ");
            int x= sc.nextInt();
            System.out.println("Result of Tribonacci: ");
            Tri(x);
            break;

            case 2:
            System.out.println("Enter value for a: ");
            int a= sc.nextInt();
            System.out.println("Enter value for b: ");
            int b= sc.nextInt();
            System.out.println("Enter the num of terms you want in series: ");
            int n= sc.nextInt();

            double tot=0;
            int i=0, ap=2,bp=1;
            while(i<n)
            {
                double av=Math.pow(a,ap);
                ap=ap+2;

                double bv=Math.pow(b,bp);
                bp=bp+2;
                
                tot=tot+av/bv;
                i++;
            }
            System.out.println("Result of series is "+tot);
            break;
            
            default:
            System.out.println("You entered a wrong input");
            System.out.println("Enter 1 for Triboncci Series");
            System.out.println("Enter 2 for a/b Series");
        }
    }

    public static void Tri(int n)
    {
        int a=0,b=0,c=1,d=0,i=0;
        while(i<n)
        {
            System.out.println(b);
            d=a+b+c;            
            a=b;
            b=c;
            c=d;
            i++;

        }        
    }
}