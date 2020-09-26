import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second num");
        int b = sc.nextInt();
        int hcf=HCF(a,b);
        System.out.println("HCF = "+hcf);
        int lcm=(a*b)/hcf;
        System.out.println("LCM ="+lcm);
    }

    public static int HCF (int n1, int n2){
        int r;
        while(n2 != 0)
        {
            r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        return n1;
    }
}
