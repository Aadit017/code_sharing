import java.util.Scanner;

public class Prime_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        boolean odd=Odd_or_even(num);
        boolean prime=Prime_check(num);
        if (odd) System.out.println("Number is odd");
        else System.out.println("Number is even");
        System.out.println("Number is Prime: "+prime);

    }
    public static boolean Odd_or_even(int num)// odd is true even is false
    {
        if(num%2==0)
        {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean Prime_check(int num)
    {
        if (num==2||num==3||num==5||num==7)
        {
            return false;
        }
        else if(num%2==0||num%3==0||num%5==0||num%7==0)
        {
            return false;
        } else {
            return true;
        }
    }
}
