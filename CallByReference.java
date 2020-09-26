import java.util.Scanner;

public class CallByReference {
    int x,y;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        CallByReference obj= new CallByReference();
        obj.x=n1;
        obj.y=n2;


        System.out.println("------CALL BY VALUE--------");
        System.out.println("n1= "+n1+"  n2= "+n2);
        Value(n1,n2);
        System.out.println("n1= "+n1+"  n2= "+n2);

        System.out.println("------CALL BY REFERENCE--------");
        System.out.println("n1= "+obj.x+"  n2= "+obj.y);
        obj.Reference(obj);
        System.out.println("n1= "+obj.x+"  n2= "+obj.y);
    }
    public static void Value(int a,int b)
    {
        int q=a;
        a=b;
        b=q;
        System.out.println("In the CAll BY VALUE Func n1= "+a+"  n2= "+b);
    }

    public void Reference(CallByReference m)
    {
        int q=m.x;
        m.x=m.y;
        m.y=q;
        System.out.println("In the CALL BY REFERENCE Func n1= "+m.x+"  n2= "+m.y);
    }
}
