/*Question:
Write a Program in Java to input a number and check whether it is a Disarium Number or not.

Note: A number will be called DISARIUM if sum of its digits powered with their respective position is equal to the original number.

For example 135 is a DISARIUM
(Workings 1^1+3^2+5^3 = 135, some other DISARIUM are 89, 175, 518 etc)*/
import java.util.*;
class Disarium
{
     
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a;
        a=sc.nextInt();
        System.out.println();        
        int a1=a;
        int b= reversed(a);
        int n=1,sum=0;
        while(b>0)
        {
            int x=b%10;
            sum=sum+((int)Math.pow(x,n));
            n++;
            b=b/10;
        }
        System.out.println("the number after working: "+sum);
        if(sum==a1)
        {
            System.out.println("the number is disarium");
        }
        else
        {
            System.out.println("the number is not disarium");
        }
    }
    public static int reversed(int a)
    {
        int rev=0;
        while (a>0)
        {
           int x=a%10;
           rev= (rev*10)+x;
           a=a/10;
        }
        return rev;
    }
}

