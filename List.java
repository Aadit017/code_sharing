import java.util.*;
class List
{
    public static void main (String args[])
    {
        int n = 5; 

        ArrayList  arrli = new ArrayList (n); 
        for (int i=1; i<=n; i++) 
            arrli.add(i); 

        // Printing elements 
        System.out.println(arrli); 

        // Remove element at index 3 
        arrli.remove(3); 

        // Displaying ArrayList after deletion 
        System.out.println(arrli); 

        // Printing elements one by one 
        for (int i=0; i<arrli.size(); i++) 
            System.out.print(arrli.get(i)+" "); 
    }
}
