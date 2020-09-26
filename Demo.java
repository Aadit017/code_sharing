import java.util.Scanner;

public class Demo {
    static int sum=0;
    public static void main(String[] args) {
    re(10);
    }
    public static void re(int n)
    {
        if (n>0) {
            System.out.println(n);
            sum=sum+n;
            System.out.println("    Sum="+sum);
            re(n-1);
        }
    }
}
