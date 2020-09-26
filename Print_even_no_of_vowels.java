


import java.util.*;
 
class Print_even_no_of_vowels
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        String s1=s.trim();
        s1=s1+" ";
        int l=s1.length();
        int n=0,k=0;
        String w="";
        for(int i=0;i<l;i++)
        {
            char x=s1.charAt(i);
            if(x==' ')
            {
                k++;
            }
        }
        String a[]=new String[k];
        for(int i=0;i<l;i++)
        {
            char x=s1.charAt(i);
            if(x!=' ')
            {
               w=w+x;  
            }
            if(x==' ')
            {
             a[n]=w;
             n++;
             w="";
            }
        }
              
        int R=0;
        for(int i=0;i<k;i++)
        {
            String b=a[i];
            int len=b.length();
            for (int j=0;j<len;j++)
            {
                char y= b.charAt(j);
                if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
                {
                    R++;
                    
                }
                        
            }
            if(R%2==0 && R!=0)
            {
                System.out.println(b);
                
            } 
            R=0;
        }
         
    }
}