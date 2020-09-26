import java.util.*;
class Piglatin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string:");
        String s= sc.next();
        
        int l= s.length();
        int index=0;         
        for (int i=0; i<l; i++)
        {
            char x=s.charAt(i);
            if (x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u')
            {
                index=i;
                break;
            }
        }
        String s1=s.substring(0,index);
        String s2=s.substring(index);
        String sf=s2+s1+"ay";
        System.out.println(sf);
    }
}
        

        
    