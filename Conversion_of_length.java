import java.util.Scanner;

//Write a class Convert with method that takes 04 arguments
// representing miles, yards, feet and inches and convert them to kilometers.
public class Conversion_of_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length in miles");
        double lm = sc.nextDouble();
        System.out.println("Enter Length yards");
        double ly = sc.nextDouble();
        System.out.println("Enter Length in feet");
        double lf = sc.nextDouble();
        System.out.println("Enter Length inches ");
        double li = sc.nextDouble();
        Convert(lm,ly,lf,li);
    }
    public static void Convert(double lm,double ly,double lf, double li){
        System.out.println("Length in Kilometers for miles: " + (1.60934 * lm));
        System.out.println("Length in Kilometers for yards: " +(0.0009144*ly));
        System.out.println("Length in Kilometers for feet: " +(0.0003048*lf));
        System.out.println("Length in Kilometers for inches: " +((0.0003048/12)*li));

    }
}
