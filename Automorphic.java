




/* Write a Program in Java to input a number and check whether it is an Automorphic Number or not.

Note: An automorphic number is a number which is present in the last digit(s) of its square.
Example: 25 is an automorphic number as its square is 625 and 25 is present as the last digits. */
import java.util.*;
class Automorphic
{
  public static void main(String args[]) throws Exception
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : "); // Inputting the number
    int n = sc.nextInt();
    int sq = n*n; // Finding the square
    int c = 0, copy = n;
     
    // While loop for counting the number of digits in the number
    while(copy > 0)
    {
        c++;
        copy = copy/10;
    }
     
    /* Finding the end digits of the square. 
     * If the number has 2 digits, then we need to find last 2 digits of square 
     * i.e. do a 'sq % 100' operation
     */
    int end = sq % (int)Math.pow(10,c);
     
    if(n == end) // If the square ends with the number then it is Automorphic
        System.out.print(n+" is an Automorphic Number.");
    else
        System.out.print(n+" is not an Automorphic Number.");
    }
}
