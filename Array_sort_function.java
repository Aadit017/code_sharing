import java.util.*;
class Array_sort_function
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter a no");
            a[i]=sc.next();
        }
        Arrays.sort(a);
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
             
        }
    }
}