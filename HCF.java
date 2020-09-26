import java.util.*;
class HCF
    {
        public static void main(String args[])throws Exception
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the First no : ");
            int n1=sc.nextInt();
            System.out.print("Enter the Second no : ");
            int n2=sc.nextInt();
            int r;
             
            while(n2 != 0)
            {
                r = n1 % n2;
                System.out.println(r);
                n1 = n2;
                System.out.println(n1);
                n2 = r;
                System.out.println(n2);
            }
            System.out.print("HCF = "+n1);
        }
    }