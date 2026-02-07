import java.util.*;
public class Subject
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter english marks:");
        int english=sc.nextInt();
        System.out.println("enter science marks:");
        int science=sc.nextInt();
        System.out.println("enter physics marks:");
        int physics=sc.nextInt();
        int average=(english+science+physics)/3;
        System.out.println("average is:"+average);
        int total=science+english+physics;
        System.out.println("total marks is:"+total);



    }
        
    

}