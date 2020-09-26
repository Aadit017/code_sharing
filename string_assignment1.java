import java.util.*;
class string_assignment1
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String a=sc.nextLine();
        int l=a.length();
        for(i=1;i<l;i=i+2)
        {
            System.out.println(a.charAt(i));
        }
    }
}