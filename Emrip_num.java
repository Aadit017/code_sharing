import java.util.*;
class Emrip_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a num: ");
        int n=sc.nextInt();      
        int r=reversed(n);
        
        if (prime(n)==prime(r))
        {
            System.out.println("It is a emrip num");
        }
        else{
            System.out.println("It is a NOT emrip num");
        }
    }

    public static int reversed(int num)
    {
        int t=0;
        while (num>0)
        {
            int x=num%10;
            t=(t*10)+x;
            num=num/10;
        }
        return t;
    }

    public static boolean prime(int n)
    {
        if(n%2!=0&&n%3!=0&&n%5!=0&&n%7!=0)
        {
            return true;
        }
        else if (n==2||n==3||n==5||n==7)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}