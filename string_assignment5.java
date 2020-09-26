import java.util.*;
class string_assignment5
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String a=sc.nextLine();
        a=" "+a;
        int l=a.length();
        for(int i=0;i<l;i++)
        {
            ch=a.charAt(i);
            if(ch==' ')
            {
                System.out.println(a.charAt(i+1));
            }
        }
    }
}