public class Alphabetical_order_array {
    public static void main(String[] args) {
        String ar[]={"arsray","goman","abort","tza"};
        for (int i=0;i< ar.length;i++)
        {
            int n=order_check(ar[i]);
            if (n==1)
            {
                System.out.println(ar[i]);
            }
        }
    }
    public static int order_check(String str)
    {
        char ca[]= str.toCharArray();
        char letter_array[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z'};
        int n=0;
        for(int i=0;i< ca.length-1;i++)
        {
            for (int j=0;j< letter_array.length-1;j++)
            {
                if (ca[i]==letter_array[j])
                {
                    if (ca[i+1]==letter_array[j+1])
                    {
                        n=1;
                    }
                }
            }
        }
        return n;
    }
}
