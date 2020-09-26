import java.util.*;
class print_words_backwards
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String str=sc.nextLine();
        String str1=str.trim();
        str1=str1+" ";
        int k=0,n=0;
        String w="";
        int l=str1.length();
        for(int i=0;i<l;i++)
        {
            char x=str1.charAt(i);
            if (x==' ')
            {
                k++;
            }
        }
        String a[]=new String[k];
        for(int i=0;i<l;i++)
        {
            char x=str1.charAt(i);
            if (x!=' ')
            {
                w=w+x;                
            }
            if (x==' ')
            {
                a[n]=w;
                n++;
                w="";
            }
        }
        
        for (int b=k-1;b>=0;b--)
        {
            System.out.println(a[b]);
        }
    }
}
        
       
            
            
            
            
            
            