import java.util.*;
public class Alphabetical_Order
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        String a[]= new String[5];
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextLine();
        }

        for (int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}