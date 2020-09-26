import java.util.*;
public class Linear_search_strings
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);      
        String a[]= new String[10];
        for(int i=0;i<a.length;i++)        
        {
            System.out.println("Enter a name");
            a[i]=sc.next();
        }
        System.out.println("Enter a name to find");
        String ser=sc.next();
        int flag=0,place=0;
        for(int i=0;i<a.length;i++)        
        {
            if(ser.equals(a[i]))
            {
                flag=1;
                place=i;
                break;
            }            
        }
        if (flag==1)
        {
            System.out.println("Found '"+ser+"' at "+place+" th place");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}