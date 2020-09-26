import java.util.Scanner;

public class Expo_x_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X variable");
        int x=sc.nextInt();
        System.out.println("Enter the counter");
        int n=sc.nextInt();
        double sum=1;
        for(int i=1;i<=n-1;i++)
        {
            sum=sum+(Math.pow(x,i));
        }
        System.out.println(sum);
    }
}
