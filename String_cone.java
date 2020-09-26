import java.util.*;
public class String_cone
{
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.next();
        int l=s.length();
        for(int i=0; i<l; i++)
        {
            System.out.println(s.substring(0,i+1));
        }
        for(int i=l-1; i>0; i--)
        {
            System.out.println(s.substring(0,i));
        }
    }
}