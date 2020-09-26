import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        String input="esbtzjaaijqkgmtaajpsdfiqtvxsgfvijpxrvxgfumsuprzlyvhclgkhccmcnquukivlpnjlfteljvykbddtrpmxzcrdqinsnlsteonhcegtkoszzonkwjevlasgjlcquzuhdmmkhfniozhuphcfkeobturbuoefhmtgcvhlsezvkpgfebbdbhiuwdcftenihseorykdguoqotqyscwymtjejpdzqepjkadtftzwebxwyuqwyeegwxhroaaymusddwnjkvsvrwwsmolmidoybsotaqufhepinkkxicvzrgbgsarmizugbvtzfxghkhthzpuetufqvigmyhmlsgfaaqmmlblxbqxpluhaawqkdluwfirfngbhdkjjyfsxglsnakskcbsyafqpwmwmoxjwlhjduayqyzmpkmrjhbqyhongfdxmuwaqgjkcpatgbrqdllbzodnrifvhcfvgbixbwywanivsdjnbrgskyifgvksadvgzzzuogzcukskjxbohofdimkmyqypyuexypwnjlrfpbtkqyngvxjcwvngmilgwbpcsseoywetatfjijsbcekaixvqreelnlmdonknmxerjjhvmqiztsgjkijjtcyetuygqgsikxctvpxrqtuhxreidhwcklkkjayvqdzqqapgdqaapefzjfngdvjsiiivnkfimqkkucltgavwlakcfyhnpgmqxgfyjziliyqhugphhjtlllgtlcsibfdktzhcfuallqlonbsgyyvvyarvaxmchtyrtkgekkmhejwvsuumhcfcyncgeqtltfmhtlsfswaqpmwpjwgvksvazhwyrzwhyjjdbphhjcmurdcgtbvpkhbkpirhysrpcrntetacyfvgjivhaxgpqhbjahruuejdmaghoaquhiafjqaionbrjbjksxaezosxqmncejjptcksnoq";
        String ans=longestPalindrome(input);
        System.out.println("INPUT: "+input);
        System.out.println(ans);
    }

    public static String longestPalindrome(String s) 
    {
        int len=s.length();         
        String paling="";
        for (int i=0;i<len;i++)
        {
            //int j=len;j>i;j--
            for(int j=i+1;j<=len;j++)
            {
                String sub=s.substring(i,j);
                if(isPalingdrome(sub))
                {
                    //System.out.println(sub+".............."+paling);
                    //System.out.println(paling.compareTo(sub));
                    if (sub.length()>=paling.length())
                    {
                        paling=sub;
                    }
                    if(sub.compareTo(paling)>0)
                    {
                        if(sub.length()>=paling.length())
                        {
                            paling=sub;
                        }
                    }

                }
            }
        }
        return paling;         
    }

    public static Boolean isPalingdrome(String s)
    {
        String s1=reversed(s);
        if (s1.equals(s))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public static String reversed(String s)
    {
        int l=s.length();
        String w="";
        for(int i=l-1;i>=0;i--)
        {
            w=w+s.charAt(i);
        }
        return w;
    }
}