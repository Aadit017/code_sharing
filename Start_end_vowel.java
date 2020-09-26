import java.util.*;
class Start_end_vowel
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Eneter a sentence");
        String str=sc.nextLine();
          
        String ar[]=wordSep(str);
        System.out.println(Arrays.toString(ar));        

        int len=ar.length;
        for(int i=0; i<len; i++)
        {
            char c=ar[i].charAt(0);
            char c1=ar[i].charAt(ar[i].length()-1);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                if (c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
                {                    
                    System.out.print(ar[i]+" ");
                }
            }
        }
    }

    public static String [] wordSep(String s)    
    {
        s=s+" ";
        int l= s.length(),k=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                k++;
            }
        }
        String w="";
        String a[]= new String[k];
        for(int i=0,j=0;i<l;i++)
        {
            char x=s.charAt(i);
            if(x==' ')
            {
                a[j]=w;
                j++;
                w="";
                continue;
            }
            w=w+x;
        }
        return a;
    }
}