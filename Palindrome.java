import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();
        int n1=num,reversedInteger=0;
        while(num>0 )
        {
            int r = num % 10;
            reversedInteger = reversedInteger * 10 + r;
            num= num/10;
        }
        if (n1 == reversedInteger)
            System.out.println(n1+" is a palindrome");
        else
            System.out.println(n1+" is not a palindrome");
    }
}