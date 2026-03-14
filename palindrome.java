import java.util.*;
class PalindromeCheck
{
   public static void main(String args[])
   {
    System.out.println("enter a string:");
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String reversed="";
    for(int i=a.length()-1;i>=0;i--)
    {
        reversed +=a.charAt(i);
    }
    if(a.equals(reversed))
    {
        System.out.println("Is Palindrome");
    }
    else{
        System.out.println("not Palindrome");
    }
   }
}