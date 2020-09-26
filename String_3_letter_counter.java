import java.util.*;
class String_3_letter_counter
{
    public static void main (String args[])
    {
        Scanner sc =new Scanner (System.in);
        String s=sc.nextLine();
        s=s+" ";
        int l=s.length();
        int n=0;
        for (int i=0; i<l; i++)
        {
            if(s.charAt(i)==' ')
            {
                n++;
            }
        }
        String a[]= new String [n];
        int k=0;
        String w="";
        for (int i=0; i<l; i++)
        {
            if(s.charAt(i)==' ')
            {
                a[k]=w;
                k++;
                w="";
                continue;
            }
            w=w+s.charAt(i);
            
        }
        
        for (int i=0 ; i<k ; i++)
        {
            int len=a[i].length();
            if(len==3)
            {
                System.out.println(a[i]);
            }
        }
    }
}