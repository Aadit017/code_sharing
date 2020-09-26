import java.util.*;
class Isograms
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enetr a sentence");
        String s=sc.nextLine();

        int l=s.length();
        String a[]= word_separator(s,l);
        int len=a.length;

        for(int i=0;i<len;i++)
        {
            Boolean ans=isIsogram(a[i]);
            if(ans==true)
            {
                System.out.println(a[i].toUpperCase());
            }             
        }
    }

    public static Boolean isIsogram(String s)
    {
        int length=s.length();
        for(int i=0;i<length;i++)
        {
            char x =s.charAt(i);
            for (int j=i+1;j<length;j++)
            {
                char y=s.charAt(j);
                if(x==y)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static String[] word_separator(String str, int len)
    {
        int k=0;
        for (int i=0;i<len;i++)
        {            
            if(str.charAt(i)==' ')
            {
                k++;   
            }
        }
        String w="";
        String ar[] = new String [k];
        for (int i=0,j=0;i<len;i++)
        {
            char x=str.charAt(i);            
            if (x==' ')
            {
                ar[j]=w;
                j++;
                w="";
                continue;
            }
            w=w+x;
        }
        return ar;
    }
}