import java.util.*;

class StringMethods {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("String is: " + s);
        System.out.println("String length: " + s.length()); 
        System.out.println("Char at index 3: " + s.charAt(3)); 
        System.out.println("UPPER CASE: " + s.toUpperCase()); 
        System.out.println("Lower case: " + s.toLowerCase()); 
        System.out.println("Substring (1,5): " + s.substring(1, 5));
        System.out.println("Index of 'be': " + s.indexOf("be"));
        System.out.println("Equals to 'abhi': " + s.equals("abhi")); 
        System.out.println("Starts with 'hi': " + s.startsWith("hi")); 
        System.out.println("Ends with 'bye': " + s.endsWith("bye")); 
        System.out.println("Equals ignore case 'hi basha': " + s.equalsIgnoreCase("hi basha"));
        System.out.println("Compare to 'hi': " + s.compareTo("hi"));
    }
}