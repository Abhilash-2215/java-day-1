public class Operators{
    public static void main(String args[]) {
        int a = 10;
        int b = 80;

        System.out.println("Arithmetic operators:");
        System.out.println("a+b: " + (a+b));
        System.out.println("a-b: " + (a-b));
        System.out.println("a*b: " + (a*b));
        System.out.println("a/b: " + (a/b));
        System.out.println("a%b: " + (a%b));

        System.out.println("\nRelational operators:");
        System.out.println("a==b: " + (a==b));
        System.out.println("a>=b: " + (a>=b));
        System.out.println("a<=b: " + (a<=b));
        System.out.println("a!=b: " + (a!=b));

        System.out.println("\nLogical operators:");
        System.out.println("(a>0 && b>0): " + (a>0 && b>0));
        System.out.println("(a>0 || b<0): " + (a>0 || b<0));

        int num = a+b;
        if(num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        System.out.println("\nAssignment operator:");
        int x = 90;
        System.out.println("Assigned value: " + x);

        System.out.println("\nUnary operators:");
        System.out.println("a++: " + (a++));
        System.out.println("++a: " + (++a));
        System.out.println("+a: " + (+a));
        System.out.println("-b: " + (-b));
        System.out.println("a--: " + (a--));
        System.out.println("--a: " + (--a));
    }
}