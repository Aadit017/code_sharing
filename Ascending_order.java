import java.util.*;

public class Ascending_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first num");
        int a=sc.nextInt();
        System.out.println("Enter second num");
        int b=sc.nextInt();
        System.out.println("Enter third num");
        int c=sc.nextInt();
         
        ascending(a,b,c);
    }
    public static void ascending(int a,int b,int c)
    {
        int arr []={a,b,c};
        int max=arr[0];
        int k=0;
        for (int i=0;i<3;i++)
        {
            if(arr[i]<max)
            {
                arr[k]=arr[i];
                k++;
                max=arr[i];
            }
        }
        System.out.println("Smallest number =" +arr[0]+"\nNext higher number= " +arr[1]+"\nHighest number = "+arr[2]);
    }
}
