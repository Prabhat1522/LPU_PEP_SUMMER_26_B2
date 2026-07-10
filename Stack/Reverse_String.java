import java.util.*;
public class Reverse_String {
    public static void reverseString(String str) {
        Stack<String> st = new Stack<>();
        for(int i=0;i<str.length();i++) {
            String ans = "";
            while(i < str.length() && str.charAt(i) != ' ') {
                ans += str.charAt(i);
                i++;
            }
            st.push(ans);
        }
        while(!st.isEmpty()) {
            System.out.print(st.pop()+" ");
        }
    }
    public static void main(String args[]) {
        reverseString("Hello World!");
    }
}
