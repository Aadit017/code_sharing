import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AdvancedStringManupilation
{
    public static void main(String [] args)
    {
        String test="mississippi";
        Pattern p=Pattern.compile("mi(.*)ppi");
        Matcher m=p.matcher(test);
        while(m.find())
        {
        System.out.println(m.group(1));
    }
    }
}