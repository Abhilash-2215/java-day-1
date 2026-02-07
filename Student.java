import java.util.Scanner;
public class Student
{
    public static void main(String args[])
    {
        String name="Abhi";
        int age=19;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of gthe student");
        int marks=sc.nextInt();
        if(marks>80)
        {    System.out.println("grade A");

            System.out.println("marks"+marks);
            System.out.println("pass");
        }
        else if(marks>50)
        {
            System.out.println("grade b");
            System.out.println("marks:"+marks);
            System.out.println("pass");

        }
        else{
            System.out.println("fail");
        }


    }
}