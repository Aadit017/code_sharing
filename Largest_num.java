import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first num");
        double a=sc.nextDouble();
        System.out.println("Enter second num");
        double b=sc.nextDouble();
        System.out.println("Enter third num");
        double c=sc.nextDouble();
        double max=0, middle=0,least=0;

        if(a>b && a>c){
            max=a;
        } else if(b>a && b>c)
        {
            max=b;
        } else if (c>a && c>b)
        {
            max=c;
        }

        System.out.println(max+" is the largest num");
    }
}
