import java.util.*;
public class Swap1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter valueof a :");
        int a=sc.nextInt();
        System.out.println("enter valueof b :");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap a is:"+a);
        System.out.println("after swap b is:"+b);
    }
}