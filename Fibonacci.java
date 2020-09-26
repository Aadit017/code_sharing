import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num of terms you want to calculate the fibonacci series");
        Series(sc.nextInt());
    }
    public static void Series(int n){
        int a=0,b=1,c=0;
        System.out.println(a);
        System.out.println(b);
        while (n>c) {
            c = a + b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
