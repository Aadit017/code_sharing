import java.util.*;
public class sorting_2Arrays_simul
{
    public static void main (String args[])
    {
        String s[]={"Liam","Emma","Arsh","Nyrah","Dean"};
        int m[]=   {88,66,100,94,44};
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(m));
        for (int i=0;i<5;i++)
        {
            for (int j=i+1;j<5;j++)
            {
                if(m[i]<m[j])
                {
                    int q=m[j];
                    m[j]=m[i];
                    m[i]=q;
                    
                    String w=s[j];
                    s[j]=s[i];
                    s[i]=w;
                }                    
            }
        }
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(m));
    }
}
