import java.util.*;
class Sorting_string
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word");
        String s1=sc.next();

        String s=s1.trim();        

        int l=s.length();
        char ar[]= new char[l];

        for (int i=0;i<l;i++)
        {
            char x=s.charAt(i);
            ar[i]=x;            
        }        
        Arrays.sort(ar);
        String f="";
        for (int i=0;i<l;i++)
        {
            f=f+ar[i];
        }
        System.out.println(f);
    }
}

