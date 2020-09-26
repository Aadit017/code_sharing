import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius");
        int rad=sc.nextInt();
        System.out.println("Area="+(3.14*rad*rad));
        System.out.println("Perimeter="+(3.14*2*rad));
    }
}
