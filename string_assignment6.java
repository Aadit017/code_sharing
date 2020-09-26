import java.util.*;
class string_assignment6
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
                System.out.print(Character.toUpperCase(a.charAt(i+1))+".");
            }
        }
    }
}