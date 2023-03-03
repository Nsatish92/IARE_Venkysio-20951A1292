import java.util.*;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String p = reverse(s);
        System.out.println("Reversed string is: " + p);
    }

    public static String reverse(String s) {
        if (s.length()<=1) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}
