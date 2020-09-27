import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
class Solution{
    public static void main (String args []){ 
        Scanner sc =new Scanner(System.in);
        var input=sc.nextLine();
        Pattern p =Pattern.compile(input,Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher("aadit singh bagga");
        boolean found=m.find();
        if (found){ 
            System.out.println("Match found");
        }else { 
            System.out.println(" not found ");
        }
    sc.close();    
    }
    }
