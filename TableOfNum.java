import java.util.Scanner;

public class TableOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num=sc.nextInt();
        for (int i=0;i<11;i++)
        {
            System.out.println(i+" X "+num+" = "+(num*i));
        }
    }
}
