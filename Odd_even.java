import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range(n) :");
        int n=sc.nextInt();
        System.out.println("Enter the divisibility(m) :");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%m==0){
                String r=Odd_or_even(i);
                System.out.println(i+" is "+r+" and divisible by "+m);
            }
        }
    }
    public static String Odd_or_even(int num)
    {
        if(num%2==0)
        {
            return "Odd";
        }
        else {
            return "Even";
        }
    }
}
