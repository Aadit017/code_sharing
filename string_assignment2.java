import java.util.*;
class string_assignment2
{
    public static void main(String args[])
    {
        char ch;
        int k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a=sc.nextLine();
        a=a+" ";
        int l=a.length();
       
        for(int i=0;i<l;i++)
        {
            ch=a.charAt(i);
            if(ch!=' ')
            {
                System.out.println(ch);
                k++;
            }
            if(ch==' ')
            {
                System.out.println("The size of the word is "+k);
                k=0;
                System.out.println();
            }
        }
    }
}