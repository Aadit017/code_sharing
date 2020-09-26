import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the counter");
        int n=sc.nextInt();
        double sum=1;
        for(int i=1;i<=n-1;i++)
        {
            sum+=1/fact(i);
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
