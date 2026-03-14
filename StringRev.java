import java.util.*;

class StringRev {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        
       
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        
        System.out.println("Actual string is: " + s);
        System.out.println("Reversed string: " + rev);
    }
}