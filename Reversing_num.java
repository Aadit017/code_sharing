import java.util.Scanner;

public class Reversing_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int n1=n, rev=0;
        while(n!=0)
        {
            int t=n%10;
            rev=(rev*10)+t;
            n=n/10;
        }
        System.out.println(rev);
    }
}
