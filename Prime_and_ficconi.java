import java.util.*;
public class Prime_and_ficconi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        int n= sc.nextInt();
        switch(n)
        {
            case 1:            
            for (int i=2 ;i<1000 ; i++)
            {
                if (i==2 ||i==3||i==5||i==7)
                {
                    System.out.println(i);
                }
                if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
                {
                    System.out.println(i);
                }

            }
            break;
            case 2:
            int a=1,b=1,c=0;
            for (int i=0;i<64;i++)
            {
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
            break;
        }
    }
}