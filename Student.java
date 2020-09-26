import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks1");
        int m1=sc.nextInt();
        System.out.println("Enter Marks2");
        int m2=sc.nextInt();
        System.out.println("Enter Marks31");
        int m3=sc.nextInt();
        Display(m1,m2,m3);
    }
    public static void Display(int m1, int m2 ,int m3){
        System.out.println("Marks 1="+m1);
        System.out.println("Marks 2="+m2);
        System.out.println("Marks 3="+m3);
    }
}
