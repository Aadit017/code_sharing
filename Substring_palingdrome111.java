import java.util.*; //Used for getting user inputs
class Substring_palingdrome
{

     public static String longestPalindrome(String s) {
        if (s == null) //If nothing is given as input, nothing comes out
        {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) //Iterates till string length
        {
            int len1 = expandAroundCenter(s, i, i);//Palindrome with odd character
            int len2 = expandAroundCenter(s, i, i + 1);//Palindrome with even character
            int len = Math.max(len1, len2);
            if (len > end - start) 
            {
                start = i - (len - 1) / 2;//Gets the first position of the palindrome
                end = i + len / 2;//Gets the last position of the palindrome
            }//If len/2 or (len-1)/2 is a decimal, java rounds it to the lower value, i.e 10.5 becomes 10
        }
        return s.substring(start, end + 1);//Substring is an inbuilt function that returns a sub-string within a string in the indices from start to end+1 
    }

    public static int expandAroundCenter(String s, int left, int right) 
    {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) //Checks if characters on both sides are equal
        {            
            L--;
            R++;
        }
        return R - L - 1;//Explained in th photo
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);//Delcare a scanner to input a user-defined string
        System.out.print("Enter a string : ");
        String input = sc.nextLine();//Inputs a string when Enter is pressed
        String ans=longestPalindrome(input);
        System.out.println("Longest Palindrome : "+ans);
        System.out.println("Length : "+ans.length());//Gives the length of the answer
        sc.close();//Closes the scanner function
    }
}