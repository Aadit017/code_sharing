import java.util.*;
import java.io.*;
import java.lang.*;
public class Program
{
    static Scanner sc= new Scanner(System.in);

    public void Case_func(double l1,double b1)
    {
        System.out.println("\n p:-perimeter\n a:-area\n d:-length of diagonol");
        System.out.println("To calculate perimeter and area at the same time---enter 'pa' or 'ap'");
        String str=sc.next();
        while( !(str.contains("p") || str.contains("a")|| str.contains("d"))) 
        {
            System.out.println("\n p:-perimeter\n a:-area\n d:-length of diagonol");
            System.out.println("To calculate perimeter and area at the same time---enter 'pa' or 'ap'");
            str=sc.next();
        }

        if(str.indexOf('p')!=-1){
            double result = 2*(l1+b1);
            System.out.println("Perimeter: "+result);
        }
        if(str.indexOf('a')!=-1){
            double result =l1*b1;
            System.out.println("Area: "+result);
        }
        if(str.indexOf('d')!=-1){
            double result =Math.sqrt(l1*l1 + b1*b1);
            System.out.println("Length of Diagonal: "+result);
        }
    }

    public double[] inputLoop()
    {
        char flag='n';
        double a=0,b=0;
        while (flag=='n')
        {
            System.out.print("Enter the Length: ");
            a=sc.nextDouble();
            System.out.print("Enter the Breadth: ");
            b=sc.nextDouble();
            System.out.println("\n\n Length= "+a+"\t Breadth="+b);
            System.out.print("Are the vaues of length and breadth correct?  (y/n)  ");
            flag=sc.next().charAt(0);
        }
        double[] q={a,b};
        return q;
    }

    public static void main(String[] args)
    {
        Program obj= new Program();
        boolean again=true;
        while(again) 
        {
            double arr[] = obj.inputLoop();
            obj.Case_func(arr[0], arr[1]);
            System.out.print("Do you want to run the program again?  (y/n)  ");
            char p=sc.next().charAt(0);
            if (p=='n') again=false;
        }
    }
}