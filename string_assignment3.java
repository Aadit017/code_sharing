import java.util.*;
class string_assignment3 
{
    public static void main (String Args[])
    {
        Scanner ab= new Scanner(System.in);
        System.out.println("Please enter the sentence whose 'the' and 'and' you want to calculate");
        String s=ab.nextLine();
        s=s+" ";
        int and=0;
        int the=0;
        double l=s.length();
        char ch;
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='t')
            {
                i++;
                ch=s.charAt(i);
                if(ch=='h')

                {
                    i++;
                    ch=s.charAt(i);
                    if(ch=='e')
                    {
                        i++;
                        ch=s.charAt(i);
                        if(ch==' ')
                        {
                            
                            the++;
                            System.out.println("found the");
                        }
                    }   
                }
            }
            else
            {
                if(ch=='a')
                {
                    i++;
                    ch=s.charAt(i);
                    if(ch=='n')
                    {
                        i++;
                        ch=s.charAt(i);
                        if(ch=='d')
                        {
                            i++;
                            ch=s.charAt(i);
                            if(ch==' ')
                            {
                                and++;
                                System.out.println("found and");
                            }
                        }   
                    }
                }
            }
        }
        System.out.println("The number of'the's is "+the);
        System.out.println("The number of'and's is "+and);
    }
} 