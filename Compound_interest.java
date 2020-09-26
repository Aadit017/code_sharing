import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the deposit amount");
        double pri=sc.nextDouble();
        System.out.println("Enter the time in years");
        int time=sc.nextInt();
        double interest;

        if (time>5)
        {
            interest=0.1;
        } else if(pri<2000 && time>2){
            interest=0.05;
        } else if (pri>=2000 && pri<6000 && time>2)
        {
            interest=0.07;
        } else{
            interest=0.03;
        }
        double amt=Cal_CI(pri,interest,time);
        System.out.println("The amount compounded after "+time+" years at "+(interest*100)+"% at the base principal of Rs."+pri+" is Rs."+amt);
    }
    public static double Cal_CI(double principal,double interest, int time)
    {
        double amt=principal*Math.pow((1+interest),time);
        return Math.round(amt * 100.0) / 100.0;
    }
}
