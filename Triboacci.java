import java.util.Scanner;

public class Triboacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to calculate");
        int q = sc.nextInt();
        Tri(q);
    }
    public static void Tri(int n)
    {
        int a=0,b=0,c=1,d=0,i=0;
        while(i<n)
        {
            System.out.println(b);
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            i++;
        }
    }
}
