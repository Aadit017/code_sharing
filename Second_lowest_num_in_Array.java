import java.util.*;
class Second_lowest_num_in_Array
{
    public static void main(String args[])
    {         
        int eg[]={199,33,54,85,12,32,66,13,14,99,96,52};
        System.out.println("The input array is: "+Arrays.toString(eg));
        int l[]= new int[2];
        l =lowest(eg);
        eg= remove_item(l[1],eg);
        l =lowest(eg);
        
        System.out.println("The second most smallest number is: "+l[0]);
    }
    
    public static int [] lowest(int a[])
    {
        int low=a[0];
        int index=0;
        for (int i=0; i<a.length;i++)
        {
            if(low>a[i])
            {
                low=a[i];
                index=i;
            }
        }
        int r[]={low,index};
        return r;
    }
    
    public static int [] remove_item(int ind,int ar[])
    {
        int len=ar.length;
        int s[]= new int[len-1];
        for(int i=0,k=0; i<len;i++)
        {
            if(i==ind)
            {
                continue;
            }
            s[k]=ar[i];
            k++;
        }
        return s;
    }
}