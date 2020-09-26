import java.util.*;
class string_assignment4
{
    public static void main(String args[])
    {
        String a="January 26 is celebrated as the Republic Day of India";
        String b=a.replace("January","August");
        String c=b.replace("2","1");
        String d=c.replace("6","5");
        String e=d.replace("Republic","Independence");
        System.out.println(e);
    }
}