import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total amount: ");
        int num = sc.nextInt();
        System.out.println("The Discounted Price= "+(num-(0.1*num)));
    }
}
