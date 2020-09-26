import java.util.*;
class FunctionOverloading
{
    public static void main(String args[])
    {
        //Scanner sc=new Scanner (System.in);
        //System.out.println("enter your choice");
         

    }

    public int sum(int a, int b)
    {
        int t=0;
        for (int i=a; i<=b;i++)
        {
            t=t+i;
        }
        return t;
    }

    public double sum(double n)
    {
        double t=1;
        double x=1;
        for (int i=1;i<=n;i++)
        {
            x=x+0.2;
            t=t+x;
        }
        return t;
    }

    public int sum(int n)
    {
        int tot=0;
        while(n>0)
        {
            int t=n%10;
            if(t%2==1)
            {
                tot=tot+t;
            }
            n=n/10;
        }
        return tot;
    }
}