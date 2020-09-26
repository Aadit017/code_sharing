import java.util.Scanner;

public class X_series1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X variable");
        int x=sc.nextInt();
        System.out.println("Enter the counter");
        int n=sc.nextInt();
        double sum=x;
        for(int i=2;i<=n-1;i++)
        {
            if (i%2==0)
            {
                sum=sum-(Math.pow(x,i)/fact(i));
            } else{
                sum=sum+(Math.pow(x,i)/fact(i));
            }
        }
        System.out.println(sum);
    }
    public static int fact(int q)
    {
        int f=1;
        for(int i = 1; i <= q; ++i)
        {
            f=f*i;
        }
        return f;
    }
}
