import java.util.Scanner;

public class DigitOrLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);

        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            System.out.println("It is a letter");
        }
        else if (c >= 48 && c <= 57) {
            System.out.println("It is a digit");
        }
    }
}
